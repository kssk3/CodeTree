import java.util.*;

public class Main {

    public static final int MAX = 10_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = 0;
        for(int i = 1; i <= MAX; i++){
            int cost = 0;

            for(int j = 0; j < n; j++){
                if(i <= arr[j] && arr[j] <= i + k)cost++;
            }
            max = Math.max(max, cost);
        }

        System.out.println(max);
    }
}