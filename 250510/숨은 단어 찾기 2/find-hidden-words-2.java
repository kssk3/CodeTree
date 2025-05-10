import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 1,  1,  0, -1, -1, -1};
    public static int[] dy = {1, 1, 0, -1, -1, -1,  0,  1};

    public static final int DIR = 8;

    public static int n;
    public static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        char[][] charArr = new char[n][m];

        for(int i = 0; i < n; i++){
            String s = sc.next();
            for(int j = 0; j < m; j++){
                charArr[i][j] = s.charAt(j);
            }
        }
        
        int totalCount = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(charArr[i][j] != 'L'){continue;}
                for(int k = 0; k < DIR; k++){
                    int count = 1;
                    int x = i;
                    int y = j;
                    while(true){
                        int nx = x + dx[k];
                        int ny = y + dy[k];
                        if(!isRange(nx,ny) ||charArr[nx][ny] != 'E'){break;}                    
                        count++;
                        x = nx;
                        y = ny;
                        if(count == 3){break;}
                    }
                    if(count == 3){
                        totalCount++;
                    }
                }
            }
        }
        System.out.println(totalCount);
    }
    private static boolean isRange(int x, int y){
        return (0 <= x && x < n && 0 <= y && y < m);
    }
}