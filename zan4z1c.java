package jo.e.wssw.d.zanjatie2.zanjatie4;

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


