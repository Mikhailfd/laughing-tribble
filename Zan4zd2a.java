package jo.e.wssw.d.zanjatie2.zanjatie4;

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
