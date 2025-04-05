import java.util.*;

public class Main {

    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        factorial(n);
    }

    public static void factorial(int n){
        if(n == 0) return;

        factorial(n-1);
        System.out.println("HelloWorld");
    }
}