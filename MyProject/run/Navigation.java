package project.run;
import java.io.IOException;
import project.getmethod.Clientinfo;
import project.getmethod.Storeinfo;
import project.getmethod.Tovarinfo;
import project.exceptions.NoSuchClientException;
import project.dialog.Deistvija;
import project.dialog.Svedenija;
import project.getmethod.Zakazinfo;

import java.sql.SQLException;
public class Navigation {

    private final Deistvija ioClienti;
    private final Deistvija ioTovari;
    private final Deistvija ioZakazi;
    private final Deistvija ioStore;
    private final Svedenija ioClientinfo;
    private final Svedenija ioTovarinfo;
    private final Svedenija ioZakaziinfo;
    private final Svedenija ioStoreinfo;



    public Navigation() {
        this.ioClienti = new Deistvija();
        this.ioClientinfo = new Svedenija();
        this.ioTovari=new Deistvija();
        this.ioTovarinfo=new Svedenija();
        this.ioZakazi=new Deistvija();
        this.ioZakaziinfo=new Svedenija();
        this.ioStore=new Deistvija();
        this.ioStoreinfo=new Svedenija();


    }

    public void start1() {

        String navigation1 = "";


        do {
            ioClienti.vivod();

            try {
               navigation1 = ioClienti.getString();


            } catch (IOException e) {
                System.err.println("ERROR: repeat enter");
            }


            switch (navigation1) {
                case "1":
                    try {
                        ioClientinfo.getAll().forEach(System.out::println);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "2":
                    try {
                        Clientinfo form = getClientinfoFromConsole();
                        ioClientinfo.saveNewClient(form);
                    } catch (IOException | NumberFormatException e) {
                        System.err.println("Repeat enter");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "3":
                    deleteClien();
                    break;
                case "e":
                    System.out.println("EXIT");
                    break;
                default:
                    System.err.println("Repeat enter");
                    break;
            }

        } while (!navigation1.equals(Deistvija.EXIT_CHAR));

    }
    public void start2() {

        String navigation2 = "";


        do {
            ioTovari.vivod1();

            try {
                navigation2 = ioTovari.getString();


            } catch (IOException e) {
                System.err.println("ERROR: repeat enter");
            }


            switch (navigation2) {
                case "1":
                    try {
                        ioTovarinfo.getAll1().forEach(System.out::println);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "2":
                    try {
                        Tovarinfo form1 = getTovarinfoFromConsole();
                        ioTovarinfo.saveNewTovari(form1);
                    } catch (IOException | NumberFormatException e) {
                        System.err.println("Repeat enter");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "3":
                    deleteTovar();
                    break;
                case "e":
                    System.out.println("EXIT");
                    break;
                default:
                    System.err.println("Repeat enter");
                    break;
            }

        } while (!navigation2.equals(Deistvija.EXIT_CHAR));
    }

    public void start3(){

        String navigation3 = "";


        do {
            ioZakazi.vivod2();

            try {
                navigation3 = ioZakazi.getString();


            } catch (IOException e) {
                System.err.println("ERROR: repeat enter");
            }


            switch (navigation3) {
                case "1":
                    try {
                        ioZakazi.getAll2().forEach(System.out::println);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "2":
                    try {
                        Zakazinfo form1 = getZakazinfoFromConsole()()();
                        ioZakazi.saveNewZakazi(form1);
                    } catch (IOException | NumberFormatException e) {
                        System.err.println("Repeat enter");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "3":
                    deleteZakaz();
                    break;
                case "e":
                    System.out.println("EXIT");
                    break;
                default:
                    System.err.println("Repeat enter");
                    break;
            }

        } while (!navigation3.equals(Deistvija.EXIT_CHAR));
    }
    public void start4(){
        String navigation4 = "";


        do {
            ioStore.vivod3();

            try {
                navigation4 = ioStore.getString();


            } catch (IOException e) {
                System.err.println("ERROR: repeat enter");
            }


            switch (navigation4) {
                case "1":
                    try {
                        ioStore.getAll3().forEach(System.out::println);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "2":
                    try {
                        Storeinfo form1 = getStorefoFromConsole()();
                        ioStore.saveNewStore(form1);
                    } catch (IOException | NumberFormatException e) {
                        System.err.println("Repeat enter");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "3":
                    deleteStore();
                    break;
                case "e":
                    System.out.println("EXIT");
                    break;
                default:
                    System.err.println("Repeat enter");
                    break;
            }

        } while (!navigation4.equals(Deistvija.EXIT_CHAR));

    }
    private Tovarinfo getTovarinfoFromConsole()  throws IOException, NumberFormatException {
        System.out.println("Введите наименование товара:");
        String name = ioTovari.getString();
        System.out.println("Введите цену товара:");
        int cena= ioTovari.getInt();
        System.out.println("Введите id товара");
        int id=ioTovari.getInt();
        return new Tovarinfo(name, cena, id);

    }
private Zakazinfo getZakazinfoFromConsole() throws IOException, NumberFormatException {
    System.out.println("Введите № заказа:");
    int idzakaza = ioZakazi.getInt();
    System.out.println("Введите id клиента:");
    int idclienta= ioZakazi.getInt();
    System.out.println("Укажите цену");
    int cena=ioZakazi.getInt();
    System.out.println("Введите id товара");
    int idtovara=ioZakazi.getInt();
    return new Zakazinfo(idzakaza, idclienta, cena,idtovara);
    }

    private Storeinfo getStorefoFromConsole() throws IOException, NumberFormatException {
        System.out.println("Введите id магазина:");
        int idStore = ioStore.getInt();
        System.out.println("Введите название магазина:");
        String nazvanie= ioStore.getString();
        System.out.println("Введите id товара");
        int idtovara=ioStore.getInt();

        return new Storeinfo(idStore, nazvanie,idtovara);
    }
    private Clientinfo getClientinfoFromConsole() throws IOException, NumberFormatException {

        System.out.println("Введите Фамилию клиента:");
        String name = ioClienti.getString();
        System.out.println("Введите адрес проживания:");
        String adress= ioClienti.getString();
        System.out.println("Введите Id магазина:");
        int idstore=ioClienti.getInt();
        return new Clientinfo(name, adress, idstore);

    }
    private void deleteClien() {
        System.out.println("Enter name:");
        try {
            String name = ioClienti.getString();
            ioClientinfo.deleteClientName(name);
        } catch (IOException e) {
            System.err.println("Повторите ввод");
        } catch (NoSuchClientException e) {
            System.err.println("Записей нет: " + e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
