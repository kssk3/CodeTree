import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n-1];

        for(int i = 0; i < n - 1; i++){
            arr[i] = sc.nextInt();
        }

        for(int start = 1; start <= n; start++){
            int[] brr = new int[n];
            boolean[] found = new boolean[n + 1];
            boolean result = true;

            brr[0] = start;
            for(int i = 1; i < n; i++){
               brr[i] = arr[i - 1] - brr[i - 1];
               if(brr[i] < 1 || brr[i] > n || found[brr[i]]){
                result = false;
                break;
               }

               found[brr[i]] = true;
            }
            
            if(result){
                for(int a : brr){
                    System.out.print(a + " ");
                }
                return;
            }
        }
    }
}