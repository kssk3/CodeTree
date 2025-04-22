import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > y){count++;}
            else{max = Math.max(count, max);
                count = 0;}
        }

        max = Math.max(count, max);

        System.out.println(max);
    }
}