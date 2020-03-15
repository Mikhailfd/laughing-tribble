package project.getmethod;

public class Clientinfo {

    private final String name;

    private final String adress;
 private final int idstore;

    public Clientinfo(String name, String adress, int idstore) {
        this.name = name;
        this.adress = adress;
        this.idstore=idstore;
    }

    public String getName() {
        return name;
    }

    public String getadress() {
        return adress;
    }
    public int getIdstore(){
        return idstore;
    }
}

