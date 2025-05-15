import java.util.*;

public class Main {

    public static final int MAX = 101;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[MAX];

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[b] += a;
        }

        int max = 0;
        for(int i = 0; i <= 100; i++){
            int a = Math.max(0, i - k);
            int b = Math.min(100, i + k);
            int sum = 0;

            for(int j = a; j <= b; j++){
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}