import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n * 2];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int maxSum = 0;
        for(int i = 0; i < n; i++){
            int currSum = arr[i] + arr[(2 * n) - 1 - i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }

        System.out.println(maxSum);
    }   
}