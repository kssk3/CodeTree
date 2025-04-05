import java.util.*;

public class Main {

    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        factorialA(n);
        System.out.println();
        factorialB(n);

    }

    private static void factorialA(int n){
        if(n == 0) return;

        factorialA(n - 1);
        for(int i = n; i <= n; i++){
            System.out.print(i + " ");
        }
    }

    private static void factorialB(int n){
        if(n == 0) return;

        for(int i = n; i <= n; i++){
            System.out.print(i + " ");
        }
        factorialB(n - 1);
    }


}