import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }


        int num = -1;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    int a = arr[i], b = arr[j], c = arr[k];
                    boolean carry = true;
                    while(isRange(a,b,c)){
                        if((a % 10 + b % 10 + c % 10) > 9){
                            carry = false;
                            break;}
                        a /= 10;
                        b /= 10;
                        c /= 10;
                    }
                    if(carry && num < arr[i] + arr[j] + arr[k]){
                        num = Math.max((arr[i] + arr[j] + arr[k]), num);
                    }
                }
            }
        }

        System.out.println(num);
    }
    private static boolean isRange(int a, int b, int c){
        return (a + b + c ) > 0;
    }
}