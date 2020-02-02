public class Z1 {
    public static void main(String[] args){
        int i=11;
        int x=15;
        byte a=5;
        byte b=120;
        byte c=(byte)(a+b);
        char f1='d';
        char f2= 'z';
        char f=(char)(f1+f2);
        char v1=10;
        char v2=74;
        char v=(char)(v2-v1);
        short r1=-20000;
        short r2=5000;
        short r=(short)(r1/r2);
        long e1=50000;
        long e2=20000;
        int sum=(x+i)*2;
        System.out.println(sum);
        System.out.println(sum%7);
        System.out.println(sum==49);
        System.out.println(c);
        System.out.println((c*3)/10.0);
        System.out.println(f1);
        System.out.println(f);
        System.out.println(v);
        System.out.println(r);
        System.out.println(e1>e2);
        System.out.println(r1<r2 && r2>0 );
        System.out.println(x & i);
        System.out.println(i | x);
    }
}
