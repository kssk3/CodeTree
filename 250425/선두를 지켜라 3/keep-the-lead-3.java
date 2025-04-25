import java.util.*;

public class Main {
    
    public static final int MAX = 1_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] posA = new int[51];
        int[] posB = new int[51];

        int n = sc.nextInt();
        int m = sc.nextInt();

        int postionA = 1;
        int distanceA = 0;
        for(int i = 0; i < n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();

            for(int j = 0; j < t; j++){
                distanceA += v;
                posA[postionA++] = distanceA;
            }
        }

        int positionB = 1;
        int distanceB = 0;
        for(int i = 0; i < m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();

            for(int j = 0; j < t; j++){
                distanceB += v;
                posB[positionB++] = distanceB;
            }
        }

        int min = Math.min(distanceA, distanceB);

        int count = 0;
        int reader = 0;
        for(int i = 1; i <= distanceB; i++){
            if(posA[i] > posB[i]){
                if(reader != 1){
                    count++;
                    reader = 1;
                }
            }
            if(posB[i] > posA[i]){
                if(reader != 2){
                    count++;
                    reader = 2;
                }
            }

            if(posB[i] == posA[i] && posA[i] != 0 && posB[i] != 0){
                if(reader != 3){
                    count++;
                    reader = 3;
                }
            }
        }

        System.out.println(count);

    }
}