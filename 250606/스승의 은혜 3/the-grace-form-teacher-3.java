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

        int max = 0;
        for(int i = 0; i < n; i++){
            int cost = b;
            int cnt = 0;
            for(int j = 0; j < n; j++){
                if(i == j)dx[j] /= 2;
                
                cost -= dx[j];
                cost -= dy[j];
                if(cost < 0)break;
                cnt++;
                if(i == j)dx[j] *= 2;
                // System.out.print(cost+ " ");
            }
            // System.out.println();
            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }
}