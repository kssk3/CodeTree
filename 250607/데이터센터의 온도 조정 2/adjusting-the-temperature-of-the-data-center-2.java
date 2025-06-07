import java.util.*;

public class Main {

    public static int n;
    public static int C;
    public static int G;
    public static int H;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        C = sc.nextInt();
        G = sc.nextInt();
        H = sc.nextInt();

        int[] dx = new int[n];
        int[] dy = new int[n];
        for(int i = 0; i < n; i++){
            dx[i] = sc.nextInt();
            dy[i] = sc.nextInt();
        }

        int max = 0;
        for(int i = 0; i <= 1000; i++){
            int cost = 0;
            for(int j = 0; j < n; j++){
                cost += getCost(i, dx[j], dy[j]);
            }

            max = Math.max(max, cost);
        }

        System.out.println(max);
    }

    private static int getCost(int j, int dx, int dy){
        if(j < dx) return C;
        else if(dx <= j && j <= dy) return G;
        else return H;
    }
}