package project.group;
import java.util.Objects;
public class Store {
    private int idstore;

    private String nazvanie;
    private int idtovara;


    public Store(int idstore, String nazvanie, int idtovara) {
        this.idstore = idstore;
        this.nazvanie = nazvanie;
        this.idtovara=idtovara;
    }

    public Store(int idZakaza, int idClienta, int cena, int idTovara) {
    }

    public int getIdstore() {
        return idstore;
    }

    public void setIdStore(int idstore) {
        this.idstore=idstore;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setIdtovara(int idtovara) {
        this.idtovara =idtovara;
    }


    @Override
    public String toString() {
        return "Store{" +
                "idstore=" + idstore +
                ", Nazvanie='" + nazvanie + '\'' +
                ", idTovara=" + idtovara+
                '}';
    }
}
