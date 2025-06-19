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
        for(int a = 0; a < 3; a++){

            for(int i = 0; i < 3; i++){
                for(int j = i + 1; j < 3; j++){
                    for(int k = j + 1; k < 3; k++){

                        if(((board[a][i] == board[a][j]) && (board[a][i] != board[a][k])) ||
                        ((board[a][i] != board[a][j]) && (board[a][j] == board[a][k])) ||
                        (board[a][i] == board[a][k]) && (board[a][i] != board[a][j]) ){
                            cnt++;
                        }else if(((board[i][a] == board[j][a]) && (board[i][a] != board[k][a])) || 
                        ((board[i][a] != board[j][a]) && (board[j][a] == board[k][a])) || 
                        ((board[i][a] == board[k][a]) && (board[i][a] != board[j][a]))){
                            cnt++;
                        }else if(((board[a][i] == board[j][j]) && (board[a][i] != board[k][k])) ||
                        ((board[a][i] != board[j][j]) && (board[j][j] == board[k][k])) || 
                        ((board[a][i] == board[k][k]) && (board[i][i] != board[j][j]))){
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}