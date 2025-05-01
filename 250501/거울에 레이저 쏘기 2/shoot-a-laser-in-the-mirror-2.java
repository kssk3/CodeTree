import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static char[][] arr;
    public static int n;

    public static int positionX = 0;
    public static int positionY = 0;
    public static int dir = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new char[n][n];

        for(int i = 0; i < n; i++){
            String s = sc.next();
            for(int j = 0; j < n; j++){
                arr[i][j] = s.charAt(j);
            }
        }
        
        // 레이저 쏘는 위치
        int k = sc.nextInt(); // <= 4n 

        findPosition(n, k);

        int count = getCount(positionX,positionY,dir);

        System.out.println(count);
    }
    public static void findPosition(int n, int k){
        if(0 < k && k  <= n){positionX = 0; positionY = k - 1; dir = 1;}
        if(n < k && k <= n * 2){positionX = k - n - 1; positionY = n - 1; dir = 2;}
        if(n * 2 < k && k <= n * 3){positionX = n - 1; positionY = (3 * n) - k; dir = 3;}
        if(n * 3 < k && k <= n * 4){positionX = (4 * n) - k; positionY = 0; dir = 0;}
    }

    public static int getCount(int x, int y, int dir){
        int count = 0;

        while(true){
            if(isRange(x,y) && arr[x][y] == '\\'){
                count++;
                if(dir == 0 || dir == 2){
                    dir = (dir + 1) % 4;
                }else{
                    dir = (dir - 1 + 4) % 4;
                }
                x += dx[dir];
                y += dy[dir];
            }else if(isRange(x,y) && arr[x][y] == '/'){
                count++;
                if(dir == 0 || dir == 2){
                    dir = (dir - 1 + 4) % 4;
                }else{
                    dir = (dir + 1) % 4;
                }
                x += dx[dir];
                y += dy[dir];
            }else{
                break;
            }
        }
        return count;
    }

    public static boolean isRange(int x, int y){
        return (0 <= x && x < n && 0 <= y && y < n);
    }
}