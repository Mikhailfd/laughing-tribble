package jo.e.wssw.d.zanjatie2;

import java.util.Scanner;

public class z6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите начальную сумму вклада");
        int startSum = scan.nextInt();
        System.out.println("Введите годовой процент");
        int proc = scan.nextInt();
        System.out.println("На какой год хотите узнать итоговую сумму?");
        int years=scan.nextInt();
   double sum=startSum;
        for(int n=1; n<=years; n++){
            sum+=((startSum*proc)/100)-(startSum*0.01);
        }
        System.out.println("Через " +  (years) + " лет сумма будет равна "+ (sum));

    }

    }

