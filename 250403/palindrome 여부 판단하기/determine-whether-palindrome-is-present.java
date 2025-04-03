import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(palindrome(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static boolean palindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String s = sb.toString();
        
        return str.equals(s);
    }
}