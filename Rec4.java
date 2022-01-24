import java.util.Scanner;
//to replace a particular character in string with another character    abab (a with c) : cbcb
public class Rec4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str= s.next();
        char c1= s.next().charAt(0);
        char c2= s.next().charAt(0);
        System.out.println(changeChar(str,c1,c2));
    }
    static  String changeChar(String str,char c1,char c2){
        char a[]=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(a[i]==c1)
                a[i]=c2;
        }
        return String.valueOf(a);
    }
}
