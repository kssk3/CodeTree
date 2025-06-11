import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int maxCount = 0;

        for(int k = 1; k <= 200; k++){
            int cnt = 0;

            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    if(k * 2 == arr[i] + arr[j])cnt++;
                }
            }

            maxCount = Math.max(maxCount, cnt);
        }

        System.out.println(maxCount);
    }
}