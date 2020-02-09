package jo.e.wssw.d.zanjatie2.zanjatie4;

public class Naznachenie {
    private String home;
    private String office;
    private String postroika;
    private String cotegge;
    public Naznachenie(String home, String office, String postroika, String cotegge){
        this.home = home;
        this.office = office;
        this.postroika = postroika;
        this.cotegge = cotegge;
    }
    public String getHome() {
        return home;
    }

    public void sethome(String home) {
        this.home = home;
    }
    public String getOffice(){
        return office;
    }
    public void setOffice(String office){
        this.office=office;
    }
    public String setpostroika(){
        return postroika;
    }
    public void getpostroika(String postroika){
        this.postroika=postroika;
    }
    public String setcotegee(){
        return cotegge;
    }
    public void getcotegee(String cotegge){
        this.cotegge=cotegge;

    }

    @Override
    public String toString() {
        return "===================\n" +
                "Nazhachenie" +
                "\nhome " + home +
                "\noffice " + office +
                "\npostroika " + postroika +
                "\ncotegge " + cotegge +
                "===================\n";
    }
}
