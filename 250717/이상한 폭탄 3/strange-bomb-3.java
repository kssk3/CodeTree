import java.util.*;

public class Main {

    public static final int MAX = 1_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] boom = new int[n];

        for(int i = 0; i < n; i++){
            boom[i] = sc.nextInt();
        }

        int[] arr = new int[MAX];

        int ans = 0;
        for(int i = 0; i < n; i++){
            int num = boom[i];
            boolean result = false;

            int cnt = 0;
            for(int j = i + 1; j < n; j++){
                if(num == boom[j] && j - i <= k){
                    result = true;
                    cnt++;
                }

                if(num != boom[j] || j - i > k){
                    continue;
                }
            }

            if(result){ans = num;}
        }

        System.out.println(ans);
    }
}