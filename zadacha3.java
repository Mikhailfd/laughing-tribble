package jo.e.wssw.d.zanjatie2;
import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        System.out.println("Введите температуру в градусах цельсии");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        if(t<10)
        {
            System.out.println("Вам лучше одеть куртку");
        }
        else if(t>=10 && t<=15)
        {
            System.out.println("Вам лучше одеть ветровку");
        }
        else if(t>=16 && t<=20){
            System.out.println("Вам лучше одеть свитер");
        }
        else if(t>=21 && t<=30){
            System.out.println("Вам лучше одеть майку");
        }
        else if (t>30)
        {
            System.out.println("Вы хорошо одеты");
        }
    }


    }
 
