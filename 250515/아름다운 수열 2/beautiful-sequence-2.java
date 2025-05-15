import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arrA = new int[n];
        int[] arrB = new int[m];

        for(int i = 0; i < n; i++){
            arrA[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrB);

        int count = 0;

        for(int i = 0; i <= n - m; i++){
            int[] subArr = Arrays.copyOfRange(arrA, i, i + m);
            Arrays.sort(subArr);
            boolean result = true;
            for(int j = 0; j < m; j++){
                if(subArr[j] != arrB[j]){
                    result = false;
                    break;
                }
            }
            if(result){count++;}
        }

        System.out.println(count);
    }
}