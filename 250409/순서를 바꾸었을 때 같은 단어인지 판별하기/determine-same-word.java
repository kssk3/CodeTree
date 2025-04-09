import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String strA = sc.next();
        String strB = sc.next();

        char[] charA = strA.toCharArray();
        char[] charB = strB.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);

        String sA = new String(charA);
        String sB = new String(charB);

        if(sA.equals(sB)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}