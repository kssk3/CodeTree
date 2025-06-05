import java.util.*;

public class Main {

    public static int[] dx;
    public static int[] dy;

    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        dx = new int[n];
        dy = new int[n];

        for(int i = 0; i < n; i++){
            dx[i] = sc.nextInt();
            dy[i] = sc.nextInt();
        }

        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    int count = getDiff(i, j, k);
                    cnt += count;
                }
            }
        }

        System.out.println(cnt);
    }

    private static int getDiff(int a, int b, int c){
        int[] counting = new int[n * 2];
        for(int i = 0; i < n; i++){
            if(i == a || i == b || i == c)continue;

            int x = dx[i], y = dy[i];

            for(int j = x; j <= y; j++){
                counting[j]++;
            }
        }

        int count = 1;
        for(int i = 0; i < counting.length; i++){
            if(counting[i] > 1){
                count = 0;
            }
        }
        return count;
    }
}