import java.util.*;

public class Main {

    public static int n;

    public static int[][] arr;

    public static int[][] findCoin = new int[0][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        int[] findCoin = new int[n];

        if(n < 6){
            for(int i = 0; i < n; i++){
                int max = 0;
                for(int j = 0; j < n - 2; j++){
                    int count = 0;
                    for(int k = 0; k < 3; k++){
                        if(arr[i][j + k] == 1){count++;}
                    }

                    max = Math.max(max,count);
                }

                findCoin[i] = max;
            }
        }else{
            for(int i = 0; i < n; i++){
                int max = 0;
                for(int j = 0; j < n - 5; j++){
                    int count = 0;
                    for(int k = 0; k < 3; k++){
                        if(arr[i][j + k] == 1){count++;}
                    }

                    for(int l = 3; l < 6; l++){
                        if(arr[i][j + l] == 1){count++;}
                    }

                    max = Math.max(max,count);
                }

                findCoin[i] = max;
            }
        }

        Arrays.sort(findCoin);

        System.out.println(findCoin[n-1] + findCoin[n-2]);
    }
}