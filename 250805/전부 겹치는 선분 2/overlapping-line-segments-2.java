import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dx = new int[n];
        int[] dy = new int[n];

        for(int i = 0; i < n; i++){
            dx[i] = sc.nextInt();
            dy[i] = sc.nextInt();
        }

        boolean found = false;
        for(int i = 0; i < n; i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int j = 0; j < n; j++){
                if(i == j)continue;

                max = Math.max(max, dx[j]);
                min = Math.min(min, dy[j]);
            }

            if(min >= max)found = true;
        }

        if(found){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}