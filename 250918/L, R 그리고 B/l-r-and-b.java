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
                if(board[i][j] == 'B'){x1 = i; y1 = j;}
                if(board[i][j] == 'L'){x2 = i; y2 = j;}
            }
        }

        int dist = 0;
        boolean found = false;

        if(x1 == x2){
            int min = Math.min(y1, y2), max = Math.max(y1, y2);
            for(int i = min + 1; i < max; i++){
                if(board[x1][i] == 'R')found = true;
            }
            dist = Math.abs(y1 - y2) - 1;
        }else if(y1 == y2){
            int min = Math.min(x1, x2), max = Math.max(x1, x2);
            for(int i = min + 1; i < max; i++){
                if(board[i][y1] == 'R')found = true;
            }
            dist = Math.abs(x1 - x2) - 1;
        }else{
            dist = Math.abs(x1 - x2) + Math.abs(y1 - y2) - 1;
        }

        System.out.println(found ? dist + 2 : dist);
    }
}
