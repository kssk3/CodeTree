import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[1001];

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a > 0){arr[i] = 1;}
            else{arr[i] = 0;}
        }

        int count = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(i == 0 || arr[i] == arr[i - 1]){count++;}
            else{max = Math.max(count, max);
                count = 1;}
        }

        max = Math.max(count, max);

        System.out.println(max);
    }
}