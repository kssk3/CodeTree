import java.util.*;

public class Main {

    public static final int MAX = 10_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] posA = new int[MAX];
        int[] posB = new int[MAX];

        int positionsA = movedPosition(posA,n,sc);
        int positionsB = movedPosition(posB,m,sc);

        // ====== Added by Codetree ======
        // longDistance는 누적 거리입니다. 여기서 시뮬레이션 초의 총 개수와 비교하지 않았는지 확인해보세요.
        // ====== Added by Codetree ======
        int count = 0;
        for(int i = 1; i < Math.min(positionsA, positionsB); i++){
            if(posB[i] > posA[i] && posB[i - 1] <= posA[i - 1]){
                count++;
            }
        }

        System.out.println(count);
    }

    public static int movedPosition(int[] arr, int n, Scanner sc){
        int position = 1;
        int distance = 0;
        
        for(int i = 0; i < n; i++){
            int speed = sc.nextInt();
            int time = sc.nextInt();

            for(int j = 1; j <= time; j++){
                distance += speed;
                arr[position++] = distance;
            }
        }
        return position;
    }
}