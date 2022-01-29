import java.util.Scanner;
//to convert a string to integer using recursion
public class Conversion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s= sc.next();
        System.out.println(convert(s));
    }
    static int convert(String s){
        if(s.length()==1)
            return (s.charAt(0)-'0');
        double a=convert(s.substring(1));
        double b=s.charAt(0)-'0';
        b=b*Math.pow(10,s.length()-1)+a;
        return (int) (b);
    }
}
