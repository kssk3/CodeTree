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

        int maxPosition = Math.min(positionsA, positionsB);

        int count = 0;
        int lastLeader = 0;
        for(int i = 1; i < maxPosition; i++){
            if(posA[i] > posB[i]){
                if(lastLeader == 2){
                    count++;
                }
                lastLeader = 1;
            }else{
                if(lastLeader == 1){
                    count++;
                }
                lastLeader = 2;
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