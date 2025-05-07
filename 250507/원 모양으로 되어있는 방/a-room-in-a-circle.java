import java.util.*;

public class Main {

    public static final int INT_MAX = Integer.MAX_VALUE;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] x = new int[n];

        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }

        int minDistacne = INT_MAX;

        for(int i = 0; i < n; i++){
            int distance = 0;
            for(int j = 0; j < n; j++){
                int dis = (i + j) % n;
                distance += x[dis] * j;
            }
            minDistacne = Math.min(distance, minDistacne);
        }

        System.out.println(minDistacne);

    }
}