import java.util.*;

public class Main {

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int x;
    public static int y;

    public static int n;
    public static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2차 배열 크기 
        n = sc.nextInt();
        // 색칠하는 횟수 
        m = sc.nextInt();

        int[][] arr = new int[n + 1][n + 1];

        for(int i = 0; i < m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();

            arr[r][c] = 1;
            int cnt = 0;
            for(int j = 0; j < 4; j++){
                x = r + dx[j]; y = c + dy[j];
                if(isRange(x,y) && arr[x][y] == 1){cnt++;}
            }

            if(cnt != 3){
                System.out.println(0);
            }else{
                System.out.println(1);
            }
        }
    }

    public static boolean isRange(int x, int y){
        return (1 <= x && x < n + 1 && 1 <= y && y < n + 1);
    }
}