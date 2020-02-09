package jo.e.wssw.d.zanjatie2.zanjatie4;

public class Zdanie {
    public static void main(String[] args) {
        OpisanieDoma opisanieDoma = new OpisanieDoma(10, "Kirpich", 2010);
        Naznachenie naznachenie= new Naznachenie("", "", "", "");
        Adress adress=new Adress("Uruchskaja", 10);

        System.out.println(opisanieDoma);
        System.out.println(naznachenie);
        System.out.println(adress);


public class OpisanieDoma {


    private int koletajei;
    private String material;
    private int gotPostr;

    public OpisanieDoma(  int koletajei, String material, int gotPostr) {


        this.koletajei = koletajei;
        this.material = material;
        this.gotPostr = gotPostr;
    }



    public int getKoletajei() {
        return koletajei;
    }

    public void setKoletajei(String specialty) {
        this.koletajei = koletajei;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial() {
        this.material = material;
    }

    public int getGotPostr() {
        return gotPostr;
    }

    public void setGotPostr() {
        this.gotPostr = gotPostr;
    }


    @Override
    public String toString() {
        return "===================\n" +
                "Zdanie" +
                "\nkoletajei: " + koletajei +
                "\nmaterial: " + material +
                "\ngotPostr: " + gotPostr  +
                "===================\n";
    }
}

    }
}

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

public class Adress {
    private String ulica;
    private int nomerDoma;

    public Adress(String ulica, int nomerDoma){
        this.ulica = ulica;
        this.nomerDoma=nomerDoma;

    }
    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNomerDoma(){
        return nomerDoma;
    }
    public void getNomerDoma(int nomerDoma){
        this.nomerDoma=nomerDoma;

    }

    @Override
    public String toString() {
        return "===================\n" +
                "Adress" +
                "\nulica: " + ulica +
                "\nnomerDoma= " + nomerDoma +
                "===================\n";
    }
}

