import java.util.*;

public class Main {

    public static int[] arr;
    
    public static int n;
    public static int l;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init(sc);
        solved();
    }

    private static void init(Scanner sc){
        n = sc.nextInt();
        l = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }

    private static void solved(){
        int h = 0;

        for(int i = 0; i < n; i++){
            int[] brr = arr;

            int num = brr[i];
            for(int j = 0; j < l; j++){
                brr[j] += 1;
            }

            int cnt = 0;
            for(int j = 0; j < n; j++){
                if(num <= brr[j])cnt++;
                
                if(num > brr[j])continue;
            }

            if(num <= cnt){
                h = num;
            }
        }
        System.out.println(h);
    }
}