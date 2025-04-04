import java.util.*;

public class Main {

    public static String str;
    public static int len;
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        str = sc.next();

        validate(str);
    }

    private static void validate(String str){
        len = str.length();
        for(int i = 0; i < len - 1; i++){
            if(str.charAt(i) != str.charAt(i + 1)){
                count++;
            }
        }

        if(count >= 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}