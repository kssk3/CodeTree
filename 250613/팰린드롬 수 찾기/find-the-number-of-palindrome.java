import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int cnt = 0;

        for(int i = x; i <= y; i++){
            String s = Integer.toString(i);
            StringBuilder sb = new StringBuilder(s);
            String reversed = sb.reverse().toString();

            if(s.equals(reversed))cnt++;
        }

        System.out.println(cnt);
    }
}