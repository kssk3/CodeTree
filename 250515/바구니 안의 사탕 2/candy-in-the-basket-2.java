import java.util.*;

public class Main {

    public static final int MAX = 201;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[MAX];
        int len = arr.length;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[b] = a;
        }

        int max = 0;
        for(int i = 1; i < len; i++){
            int a = Math.abs(i - k);
            int b = Math.abs(i + k);
            int sum = 0;
            if(!isRange(a,b)){continue;}
            for(int j = a; j <= b; j++){
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }

    private static boolean isRange(int n, int m){
        return (1 <= n && n < MAX && 1 <= m && m < MAX);
    }
}