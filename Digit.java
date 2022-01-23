import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("no of digits");
        System.out.println(count(n));
        System.out.println("sum of digits");
        System.out.println(Sum(n));
    }
    //sum of the digits
   static int Sum(int n){
        int s=0;
            if(n<10)
                return n;
            else if(n>9) {
                s = n % 10 + Sum(n / 10);
            }
            return s;
    }
    //count the digits
    static int count(int n){
        int c=1;
        if(n<10)
            return 1;
        else if(n>9) {
            c=count(n/10);
        }
        return c+1;
    }
}
