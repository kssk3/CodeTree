import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        int result = gcd(n, m);
        System.out.println(result);

    }
    public static int gcd(int n, int m){
        if(m == 0){
            return n;
        }
        return gcd(m, n%m);
    }
}