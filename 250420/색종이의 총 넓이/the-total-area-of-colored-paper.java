import java.util.*;

public class Main {

    public static final int MAX = 2001;
    public static final int EIGHT = 8;
    public static int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[MAX][MAX];

        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = x1 + EIGHT;
            int y2 = y1 + EIGHT;

            for(int j = x1 + OFFSET; j < x2 + OFFSET; j++){
                for(int k = y1 + OFFSET; k < y2 + OFFSET; k++){
                    arr[j][k] = 1;
                }
            }

        }
        int cnt = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 1){cnt++;}
            }
        }

        System.out.println(cnt);
    }
}