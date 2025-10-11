import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int target = sum / n;

        // 2, 10, 7, 1
        // -3, +5, +2, -4
        
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += Math.abs(arr[i] - target);
        }

        System.out.println(ans / 2);

    }
}