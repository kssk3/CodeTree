import java.util.*;

public class Main {

    public static String strA;
    public static String strB;
    public static int count = -1;
    public static boolean result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        strA = sc.next();
        strB = sc.next();

        findLine(strA, strB);

        System.out.println(count);
    }

    private static void findLine(String strA, String strB){
        int cnt = 0;
        int lenA = strA.length();
        int lenB = strB.length();

        for(int i = 0; i <= lenA - lenB; i++){
            if(count > 0){
                break;
            }
            for(int j = 0; j < lenB; j++){
                if(strA.charAt(i+j) == strB.charAt(j)){
                    if(strA.charAt(i + (lenB - 1)) == strB.charAt(lenB - 1)){
                        count = i;
                        break;
                    }
                }else{ 
                    break;
                }
            }
        }
    }

}