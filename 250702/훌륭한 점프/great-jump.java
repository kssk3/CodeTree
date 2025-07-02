import java.util.*;

public class Main {

    public static int n;
    public static int k;

    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int len = arr.length;

        int maxLen = Arrays.stream(arr).max().getAsInt();

        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= maxLen; i++){
            if(isPossible(i)){
                min = Math.min(min, i);
            }
        }

        System.out.println(min);
    }

     private static boolean isPossible(int maxVal){
        boolean[] canReach = new boolean[n];
        canReach[0] = (arr[0] <= maxVal); // 시작점 초기화
        
        for(int i = 0; i < n; i++){
            if(!canReach[i] || arr[i] > maxVal) continue;
            
            for(int j = i + 1; j <= Math.min(i + k, n - 1); j++){
                if(arr[j] <= maxVal){
                    canReach[j] = true;
                }
            }
        }
        
        return canReach[n-1]; 
    }
}