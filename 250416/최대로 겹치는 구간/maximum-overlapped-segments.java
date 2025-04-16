import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[201];

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a; j < b; j++){
                int num = j + 100;
                arr[num]++;
            }
        }

        int result = 0;
        for(int a : arr){
            if(a > result){
                result = a;
            }
        }
        
        System.out.println(result);
    }
}