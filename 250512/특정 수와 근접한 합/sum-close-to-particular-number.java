import java.util.*;

public class Main {

    public static final int MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n개의 수
        int n = sc.nextInt();
        // 특정 값
        int s = sc.nextInt();
        // 배열 크기 설정
        int[] arr = new int[n];
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int closed = MAX;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int curSum = sum - (arr[i] + arr[j]);
                int number = Math.abs(curSum - s);
                closed = Math.min(closed, number);
            }

        }
        System.out.println(closed);
    }
}