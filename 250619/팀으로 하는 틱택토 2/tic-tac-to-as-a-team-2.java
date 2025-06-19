import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[3][3];

        for(int i = 0; i < 3; i++){
            String s = Integer.toString(sc.nextInt());
            String[] srr = s.split("");
            for(int j = 0; j < 3; j++){
                board[i][j] = Integer.parseInt(srr[j]);
            }
        }

        int cnt = 0;
        for(int i = 0; i < 3; i++){
            if(isWingLine(board[i][0], board[i][1], board[i][2]))cnt++;
        }

        for(int i = 0; i < 3; i++){
            if(isWingLine(board[0][i], board[1][i], board[2][i]))cnt++;
        }

        if(isWingLine(board[0][0], board[1][1], board[2][2]))cnt++;

        if(isWingLine(board[0][2], board[1][1], board[2][0]))cnt++;

        System.out.println(cnt);
    }

    private static boolean isWingLine(int a, int b, int c){
        int[] count = new int[10];

        count[a]++;
        count[b]++;
        count[c]++;
        
        for(int i = 0; i < 10; i++){
            if(count[i] == 2){
                return true;
            }
        }
        return false;
    }
}