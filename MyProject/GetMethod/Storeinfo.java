package project.getmethod;

public class Storeinfo {
    private final int idStore;
    private final String nazvanie;
    private final int idTovara;

    public Storeinfo(int idStore, String nazvanie, int idTovara) {
        this.idStore = idStore;
        this.nazvanie=nazvanie;
        this.idTovara=idTovara;
    }
    public int getIdStore(){
        return idStore;
    }
    public String getNazvanie(){
        return nazvanie;
    }
    public int getIdTovara(){
        return idTovara;
    }

}
