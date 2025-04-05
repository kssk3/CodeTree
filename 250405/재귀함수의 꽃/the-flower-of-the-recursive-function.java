import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factorial(n);
    }

    private static void factorial(int n){
        if(n == 0) return;

        for(int i = n; i <= n; i++){System.out.print(i + " ");}
        factorial(n-1);
        for(int i = n; i <= n; i ++){System.out.print(i + " ");}
    }
    
}