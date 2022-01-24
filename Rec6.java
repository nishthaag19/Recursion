//to check whether string is  palindrome or not recursively
import java.util.Scanner;
public class Rec6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str =s.next();
        System.out.println(palindrome(str,0,str.length()-1));
    }
    static boolean palindrome(String str,int start ,int end){
        if(start>=end)
            return true;
        else
            return ((str.charAt(start)==str.charAt(end)) &&( palindrome(str,start+1,end-1)));
    }
}
