import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }

    private static int factorial(int n){
        if(n == 1) return 2;
        if(n == 2) return 4;

        int num = factorial(n-2) * factorial(n-1);
        return (num % 100);
    }
}