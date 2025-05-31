import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    
        Arrays.sort(arr);

        int max = 0;
        for(int i = 0; i < n; i++){
            int total = m;
            int cnt = 0;
            for(int j = 0; j < n; j++){
                int a = arr[j];
                if(i == j)a /= 2;

                total -= a;
                // System.out.print(total + " ");
                if(total > 0)cnt++;
            }
            max = Math.max(max, cnt);
            // System.out.print(max + "\n");
        }
        System.out.println(max);
    }
}