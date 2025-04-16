import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j < b; j++){
                arr[j] += 1;
            }
        }

        int num = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > num){
                num = arr[i];
            }
        }

        System.out.println(num);
    }
}