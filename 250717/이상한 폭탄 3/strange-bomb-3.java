import java.util.*;

public class Main {

    public static final int MAX = 1_000_001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] boom = new int[n];

        for(int i = 0; i < n; i++){
            boom[i] = sc.nextInt();
        }

        int[] arr = new int[MAX];    

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n && j - i <= k; j++){
                if(boom[i] == boom[j]){
                    arr[boom[i]] += 1;
                    break;
                }
            }
        }

        int maxCount = 0, ans = 0;
        for(int i = 0; i < MAX; i++){
            if(arr[i] > maxCount || (arr[i] == maxCount && ans < i)){
                maxCount = arr[i];
                ans = i;
            }
        }

        if(maxCount == 0)ans = 0;
        System.out.println(ans);
    }
}