import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        findCount(a, b);
    }

    public static void findCount(int a, int b){
        int count = 0;
        for(int i = a; i <= b; i++){
            if(isPrime(i) && evenNumber(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPrime(int n){
        for(int i = 2; i < n; i ++){if(n % i == 0){
            return false;
            }
        }
        return true;
    }

    private static boolean evenNumber(int n){
        return ((n / 10 + n % 10) % 2 == 0);
    }
}