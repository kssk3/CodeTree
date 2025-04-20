import java.util.*;

public class Main {

    public static final int MAX = 2_001;
    public static int OFFSET = 1_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[MAX][MAX];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = 0;
            }
        }

        for(int i = 0; i < 2; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int x =x1 + OFFSET; x <x2 + OFFSET; x++){
                for(int y =y1 + OFFSET; y <y2 + OFFSET; y++){
                    arr[x][y] = 1;
                }
            }
        }

        for(int i = 0; i < 1; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int x = x1 + OFFSET; x < x2 + OFFSET; x++){
                for(int y = y1 + OFFSET; y < y2 + OFFSET; y++){
                    arr[x][y] = 0;
                }
            }
        }

        

        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 1){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}