import java.util.*;

public class Main {

    public static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        board = new int[n][2];
        for(int i = 0; i < n; i++){
            board[i][0] = sc.nextInt();
            board[i][1] = sc.nextInt();
        }

        int cnt = 0;
        for(int i = 0; i < n; i++){
            boolean NotFound = true;

            for(int j = 0; j < n; j++){
                if(i == j)continue;

                int x1 = board[i][0], x2 = board[i][1];
                int y1 = board[j][0], y2 = board[j][1];

                if((x1- y1) * (x2 - y2) < 0){
                    NotFound = false;
                    break;
                }
            }

            if(NotFound){cnt++;}
            
        }

        System.out.println(cnt);
    }
}