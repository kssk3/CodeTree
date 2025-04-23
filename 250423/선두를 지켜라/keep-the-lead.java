import java.util.*;

public class Main {

    public static final int MAX = 1_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] posA = new int[MAX];
        int[] posB = new int[MAX];

        int longDistance = movedPosition(posA,n,sc);
        movedPosition(posB,m,sc);

        int count = 0;
        for(int i = 1; i < longDistance; i++){
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
        return distance;
    }
}