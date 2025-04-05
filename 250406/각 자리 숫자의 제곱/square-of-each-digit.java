import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(mul(n));
    }

    private static int mul(int n){
        if(n < 10)return n * n;

        return mul(n / 10) + mul(n % 10);
    }
}