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

        int ans = 0;
        for(int i = 0; i < MAX; i++){
            for(int j = 0; j < MAX; j++){
                for(int k = 0; k < MAX; k++){
                    boolean found = false;

                    for(int a = 0; a < n; a++){
                        if(dx[a] == i && dx[a] == j && dx[a] == k){
                            found = true;
                            break;
                        }

                        if(dx[a] == i && dx[a] == j && dy[a] == k){
                            found = true;
                            break;
                        }

                        if(dx[a] == i && dy[a] == j && dy[a] == k){
                            found = true;
                            break;
                        }

                        if(dy[a] == i && dy[a] == j && dy[a] == k){
                            found = true;
                            break;
                        }
                    }

                    if(found)ans = 1;
                }
            }
        }
        System.out.println(ans);
    }
}