import java.util.Scanner;
public class Rec2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x= s.nextInt();
        int y=s.nextInt();
        System.out.println(power(x,y));
    }
// power of x
    static int power(int x,int y){
        if(y==0)
            return 1;
        if(x==0)
            return 0;
        return x* power(x,y-1);
    }
}
