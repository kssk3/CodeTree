import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sequences(n));

    }

    public static int sequences(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;

        return sequences(n/3) + sequences(n-1);
    }
}