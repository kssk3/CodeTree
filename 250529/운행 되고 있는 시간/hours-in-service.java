import java.util.*;

public class Main {

    public static final int MAX = 1001;

    public static int[] dx = new int[MAX];
    public static int[] dy = new int[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            dx[i] = sc.nextInt();
            dy[i] = sc.nextInt();
        }

        int max = 0;
        for(int i = 0; i < n; i++){
            int cnt = 0;
            int[] counting = new int[MAX];
            for(int j = 0; j < n; j++){
                if(i == j)continue;

                for(int a = dx[j]; a < dy[j]; a++){
                    counting[a]++;
                }
            }
            for(int b = 0; b < MAX; b++){
                if(counting[b] > 0)cnt++;
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}