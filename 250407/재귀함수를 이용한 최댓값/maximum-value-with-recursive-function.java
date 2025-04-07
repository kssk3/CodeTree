import java.util.*;

public class Main {

    public static int[] arr;

    public static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findMax(n-1));
        
    }

    public static int findMax(int n){
        if(n == 0) return arr[0];

        return Math.max(findMax(n - 1), arr[n]);
    }

}