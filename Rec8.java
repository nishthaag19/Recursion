import java.util.Scanner;
//to remove the entered character from the string
public class Rec8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        char c= sc.next().charAt(0);
        System.out.println(remove(s,c));
    }
    static String remove(String s, char c) {
        String a = "";
        if (s.length() == 0)
            return s;
        if (s.charAt(0) != c)
            a += s.charAt(0);
        String str = remove(s.substring(1),c);
          return a+str;
    }
}
