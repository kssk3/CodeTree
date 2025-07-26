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
        for(int i = min; i <= max; i++){
            int a = i + k;
            if(a <= max){
                int cost = 0;
                for(int j = 0; j < n; j++){
                    if(arr[j] > a || arr[j] < i){
                        cost += Math.min(Math.abs(arr[j] - a), Math.abs(arr[j] - i));
                    }
                }
                if(cost < ans)ans = cost;
            }
        }

        System.out.println(ans);
    }
}