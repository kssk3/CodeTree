import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[101];

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a > 0){arr[i] = 1;}
            else{arr[i] = 0;}
        }

        int count = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == 0 || arr[i] == arr[i - 1]){count++;}
            else{max = Math.max(max, count);
            count = 1;}
        }

        System.out.println(max);
    }
}