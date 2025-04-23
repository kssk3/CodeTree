import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] students = new int[n + 1];

        int cnt = -1;
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            students[x]++;

            if(students[x] == k){
                cnt = x;
                break;
            }
        }

        System.out.println(cnt);
    }
}