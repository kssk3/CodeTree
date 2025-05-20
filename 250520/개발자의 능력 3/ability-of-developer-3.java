import java.util.*;

public class Main {

    public static final int MAX = Integer.MAX_VALUE;

    public static int[] arr = new int[6];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            arr[i] = sc.nextInt();
        }

        int min = MAX; 
        for(int i = 0; i < 6; i++){
            for(int j = i + 1; j < 6; j++){
                for(int k = j + 1; k < 6; k++){
                    int getMin = getDiff(i, j, k);
                    min = Math.min(min, getMin);
                }
            }
        }
        System.out.println(min);

    }

    private static int getDiff(int a, int b, int c){
        int sum1 = arr[a] + arr[b] + arr[c];
        int sum2 = 0;
        for(int i = 0; i < 6; i++){
            sum2 += arr[i];
        }
        sum2 -= sum1;
        return Math.abs(sum2 - sum1);
    }
}