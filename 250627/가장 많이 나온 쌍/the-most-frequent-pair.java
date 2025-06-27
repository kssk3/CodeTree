import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] dx = new int[m];
        int[] dy = new int[m];

        for(int i = 0; i < m; i++){
            dx[i] = sc.nextInt();
            dy[i] = sc.nextInt();
        }
        
        int[] arr = new int[21];
        for(int i = 0; i < m; i++){
            arr[dx[i] + dy[i]]++;
        }

        int max = 0;
        for(int a : arr){
            max = Math.max(max, a);
        }
        
        System.out.println(max);
    }
}