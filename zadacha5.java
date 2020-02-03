package jo.e.wssw.d.zanjatie2;

import java.util.Scanner;

public class z5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scan.nextInt();
        System.out.println("Введите степень целого числа");
        int n = scan.nextInt();
        int result = a;

            for (int i = 1; i < n; ++i) {
                result *= a;

            }


        if (n > 0) {
            System.out.println("Результат: " + (result));
        } else {
            System.out.println("Степень должна быть положительной");
        }
    }
}
