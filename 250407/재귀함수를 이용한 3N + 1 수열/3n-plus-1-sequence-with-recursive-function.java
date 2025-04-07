import java.util.*;

public class Main {

    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(counter(n));
    }

    private static int counter(int n){
        if(n == 1) return count;

        if(n % 2 == 0){
            n /= 2;
            count++;
            return counter(n);
        }else{
            n = (n * 3) + 1;
            count++;
            return counter(n);
        }
    }
}