package jo.e.wssw.d.zanjatie2.zanjatie4;

public class Zdanie {
    public static void main(String[] args) {
        OpisanieDoma opisanieDoma = new OpisanieDoma(10, "Kirpich", 2010);
        Naznachenie naznachenie= new Naznachenie("", "", "", "");
        Adress adress=new Adress("Uruchskaja", 10);

        System.out.println(opisanieDoma);
        System.out.println(naznachenie);
        System.out.println(adress);




    }
}

