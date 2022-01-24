import java.util.Scanner;
//
public class Rec5 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str=s.next();
        System.out.println(method(str));
    }
    static boolean method(String str){
        if(str.length()==0)
            return  true;
        if(str.charAt(0)!='a')
            return  false;
        if(str.length()>=3 &&"abb".equals(str.substring(0,3)))
            return method(str.substring(3));
        else
             return method(str.substring(1));
    }
}
