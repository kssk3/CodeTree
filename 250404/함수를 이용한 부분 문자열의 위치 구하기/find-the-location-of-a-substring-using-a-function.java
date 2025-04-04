import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strA = sc.next();
        String strB = sc.next();
        System.out.println(findFirstIndex(strA, strB));
    }

    private static int findFirstIndex(String a, String b) {
        if (a.length() < b.length()) return -1;
        
        for (int i=0; i<=a.length()-b.length(); i++) {
            boolean isMatch = true;
            for (int j=0; j<b.length(); j++) {
                if (a.charAt(i+j) != b.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) return i;
        }
        return -1;
    }
}
