import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int totalCount = 0;
        
        for(int i = 0; i < n; i++){
            int sum = 0;
            int cnt = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                cnt++;
                for(int k = i; k <= j; k++){
                    if(sum == arr[k] * cnt){
                        totalCount++;
                        break;}
                }
            }
        }
        System.out.println(totalCount);
    }
}