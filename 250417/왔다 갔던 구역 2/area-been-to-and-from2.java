import java.util.*;

public class Main {

    public static final int OFFSET = 100;
    public static int num = OFFSET;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[201];

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            char c = sc.next().charAt(0);

            if(c == 'R'){
                for(int j = num; j < num + a; j++){
                    arr[j]++;
                }
                num += a;
            }

            if(c == 'L'){
                for(int j = num; j >= num - a; j--){
                    arr[j]++;
                }
                num -= a; 
            }
        }

        int count = 0;
        for(int a : arr){
            if(a >= 2){
                count++;
            }
        }

        System.out.println(count);
        
    }
}