import java.util.*;

public class Main {

    public static int n;

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        int nx,ny;

        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                int cnt = 0;
                for(int i = 0; i < 4; i++){
                    nx = x + dx[i];
                    ny = y + dy[i];
                    if(inRange(nx,ny,n) && arr[nx][ny] == 1){
                        cnt++;
                    }
                }
                if(cnt >= 3){count++;}
            }
        }

        System.out.println(count);
    }
    public static boolean inRange(int x, int y, int n){
        return (0 <= x && x < n && 0 <= y && y < n);
    }
}