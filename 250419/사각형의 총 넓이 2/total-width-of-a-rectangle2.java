import java.util.*;

public class Main {

    public static final int MAX = 4_000;
    public static final int OFFEST = 2_000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[MAX + 1][MAX + 1];

        int count = 0;

        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int j = x1 + OFFEST ; j < x2 + OFFEST; j++){
                for(int k = y1 + OFFEST; k < y2 + OFFEST; k++){
                    arr[j][k]++;
                }
            }
        }

        for(int x = 0; x < MAX + 1; x++){
            for(int y = 0; y < MAX + 1; y++){
                if(arr[x][y] > 0){count++;}
            }
        }

        System.out.println(count);
    }
}