import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n + 1];

        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for(int i = 1; i <= n; i++){
            int cnt = 0;

            int start = i;
            for(int j = 0; j < m; j++){
                if(arr[start] != i){
                    cnt += arr[start];
                    start = arr[start];
                }else{
                    cnt += arr[start];
                    start = arr[start];
                }
            }
            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }
}