import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();

        int count = 0;

        for(int i = 0 ; i < len; i++){
            char a = s.charAt(i);
            if(a != '('){continue;}
            for(int j = i + 1; j < len; j++){
                char b = s.charAt(j);
                if(a == '(' && b == ')'){count++;}
            }   
        }

        System.out.println(count);
    }
}