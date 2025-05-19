import java.util.*;

public class Main {

    public static final int MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 밭의 수
        int n = sc.nextInt();
        // 높이
        int h = sc.nextInt();
        // 연속 
        int t = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = MAX;

        for(int i = 0; i <= n - t; i++){
            int cost = 0;
            for(int j = i; j < i + t; j++){
                int num = Math.abs(arr[j] - h);
                cost += num;
            }

            min = Math.min(min, cost);
        }

        System.out.println(min);
    }
}

// for(int i = 0; i < n; i++){
//             for(int j = i; j < n; j++){
//                 int sum = 0;
//                 int cnt = 0;
//                 for(int k = i; k <= j; k++){
//                     int num = Math.abs(arr[k] - h);
//                     sum += num;
//                     cnt++;
                    
//                     if(cnt == t){
//                         min = Math.min(sum, min);
//                         break;
//                     }
//                 }
//             }
//         }