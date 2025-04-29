import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static int n;
    public static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr = new int[n][m];
        int x = 0, y = 0;
        arr[x][y] = 1;

        int dim = 0;
        for(int i = 2; i <= n * m; i++){
            int nx = x + dx[dim], ny = y + dy[dim];
            if(!inRange(nx,ny) || arr[nx][ny] != 0){
                dim = (dim + 1) % 4; 
            }

            x = x + dx[dim]; y = y + dy[dim];
            arr[x][y] = i;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int x, int y){
        return (0 <= x && x < n && 0 <= y && y < m);
    }
}