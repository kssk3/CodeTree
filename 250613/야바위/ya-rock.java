import java.util.*;

public class Main {

    public static final int MAX = 101;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[MAX];
        int[] b = new int[MAX];
        int[] c = new int[MAX];

        int[] boxed = new int[MAX];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int max = 0;
        for(int i = 1; i <= 3; i++){
            boxed[1] = 0; boxed[2] = 0; boxed[3] = 0;

            boxed[i] = 1;

            int cnt = 0;
            for(int j = 0; j < n; j++){
                int temp = boxed[a[j]];
                boxed[a[j]] = boxed[b[j]];
                boxed[b[j]] = temp;

                if(boxed[c[j]] == 1)cnt++;
            }
            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }
}