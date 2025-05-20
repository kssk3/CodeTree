import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int cnt = 0;

        int q = 0;
        int w = 0;
        int e = 0;
        for(int i = 1; i <= n; i++){
            q = Math.abs(a - i);
            for(int j = 1; j <= n; j++){
                w = Math.abs(b - j);
                for(int k = 1; k <= n; k++){
                    e = Math.abs(c - k);
                    if(q > 2 && w > 2 && e > 2){continue;}
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}