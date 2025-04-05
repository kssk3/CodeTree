import java.util.*;

public class Main {

    public static int n;
    public static int m;

    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n+1];

        for(int i = 1; i <= n; i ++){
            arr[i] = sc.nextInt();
        }

        sumNumber(arr, sc);
    }

    public static void sumNumber(int[] arr, Scanner sc){
        for(int i = 0; i < m; i++){
            int sum = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j <= b; j++){
                sum += arr[j];
            }

            System.out.println(sum);
        }

    }
}