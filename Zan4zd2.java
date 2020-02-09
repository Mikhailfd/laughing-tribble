package jo.e.wssw.d.zanjatie2.zanjatie4;

import java.util.Scanner;
public class Igrok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введедите координату x");
        int x=scan.nextInt();
        System.out.println("Введедите координату y");
        int y=scan.nextInt();
        Koordinati M = new Koordinati(x, y);
        System.out.println("Текущие координаты: x = " + M.getX() + ", у = " + M.getY());
        System.out.println("Введите сдвиг координаты x");
        int sd1=scan.nextInt();
        System.out.println("Введите сдвиг координаты y");
        int sd2=scan.nextInt();
        M.newX(sd1);
        M.newY(sd2);
        double S=Math.sqrt((Math.pow((M.getX()-x),2)+(Math.pow((M.getY()-y),2))));
        System.out.println("Новые координаты точки М: x = " + M.getX() + ", у = " + M.getY());
        System.out.println("Пройденное расстояние = " + S );
    }
}

public class Koordinati {
    private double x, y;
    Koordinati(double x1, double x2) {
        x = x1;
        y = x2;
    }
        double getX() {
            return x;
        }
    double getY() {
        return y;
    }
    void newX(double hX) {
        x = x + hX;
    }
    void newY(double hY) {
        y = y + hY;
    }
}
