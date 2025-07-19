import java.util.*;

public class Main {
    
    public static final int MAX = 100;

    public static final int HEIGHT = 17;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int low = 0; low <= MAX - HEIGHT; low++){
            int high = low + HEIGHT;
            int cost = 0;

            for(int j = 0; j < n; j++){
                if(arr[j] < low){
                    int diff = low - arr[j];
                    cost += diff * diff;
                }else if(high < arr[j]){
                    int diff = arr[j] - high;
                    cost += diff * diff;
                }
            }

            min = Math.min(min, cost);
        }

        System.out.println(min);
    }
}