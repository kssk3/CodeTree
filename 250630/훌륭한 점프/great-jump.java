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
                break;
            }
        }

        System.out.println(min);
    }

    private static boolean isPossible(int a){
        int[] brr = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] >= a){brr[cnt++] = i;}
        }

        if(cnt == 0 || brr[0] != 0 || brr[cnt-1] != n-1) {
            return false;
        }

        for(int i = 1; i < cnt; i++){
            int dist = brr[i] - brr[i - 1];
            if(dist > k)return false;
        }
        return true;
    }

}