import java.util.*;

public class Main {

    public static final int HEIGHT = 17;

    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        int plusCnt = 0;
        int minCnt = 0;

        for(int i = 1; i < 100; i++){
            if(max - min == HEIGHT){
                break;
            }

            if(max - min != HEIGHT){
                max -= 1;
                min += 1;
                plusCnt++;
                minCnt++;
            }
        }

        System.out.println((plusCnt * plusCnt) + (minCnt * minCnt));
    }
}