import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
       System.out.println(convert(n));
    }
    static int convert(int n)
    {
        if (n == 0)
            return 0;
        else
            return (n % 2 + 10 * convert(n / 2));
    }
}
