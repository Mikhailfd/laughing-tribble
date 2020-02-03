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
        else if(t<15)
        {
            System.out.println("Вам лучше одеть ветровку");
        }
        else if(t<20){
            System.out.println("Вам лучше одеть свитер");
        }
        
        else 
        {
            System.out.println("Майка");
        }
    }


    }
 
