import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        int max = 0;
        int total = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
            total += arr[i];
        }

        int left = max;
        int right = total;
        int ans = total;
        while(left <= right){
            int mid = (left + right)/2;

            int sum = 0;
            int section = 1;
            for(int i = 0; i < n; i++){
                if(sum + arr[i] > mid){
                    sum = 0;
                    section++;
                }
                sum += arr[i];
            }

            if(section <= m){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println(ans);
    }
}