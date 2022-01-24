import java.util.Scanner;
public class Rec3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(Steps(n));
    }
   static int Steps(int n) {
        int s=1;
       if (n <= 0)
           return 0;
       else {
           s+=Steps(n - 3) + Steps(n - 2) + Steps(n - 1);
       }
       return s;
   }
}
