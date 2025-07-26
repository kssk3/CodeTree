import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++){
            int[] brr = Arrays.copyOf(arr, n);
            Arrays.sort(brr);

            int cost = 0;
            for(int j = 0; j < n; j++){
                if(brr[j] != max && brr[j] != min)continue;

                if(brr[j] == max){
                    brr[j] = brr[j] - i;
                    cost += i;
                }

                if(brr[j] == min){
                    brr[j] = brr[j] + i;
                    cost += i;
                }
            }
            if(brr[n - 1] - brr[0] <= k){
                ans = Math.min(ans, cost);
            }
        }
        System.out.println(ans);
    }
}