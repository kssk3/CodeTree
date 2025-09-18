import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] board = new char[10][10];
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        for(int i = 0; i < 10; i++){
            String line = sc.next();
            for(int j = 0; j < 10; j++){
                board[i][j] = line.charAt(j);
                if(board[i][j] == 'B'){
                    x1 = i; y1 = j;
                }
                if(board[i][j] == 'L'){
                    x2 = i; y2 = j;
                }
            }
        }
        System.out.println(Math.abs(x2 - x1) + Math.abs(y2 - y1) - 1);
    }
}
