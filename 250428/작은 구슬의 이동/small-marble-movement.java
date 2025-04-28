import java.util.*;

public class Main {

    public static int n;
    public static int t;

    public static int[] dx = {0 , 1, -1, 0};
    public static int[] dy = {1 , 0 , 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();

        int[][] arr = new int[n + 1][n + 1];

        int r = sc.nextInt();
        int c = sc.nextInt();
        char d = sc.next().charAt(0);

        int dim = getDir(d);

        for(int i = 0; i <= t; i++){
            int nx = r + dx[dim], ny = c + dy[dim];
            if(!inRange(nx,ny)){
                dim = 3 - dim;
            }

            r = r + dx[dim];
            c = c + dy[dim];
        }

        System.out.println(r + " " + c);
    }

    public static boolean inRange(int x, int y){
        return (0 <= x && x <= n && 0 <= y && y <= n);
    }

    public static int getDir(char d){
        if(d == 'U'){return 2;}
        else if(d == 'D'){return 1;}
        else if(d == 'R'){return 0;}
        else{return 3;}
    }
}