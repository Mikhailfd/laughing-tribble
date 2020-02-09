package jo.e.wssw.d.zanjatie2.zanjatie4;

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

