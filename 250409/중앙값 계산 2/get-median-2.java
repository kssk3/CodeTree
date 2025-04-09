import java.util.*;

public class Main {

    public static int n;

    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                Arrays.sort(arr,0,i);
                
                System.out.print(arr[i/2] + " ");
            }
        }
    }
}