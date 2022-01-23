import java.util.Scanner;
public class Rec1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printdesc(n);
        System.out.println();
        printasc(n);
    }
    //print n to 1
   static int printdesc(int n){
        if(n==0)
            return 0;
       System.out.print(n+" ");
        return printdesc(n-1);
    }
    //print 1 to n
    static void  printasc(int n) {
        if (n <= 0)
            return;
        else if(n>0) {
            printasc(n - 1);
        }
            System.out.print(n+" ");
    }
}
