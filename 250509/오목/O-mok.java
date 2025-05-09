import java.util.*;

public class Main {

    public static int[][] arr = new int[20][20];

    public static int winNumber = 0;
    public static int row = 0;
    public static int col = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 19; i++){
            for(int j = 1; j <= 19; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        boolean result = false;
        // 수평 방향 체크 (열의 숫자가 변할 때)
        for(int y = 1; y <= 19 && !result; y++){
            for(int x = 1; x <= 19 - 4 && !result; x++){
                if(arr[y][x] == 1 && arr[y][x+1] == 1 && arr[y][x+2] == 1
                 && arr[y][x+3] == 1 && arr[y][x+4] == 1){
                    winNumber = arr[y][x];
                    row = y;
                    col = x + 2;
                    result = true;
                }

                if(arr[y][x] == 2 && arr[y][x+1] == 2 && arr[y][x+2] == 2
                 && arr[y][x+3] == 2 && arr[y][x+4] == 2){
                    winNumber = arr[y][x];
                    row = y;
                    col = x + 2;
                    result = true;
                }
            }
        }

        // 수직 방향 체크 (행의 숫자가 변할 때)
        for(int y = 1; y <= 19 && !result; y++){
            for(int x = 1; x <= 19 - 4 && !result; x++){
                if(arr[x][y] == 1 && arr[x+1][y] == 1 && arr[x+2][y] == 1 &&
                arr[x+3][y] == 1 && arr[x+4][y] == 1){
                    winNumber = arr[x][y];
                    row = x + 2;
                    col = y;
                    result = true;
                }

                if(arr[x][y] == 2 && arr[x+1][y] == 2 && arr[x+2][y] == 2 &&
                arr[x+3][y] == 2 && arr[x+4][y] == 2){
                    winNumber = arr[x][y];
                    row = x + 2;
                    col = y;
                    result = true;
                }
            }
        }

        // 왼쪽 위에서 오른쪽 아래 대각선 체크
        for(int y = 1; y <= 19 - 4 && !result; y++){
            for(int x = 1; x <= 19 - 4 && !result; x++){
                if(arr[y][x] == 1 && arr[y+1][x+1] == 1 && arr[y+2][x+2] == 1 &&
                arr[y+3][x+3] == 1 && arr[y+4][x+4] == 1){
                    winNumber = arr[y][x];
                    row = y + 2;
                    col = x + 2;
                    result = true;
                }

                if(arr[y][x] == 2 && arr[y+1][x+1] == 2 && arr[y+2][x+2] == 2 &&
                arr[y+3][x+3] == 2 && arr[y+4][x+4] == 2){
                    winNumber = arr[y][x];
                    row = y + 2;
                    col = x + 2;
                    result = true;
                }
            }
        }

        // 왼쪽 아래에서 오른쪽 위 대각선 체크
        for(int y = 5; y <= 19 && !result; y++){
            for(int x = 1; x <= 19 - 4 && !result; x++){
                if(arr[y][x] == 1 && arr[y-1][x+1] == 1 && arr[y-2][x+2] == 1 &&
                arr[y-3][x+3] == 1 && arr[y-4][x+4] == 1){
                    winNumber = arr[y][x];
                    row = y - 2;
                    col = x + 2;
                    result = true;
                }

                if(arr[y][x] == 2 && arr[y-1][x+1] == 2 && arr[y-2][x+2] == 2 &&
                arr[y-3][x+3] == 2 && arr[y-4][x+4] == 2){
                    winNumber = arr[y][x];
                    row = y - 2;
                    col = x + 2;
                    result = true;
                }
            }
        }

        if(result){
            System.out.println(winNumber);
            System.out.print(row + " " + col);
        }else{
            System.out.println(winNumber);
        }
    }
}
