package project.group;

import java.util.Objects;

public class Zakaz {
    private int idzakaza;

    private int idclienta;
    private int idtovara;
    private int cena;

    public Zakaz(int idzakaza, int idclienta, int cena, int idtovara) {
        this.idzakaza = idzakaza;
        this.idclienta = idclienta;
        this.cena=cena;
    }

    public int getIdzakaza() {
        return idzakaza;
    }

    public void setId(int idzakaza) {
        this.idzakaza = idzakaza;
    }

    public int getIdclienta() {
        return idclienta;
    }

    public void setIdclienta(int idclienta) {
        this.idclienta =idclienta;
    }


    public int getCena(){
        return cena;
    }
    public void setIdstore(int cena){
        this.cena=cena;
    }
    public int getIdtovara(){
        return idtovara;
    }
    public void setIdtovara(int idtovara){
        this.idtovara=idtovara;
    }
    @Override
    public String toString() {
        return "Zakaz{" +
                "idzakaza=" + idzakaza +
                ", idclienta='" + idclienta + '\'' +
                ", cena=" + cena+
                '}';
    }


}

