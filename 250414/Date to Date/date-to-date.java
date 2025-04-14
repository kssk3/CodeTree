import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                                    //   1  2.  3.  4.  5.  6.  7.  8.  9. 10.  11. 12 
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int sum1 = d1;

        for(int i = 0; i < m1; i++){
            sum1 += num_of_days[i];
        }

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int sum2 = d2;

        for(int i = 0; i < m2; i++){
            sum2 += num_of_days[i];
        }
        
        // System.out.println(sum1);
        // System.out.println(sum2);

        System.out.println((sum2 - sum1) + 1);

    }
}