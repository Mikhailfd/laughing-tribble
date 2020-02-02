package jo.e.wssw.d.zanjatie2;

import java.util.Scanner;

public class z2 {
            public static void main(String[] args){
                int r;
                r=3;

                System.out.println("Длина окружности = " + 2*r*3.14);
                System.out.println("Площадь круга = " + 2*3.14*Math.pow(r,2));


                System.out.println("Введите радиус окружности");
                Scanner scan = new Scanner(System.in);
                int r1 = scan.nextInt();
                if(r1>0)
                {
                    System.out.println("Длина окружности = " + 2*r1*3.14);
                    System.out.println("Площадь круга = " + 2*3.14*Math.pow(r1,2));
            }
            else{
                 System.out.println("Вы ввели некорректное значение");
                }

            }
}
