import java.util.*;

public class Main {

    public static final int MAX = 101;
    public static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[MAX];
        
        max = 0;
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        int total = 0;
        for(int i = 1; i <= n; i++){
            for(int j = i + 1; j <= n; j++){
                total += found(arr[i], arr[j]);
            }
        }
        System.out.println(total);
    }

    private static int found(int a, int b){
        int cnt = 0;
        for(int i = 1; i <= max; i++){
            int x = Math.abs(a - i);
            int y = Math.abs(b - i);
            if(x == y)cnt++;
        }
        return cnt;
    }
}