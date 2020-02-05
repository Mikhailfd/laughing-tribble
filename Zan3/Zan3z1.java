package jo.e.wssw.d.zanjatie2.zanjatie3;

public class Z1 {
    public static void main(String[] args){
        int mass[]=new int[100];
        System.out.println("Числа от 1 до 100, делящиеся на 3 и 7 одновременно:  ");
     for(int i=1; i<=mass.length; i++){
         if(i%3==0 && i%7==0){
         System.out.printf("%4d", i);
         }
     }
    }
}
