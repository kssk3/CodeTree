import java.util.*;

public class Main {

    public static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();

        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();

        int cnt = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    if((match(a1,i) && match(b1,j) && match(c1,k) ) ||
                     (match(a2, i) && match(b2, j) && match(c2, k))){
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);

    }

    private static boolean match(int a, int b){
        int diff = Math.abs(a - b);
        return (diff <= 2 || n - diff <= 2);
    }
}