package project.getmethod;

public class Zakazinfo {
    private final int idZakaza;
    private final int idClienta;
    private final int idTovara;
    private final int cena;
    public Zakazinfo(int idZakaza, int idClienta, int idTovara, int cena) {
        this.idZakaza = idZakaza;
        this.idClienta=idClienta;
        this.idTovara=idTovara;
        this.cena = cena;

    }
    public String getIdzakaza(){
        return idZakaza;
    }
    public int getIdClienta(){
        return idClienta;
    }
    public int getIdTovara(){
        return idTovara;
    }
    public int getcena(){
        return cena;
    }

}

