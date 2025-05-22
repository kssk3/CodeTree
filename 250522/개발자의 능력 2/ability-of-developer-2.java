import java.util.*;

public class Main {

    public static int[] arr = new int[6];
    public static final int MAX = 1_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            arr[i] = sc.nextInt();
        }

        int min = MAX;
        for(int i = 0; i < 6; i++){
            for(int j = i + 1; j < 6; j++){
                for(int k = 0; k < 6; k++){
                    for(int l = k + 1; l < 6; l++){
                        if(i == k || j == l || j == k || i == l){continue;}
                                                
                        int e = 0, f = 0;
                        int count = 0;
                        for(int q = 0; q < 6; q++) {
                            if(q != i && q != j && q != k && q != l) {
                                if(count == 0) e = q;
                                else f = q;
                                count++;
                            }
                        }
                        
                        int team1 = arr[i] + arr[j];
                        int team2 = arr[k] + arr[l];
                        int team3 = arr[e] + arr[f];
                        
                        int maxSum = Math.max(Math.max(team1, team2), team3);
                        int minSum = Math.min(Math.min(team1, team2), team3);
                        
                        int diff = maxSum - minSum;
                        min = Math.min(min, diff);

                    }
                }
            }
        }
        System.out.println(min);
    }
}