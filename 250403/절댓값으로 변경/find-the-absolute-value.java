import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        absoluteNumber(n, sc);
    }

    public static void absoluteNumber(int n, Scanner sc){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            System.out.print(Math.abs(arr[i]) + " ");
        }

    }
}