import java.util.*;

public class Main {

    public static final int MAX = 20_001;

    public static int[] xd = new int[MAX];
    public static int[] yd = new int[MAX];

    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            xd[i] = sc.nextInt();
            yd[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if((xd[i] == xd[j] || xd[i] == xd[k] || xd[j] == xd[k]) &&
                        (yd[i] == yd[j] || yd[i] == yd[k] || yd[j] == yd[k])){
                        int count = getDiff(i, j, k);
                        max = Math.max(max, count);
                    }
                }
            }
        }

        System.out.println(max);
    }

    private static int getDiff(int i, int j, int k){
        int minX = Math.min(Math.min(xd[i], xd[j]), xd[k]);
        int maxX = Math.max(Math.max(xd[i], xd[j]), xd[k]);
        int minY = Math.min(Math.min(yd[i], yd[j]), yd[k]);
        int maxY = Math.max(Math.max(yd[i], yd[j]), yd[k]);
        
        int x = maxX - minX;
        int y = maxY - minY;

        return x * y;
    }
}