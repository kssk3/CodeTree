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
            int[][] costBoard = new int[n][2];
            for(int j = 0; j < n; j++){
                int totalCost = dx[j] + dy[j];
                if(i == j){
                    totalCost = dx[j]/2 + dy[j];
                }
                costBoard[j][0] = totalCost;
                costBoard[j][1] = j;
            }

            Arrays.sort(costBoard, (q, w) -> q[0] - w[0]);

            int cost = b;
            int cnt = 0;


            for(int j = 0; j < n; j++){
                if(cost >= costBoard[j][0]){
                    cost -= costBoard[j][0];
                    cnt++;
                }else{
                    break;
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}