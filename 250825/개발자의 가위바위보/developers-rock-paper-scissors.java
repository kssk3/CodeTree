import java.util.*;

public class Main {

    public static final int LIMIT = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        
        int maxWin = 0;
        for(int x = 1; x <= 3; x++){
            for(int y = 1; y <= 3; y++){
                if(a == b)continue;

                int win = 0;
                for(int i = 0; i < n; i++){
                    if(a[i] == b[i])continue;

                    if(a[i] == x && b[i] == y)win++;
                    if(a[i] == y && b[i] != x && b[i] != y)win++;
                    if(a[i] != x && a[i] != y && b[i] == y)win++;
                }

                maxWin = Math.max(maxWin, win);
            }
        }

        System.out.println(maxWin);
    }
}