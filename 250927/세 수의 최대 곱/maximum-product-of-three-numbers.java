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

        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    int num = arr[i] * arr[j] * arr[k];

                    if(ans == 0 && num < 0)ans = Math.min(ans, num);
                    if(ans == 0 && 0 < num)ans = Math.max(ans, num);
                    if(ans != 0 && (num <= 0 || num >= 0))ans = Math.max(ans, num);
                }
            }
        }

        System.out.println(ans);
    }
}