import java.util.*;

public class Main {

    public static final int MAX = 1001;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] xd = new int[MAX];
        int[] yd = new int[MAX];


        for(int i = 0; i < n; i++){
            xd[i] = sc.nextInt();
            yd[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j)continue;

                int a = xd[i] - xd[j];
                a *= a;
                int b = yd[i] - yd[j];
                b *= b;
                
                int sum = a + b;

                min = Math.min(min, sum);
            }
        }
        System.out.println(min);
    }
}