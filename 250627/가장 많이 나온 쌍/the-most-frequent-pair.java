import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] board = new int[n + 1][n + 1];
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int min = Math.min(a, b);
            int max = Math.max(a, b);
            board[min][max]++;
        }

        int max = 0;
        for(int i = 1; i <= n; i++){
            for(int j = i + 1; j <= n; j++){
                max = Math.max(max, board[i][j]);
            }
        }

        System.out.println(max);
    }
}