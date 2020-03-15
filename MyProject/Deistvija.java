package project.dialog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Deistvija {

    public static final String EXIT_CHAR = "e";
    private static final String Optii =
                    "1. Вывести список клиентов\n" +
                    "2. Добавить новых клиентов\n" +
                    "3. Удалить запись\n" +
                    EXIT_CHAR + ". exit\n";
    private static final String Optii1 =
            "1. Вывести список товаров\n" +
                    "2. Добавить новые товары\n" +
                    "3. Удалить запись\n" +
                    EXIT_CHAR + ". exit\n";
    private static final String Optii2 =
            "1. Вывести список заказов\n" +
                    "2. Добавить новый заказ\n" +
                    "3. Удалить заказ\n" +
                    EXIT_CHAR + ". exit\n";
    private static final String Optii3 =
            "1. Вывести список магазинов\n" +
                    "2. Добавить новые магазины\n" +
                    "3. Удалить запись\n" +
                    EXIT_CHAR + ". exit\n";
    private BufferedReader rdr;

    public Deistvija() {
        this.rdr = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getString() throws IOException {

        return rdr.readLine();
    }

    public int getInt() throws IOException, NumberFormatException {

        return Integer.parseInt(getString());
    }

    public void vivod() {

        System.out.println(Optii);
    }
    public void vivod1() {

        System.out.println(Optii1);
    }
    public void vivod2() {

        System.out.println(Optii2);
    }
    public void vivod3() {

        System.out.println(Optii3);
    }


}

