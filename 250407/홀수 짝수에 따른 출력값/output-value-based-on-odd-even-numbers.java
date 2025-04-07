import java.util.*;

public class Main {

    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        

    }

    public static int max(int n){
        if(n == 100) return n;

        int maxNum = 0;

        if(max(n - 1) > max(n - 2)){
            max = max(n-1);
            return max(n - 1);
        }
        if(max(n - 1) < max(n - 2)){
         return max(n - 2);
    }

}