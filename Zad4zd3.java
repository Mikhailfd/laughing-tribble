package jo.e.wssw.d.zanjatie2.zanjatie4;

public class Magazin {

    public static void main(String[] args) {
        Otdel otdel = new Otdel("", "", "", "");
        Tovari tovari = new Tovari("Hleb", "Product", "Belarus", 1.5);
        Ludi ludi = new Ludi("", "", "", "");

        System.out.println(otdel);
        System.out.println(tovari);
        System.out.println(ludi);

    }
}

public class Otdel {
    private String texnichskii;
    private String productovii;
    private String mjasnoi;
    private String hozOtd;

    public Otdel( String texnichskii, String Productovii, String Mjasnoi, String hozOtd) {


        this.texnichskii = texnichskii;
        this.productovii = productovii;
        this.mjasnoi = mjasnoi;
        this.hozOtd=hozOtd;
    }
    public String getTexnichskii() {
        return texnichskii;
    }
    public void setTexnichskii(String texnichskii) {
        this.texnichskii= texnichskii;
    }
    public String getProductovii() {
     return productovii;
    }
    public void setProductovii(String productovii) {
        this.productovii= productovii;
    }
    public String getmjasnoi() {
        return mjasnoi;
    }
    public void setmjasnoi(String mjasnoi) {
        this.mjasnoi= mjasnoi;
    }
    public String gethozOtd() {
        return hozOtd;
    }
    public void sethozOtd(String hozOtd) {
        this.hozOtd= hozOtd;
    }
    @Override
    public String toString() {
        return "===================\n" +
                "Otdeli" +
                "\ntexnichskii " + texnichskii +
                "\nproductovii " + productovii  +
                "\nmjasnoi " + mjasnoi +
                "\nhozOtd  " + hozOtd  +
                "===================\n";
    }

}

public class Tovari {
    private String nazvanie;
    private String tip;
    private String proizvoditel;
    private double cena;
    public Tovari(String nazvanie, String tip, String proizvoditel, double cena){
        this.nazvanie=nazvanie;
        this.tip=tip;
        this.proizvoditel=proizvoditel;
        this.cena=cena;
    }
    public String getnazvanie() {
        return nazvanie;
    }
    public void setnazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }
    public String gettip() {
        return tip;
    }
    public void settip(String tip) {
        this.tip = tip;
    }
    public String getProizvoditel(){
        return proizvoditel;
    }
    public void setProizvoditel(String proizvoditel){
        this.proizvoditel=proizvoditel;
    }
    public double getcena(){
        return cena;
    }
    public void setcena(double cena){
        this.cena=cena;
    }
    @Override
    public String toString() {
        return "===================\n" +
                "Tovari" +
                "\nnazvanie: " + nazvanie +
                "\ntip: " + tip +
                "\nproizvoditel: " + proizvoditel  +
                "\ncena: " + cena  +
                "===================\n";
    }

}

package jo.e.wssw.d.zanjatie2.zanjatie4;

public class Ludi {
    private String pokupateli;
    private String prodovci;
    private String consultanti;
    private String administracija;
    public Ludi( String pokupateli, String productovii, String consultanti, String administracija) {
        this.pokupateli =pokupateli;
        this.prodovci= prodovci;
        this.consultanti = consultanti;
        this.administracija=administracija;
}
    public String getPokupateli() {
        return pokupateli;
    }
    public void setPokupateli(String pokupateli) {
        this.pokupateli= pokupateli;
    }
    public String getProductovii() {
        return prodovci;
    }
    public void setProductovii(String prodovci) {
        this.prodovci= prodovci;
    }
    public String getmjasnoi() {
       return   consultanti;
    }
    public void setmjasnoi(String mjasnoi) {
        this.consultanti= consultanti;
    }
    public String getAdministracija() {
        return administracija;
    }
    public void setAdministracija(String administracija) {
        this.administracija= administracija;
    }
    @Override
    public String toString() {
        return "===================\n" +
                "Tovari" +
                "\npokupateli " + pokupateli +
                "\nprodovci " + prodovci  +
                "\nprodovci " +prodovci  +
                "\nadministracija  " + administracija  +
                "===================\n";
    }
}

