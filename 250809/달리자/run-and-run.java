import java.util.*;

public class Main {

    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int[] arr = new int[n + 1];
        int[] brr = new int[n + 1];

        insertIndex(arr, sc);
        insertIndex(brr, sc);

        int[] crr = new int[n + 1];
        for(int i = 1; i <= n; i++){
            crr[i] = arr[i] - brr[i];
        }

        int ans = 0;
        for(int i = 1; i <= n; i++){
            if(crr[i] > 0 && crr[n] < 0){
                crr[n] = crr[n] - crr[i];
                ans += (n - i) * crr[i];
            }

            if(crr[i] == 0)continue;
        }

        System.out.println(ans);
    }

    private static void insertIndex(int[] arr, Scanner sc){
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
    }
}