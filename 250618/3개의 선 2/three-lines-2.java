import java.util.*;

public class Main {

    public static final int MAX = 11;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dx = new int[n];
        int[] dy = new int[n];

        for(int i = 0; i < n; i++){
            dx[i] = sc.nextInt(); // {1, 0, 1, 2, 1, 3}
            dy[i] = sc.nextInt(); // {7, 0, 2, 0, 4, 4}
        }

        int ans = 0;
        for(int i = 0; i < MAX; i++){
            for(int j = 0; j < MAX; j++){
                for(int k = 0; k < MAX; k++){
                    boolean found = true;

                    for(int a = 0; a < n; a++){
                        if(dx[a] == i || dx[a] == j || dx[a] == k)continue;

                        found = false;
                    }
                    if(found)ans = 1;
                    
                    found = true;
                    for(int a = 0; a < n; a++){                        
                        if(dx[a] == i || dx[a] == j || dy[a] == k)continue;

                        found = false;
                    }
                    if(found)ans = 1;

                    found = true;
                    for(int a = 0; a < n; a++){
                        if(dx[a] == i || dy[a] == j || dy[a] == k)continue;

                        found = false;
                    }
                    if(found)ans = 1;

                    found = true;
                    for(int a = 0; a < n; a++){
                        if(dy[a] == i || dy[a] == j || dy[a] == k)continue;

                        found = false;
                    }
                    if(found)ans = 1;
                }
            }
        }
        System.out.println(ans);
    }
}