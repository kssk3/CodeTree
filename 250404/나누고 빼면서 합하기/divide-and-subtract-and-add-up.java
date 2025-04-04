import java.util.*;

public class Main {

    public static int n;
    public static int m;
    public static int sum;

    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n + 1];

        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(isOne());
    }

    private static int isOne(){
        sum = 0;
        while(m != 1){
            if(m % 2 == 1){
                sum += arr[m];
                m -= 1;
            }else{
                sum += arr[m];
                m /= 2;
            }
        }

        if(m == 1){
            sum += arr[m];
        }

        return sum;
    }

}