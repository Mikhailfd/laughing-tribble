package jo.e.wssw.d.zanjatie2.zanjatie3;

public class Z1dop2 {
    public static void main(String[] args) {
        int mass[] = new int[100];
        System.out.println("Результат:  ");
        for (int i = 10; i <= mass.length; i++) {
            if((i/10)%2!=0)
            if (i % 3 == 0 && i % 7 != 0 || i % 3 != 0 && i % 7 == 0) {
                System.out.printf("%4d", i);

            }
        }
    }
}
