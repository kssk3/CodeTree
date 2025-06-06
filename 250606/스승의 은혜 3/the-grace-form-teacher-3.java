import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = sc.nextInt();

        int[] dx = new int[n];
        int[] dy = new int[n];

        for(int i = 0; i < n; i++){
            dx[i] = sc.nextInt();
            dy[i] = sc.nextInt();
        }

        Arrays.sort(dx);
        Arrays.sort(dy);

        int max = 0;
        for(int i = 0; i < n; i++){
            int cost = b;
            int cnt = 0;
            for(int j = 0; j < n; j++){
                int currentDx = dx[j];
                if(i == j) currentDx/= 2;
                
                cost -= currentDx;
                cost -= dy[j];
                if(cost < 0)break;
                cnt++;
            }
            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }
}