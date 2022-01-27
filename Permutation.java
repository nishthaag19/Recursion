import java.util.Scanner;
//to print all permutations of a string
public class Permutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));
        String s=sc.next();
        method(" ",s);
    }
    static void method(String s1,String s){
        if(s.length()==0)
            System.out.println(s1);
        else
            for (int i = 0; i <s.length(); i++) {
                String str=s.substring(0,i) + s.substring(i+1);
                method(s1+s.charAt(i),str);
            }
    }
}