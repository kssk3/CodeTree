import java.util.*;

public class Main {
    
    public static final int MAX = 101;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dx = new int[n];
        int[] dy = new int[n];

        for(int i = 0; i < n; i++){
            dx[i] = sc.nextInt();
            dy[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int i = 2; i < MAX; i+= 2){
            for(int j = 2; j < MAX; j+= 2){
                int[] arr = new int[4];

                for(int a = 0; a < n; a++){
                    if(dx[a] < i && dy[a] < j){
                        arr[0]++;
                        continue;
                    }

                    if(dx[a] > i && dy[a] < j){
                        arr[1]++;
                        continue;
                    }

                    if(dx[a] < i && dy[a] > j){
                        arr[2]++;
                        continue;
                    }

                    if(dx[a] > i && dy[a] > j){
                        arr[3]++;
                        continue;
                    }                                
                }
                Arrays.sort(arr);
                min = Math.min(min, arr[3]);
            }
        }

        System.out.println(min);
    }
}