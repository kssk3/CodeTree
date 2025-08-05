import java.util.*;

public class Main {

    public static final int MAX = 11;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dx = new int[n];
        int[] dy = new int[n];

        for(int i = 0; i < n; i++){
            dx[i] = sc.nextInt();
            dy[i] = sc.nextInt();
        }

        int[] arr = new int[MAX];
        Arrays.fill(arr, -1);

        int cnt = 0;
        for(int i = 0; i < n; i++){
            int bird = dx[i];
            int pos = dy[i];

            if(arr[bird] != -1 && arr[bird] != pos){
                cnt++;
            }

            arr[bird] = pos;
        }

        System.out.println(cnt);
    }
}