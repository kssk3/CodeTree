import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = -1;
        for(int i = 0; i < n - 1; i++){
            int max = 0;
            for(int j = i + 1; j <= i + k ; j++){
                if(j >= n)break;

                max = Math.max(arr[i], arr[j]);
                if(arr[i] == arr[j]){
                    ans = max;
                }
            }
        }

        System.out.println(ans);

    }
}