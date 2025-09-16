import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            min = Math.min(min, arr[i]);
        }

        int second = Integer.MAX_VALUE;
        for(int num : arr){
            if(num != min && num < second){
                second = num;
            }
        }

        int ans = -1, cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == second){
                cnt++;
                ans = i + 1;
            }
        }

        System.out.println(cnt == 1 ? ans : -1);
    }
}