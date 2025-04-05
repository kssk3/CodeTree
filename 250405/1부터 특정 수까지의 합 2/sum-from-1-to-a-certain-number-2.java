import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }

    // private static int factorial(int n){
    //     if(n == 0) return 1;

    //     return factorial(n-1) * n;
    // }

    private static int factorial(int n) {
        if (n == 1) return 1; // 종료 조건 추가: 0! = 1
        return factorial(n - 1) + ;
    }
}