import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[20_001][20_001];

        int count = 0;

        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    arr[j][k]++;
                }
            }
        }

        for(int x = 0; x < 20_001; x++){
            for(int y = 0; y < 20_001; y++){
                if(arr[x][y] > 0){count++;}
            }
        }

        System.out.println(count);
    }
}