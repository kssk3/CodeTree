import java.util.*;

public class Main {

    public static final int MAX = 100;
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static int[] x = new int[MAX];
    public static int[] y = new int[MAX];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int minDistance = INT_MAX;

        for(int i = 1; i < n - 1; i++){
            int distance = 0;
            int index = 0;
            for(int j = 1; j < n; j++){
                if(j == i){continue;}
                distance += Math.abs(x[index] - x[j]) + Math.abs(y[index] - y[j]);
                index = j;
            }
            minDistance = Math.min(distance, minDistance);
        }

        System.out.println(minDistance);
    }
}