import java.util.*;

public class Main {

    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int[] arr = new int[n];
        int[] brr = new int[n];

        insertIndex(arr, sc);
        insertIndex(brr, sc);

        int[] crr = new int[n];
        for(int i = 0; i < n; i++){
            crr[i] = arr[i] - brr[i];
        }

        int ans = 0;
        int num = 0;
        for(int i = 0; i < n; i++){
            num += crr[i];
            ans += Math.abs(num);
        }

        System.out.println(ans);
    }

    private static void insertIndex(int[] arr, Scanner sc){
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
}