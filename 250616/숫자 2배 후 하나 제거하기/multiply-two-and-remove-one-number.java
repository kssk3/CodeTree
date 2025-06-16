import java.util.*;

public class Main {

    public static final int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = MIN;
        for(int i = 0; i < n; i++){
            arr[i] *= 2;

            for(int j = 0; j < n; j++){
                int[] brr = new int[n];
                int cnt = 0;

                for(int k = 0; k < n; k++){
                    if(j != k){
                        brr[cnt++] = arr[k];
                    }
                }

                int sum = 0;
                for(int k = 0; k < n - 2; k++){
                    sum += Math.abs(brr[k + 1] - brr[k]);
                }
                min = Math.min(min, sum);
            }
            arr[i] /= 2;
        }

        System.out.println(min);
    }
}