package jo.e.wssw.d.zanjatie2;

import java.util.Scanner;

public class z4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите зарплату 1 сотрудника");
        int Salary1 = scan.nextInt();
        System.out.println("Введите зарплату 2 сотрудника");
        int Salary2 = scan.nextInt();
        System.out.println("Введите зарплату 3 сотрудника");
        int Salary3 = scan.nextInt();
        int min, max;
        min = Salary1;
        max = Salary1;
        if (Salary1 > 0 && Salary2 > 0 && Salary3 > 0) {


            if (Salary2 > max) {
                max = Salary2;
            }
            if (Salary2 < min) {
                min = Salary2;
            }
            if (Salary3 > max) {
                max = Salary3;
            }
            if (Salary3 < min) {
                min = Salary3;
            }

            System.out.println("Разница между максимальной и минимальной зарплатой среди всех сотрудников = " + (max - min));
        }
        else {
            System.out.println("Вы ввели некорректное значение");
        }

    }

      }
