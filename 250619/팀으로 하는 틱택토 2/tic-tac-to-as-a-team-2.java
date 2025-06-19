import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[3][3];

        for(int i = 0; i < 3; i++){
            String s = Integer.toString(sc.nextInt());
            for(int j = 0; j < 3; j++){
                board[i][j] = s.charAt(j) - '0';
            }
        }

        boolean[][] teams = new boolean[10][10];
        
        for(int i = 0; i < 3; i++){
            addTeam(board[i][0], board[i][1], board[i][2], teams);
        }

        for(int i = 0; i < 3; i++){
            addTeam(board[0][i], board[1][i], board[2][i], teams);
        }

        addTeam(board[0][0], board[1][1], board[2][2], teams);
        addTeam(board[0][2], board[1][1], board[2][0], teams);

        int cnt = 0;
        for(int i = 1; i <= 9; i++){
            for(int j = i + 1; j <= 9; j++){
                if(teams[i][j]){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

    private static void addTeam(int a, int b, int c, boolean[][] teams){
        int[] count = new int[10];

        count[a]++;
        count[b]++;
        count[c]++;
        
        int uniqueCount = 0;
        int first = -1, second = -1;
        
        for(int i = 1; i <= 9; i++){
            if(count[i] > 0){
                uniqueCount++;
                if(first == -1) first = i;
                else if(second == -1) second = i;
            }
        }
        
        if(uniqueCount == 2){
            if(first > second){
                int temp = first;
                first = second;
                second = temp;
            }
            teams[first][second] = true;
        }
    }
}
