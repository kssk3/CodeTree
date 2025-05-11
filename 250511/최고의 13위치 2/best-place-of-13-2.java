import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int maxCoins = 0;
        
        // 모든 가능한 두 개의 1*3 격자 배치를 시도
        for (int r1 = 0; r1 < n; r1++) {
            for (int c1 = 0; c1 <= n - 3; c1++) {
                // 첫 번째 격자의 동전 개수 계산
                int coins1 = arr[r1][c1] + arr[r1][c1 + 1] + arr[r1][c1 + 2];
                
                // 두 번째 격자의 모든 가능한 위치를 시도
                for (int r2 = 0; r2 < n; r2++) {
                    for (int c2 = 0; c2 <= n - 3; c2++) {
                        // 같은 위치에 있는 격자는 겹치므로 건너뛰기
                        if (r1 == r2 && (c1 <= c2 && c2 < c1 + 3 || c2 <= c1 && c1 < c2 + 3)) {
                            continue;
                        }
                        
                        // 두 번째 격자의 동전 개수 계산
                        int coins2 = arr[r2][c2] + arr[r2][c2 + 1] + arr[r2][c2 + 2];
                        
                        // 최대값 갱신
                        maxCoins = Math.max(maxCoins, coins1 + coins2);
                    }
                }
            }
        }
        
        System.out.println(maxCoins);
    }
}
