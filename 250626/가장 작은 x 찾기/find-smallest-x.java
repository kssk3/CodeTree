import java.util.*;

public class Main {

    public static final int LIMIT = 10_000;
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
        for(int i = 1; i < LIMIT; i++){
            int num = i;
            
            boolean found = true;;
            for(int j = 0; j < n; j++){
                num *= 2;
                if(dx[j] <= num && num <= dy[j]){
                    continue;
                }else{
                    found = false;
                    break;
                }
            }

            if(found){
                min = Math.min(min, i);
            }
        }

        System.out.println(min);
    }
}