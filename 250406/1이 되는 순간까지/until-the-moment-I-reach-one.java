import java.util.*;

public class Main {

    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int number = f(n);
        System.out.println(count);
    }

    public static int f(int n){
        if(n == 1){
            return n;
        }

        if(n % 2 == 0){
            count++;
            return f(n/2);
        }else{
            count++;
            return f(n/3);
        }
    }
}