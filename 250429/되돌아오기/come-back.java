import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static int[][] arr = new int[101][101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = 4, y = 4;
        int position = 1;
        arr[x][y] = position;

        int count = 0;

        boolean result = false;
        while(n --> 0){
            char direction = sc.next().charAt(0);
            int move = sc.nextInt();

            int dir = Dig(direction);

            for(int i = 0; i < move; i++){
                int nx = x + dx[dir], ny = y + dy[dir];
                if(!isRange(nx,ny)){
                    dir = (dir + 1) % 4; 
                }

                if(arr[nx][ny] == 1){
                    result = true;
                    count = position;
                    break;
                }
                x = x + dx[dir]; y = y + dy[dir];
                position++;
                arr[x][y] = position;
            }
        }

        if(result){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }

    }

    public static boolean isRange(int n, int y){
        return (0 <= n && n < arr.length && 0 <= y && y < arr[0].length);
    }

    public static int Dig(char c){
        if(c == 'E'){
            return 0;
        }else if(c == 'S'){
            return 1;
        }else if(c == 'W'){
            return 2;
        }else{
            return 3;
        }
    }
}