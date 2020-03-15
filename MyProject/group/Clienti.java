package project.group;
import java.util.Objects;

public class Clienti {
    private int id;

    private String name;

    private String adress;
    private int idstore;

    public Clienti(int id, String name, String adress, int idstore) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.idstore=idstore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
public int getIdstore(){
      return idstore;
}
public void setIdstore(int idstore){
        this.idstore=idstore;
}
    @Override
    public String toString() {
        return "Clienti{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress=" + adress +
                ", idstore=" + idstore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clienti clienti = (Clienti) o;
        return id == clienti.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
