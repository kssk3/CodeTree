import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static char start = 'A';
    public static int dir = 0;
    
    public static int n;
    public static int m;

    public static int x = 0;
    public static int y = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        char[][] charArr = new char[n][m];

        charArr[x][y] = start;

        int count = 1;

        for(int i = 2; i <= n * m; i++){
            int nx = x + dx[dir], ny = y + dy[dir];
            if(!isRange(nx,ny) || charArr[nx][ny] != 0){
                dir = (dir + 1) % 4;
            }
            x += dx[dir];
            y += dy[dir];
            charArr[x][y] = (char)(start + count++);
            if(count == 26){count = 1;}
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(charArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isRange(int x, int y){
        return (0 <= x && x < n && 0 <= y && y < m);
    }
}