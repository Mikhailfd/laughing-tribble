package project.group;

import java.util.Objects;

public class Tovari {
    private int id;

    private String nazvanie;

    private int cena;

    public Tovari(int id, String nazvanie, int cena) {
        this.id = id;
        this.nazvanie = nazvanie;
        this.cena=cena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }


    public int getCena(){
        return cena;
    }
    public void setIdstore(int cena){
        this.cena=cena;
    }
    @Override
    public String toString() {
        return "Tovari{" +
                "id=" + id +
                ", nazvanie='" + nazvanie + '\'' +
                ", cena=" + cena+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       Tovari tovari = (Tovari) o;
        return id ==tovari.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
