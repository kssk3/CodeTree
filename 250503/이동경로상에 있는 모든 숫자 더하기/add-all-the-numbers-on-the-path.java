import java.util.*;

public class Main {
    
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static int n;
    public static int t;
    public static int x;
    public static int y;

    public static int dir = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();
        String s = sc.next();

        int a = 3;
        int b = 3;

        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        x = n / 2;
        y = n / 2;

        int sum = arr[x][y];
        for(int i = 0; i < t; i++){
            char c = s.charAt(i);
            if(c == 'R' || c == 'L'){
                dir = getDirection(c);
                continue;
            }
            int nx = x + dx[dir], ny = y + dy[dir];
            if(!isRange(nx,ny)){
                continue;
            }
            x += dx[dir];
            y += dy[dir];
            sum += arr[x][y];
        }
        System.out.println(sum);
    }

    public static int getDirection(char input){
        if(input == 'L')return dir = (dir - 1 + 4) % 4;
        else return dir = (dir + 1) % 4;
    }

    public static boolean isRange(int x, int y){
        return (0 <= x && x < n && 0 <= y && y < n);
    }
}