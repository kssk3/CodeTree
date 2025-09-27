import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int case1 = arr[n - 1] * arr[n -2] * arr[n - 3]; // + + +
        int case2 = arr[0] * arr[1] * arr[n - 1]; // - - +; 
        int case3 = arr[0] * arr[1] * arr[2];
        int ans = Math.max(case1, Math.max(case2, case3));
        System.out.println(ans);
    }
}