import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        add(a,b);
    }

    public static void add(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            if(isPrime(i)){
                if(i == 1){continue;}
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}