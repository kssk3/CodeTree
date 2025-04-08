import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(factorial(arr));

    }

    public static int factorial(int[] arr){
        int n = arr[0];

        for(int i = 1; i < arr.length; i++){
            n = lcm(n, arr[i]);
        }
        return  n;
    }
    
    private static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }

    private static int gcd(int x, int y){
        int len;
        while(y != 0){
            len = x % y;
            x = y;
            y = len;
        }
        return x;
    }
}