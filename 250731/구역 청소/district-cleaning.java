import java.util.*;

public class Main {

    public static final int MAX = 101;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int result = cleanSpace(x1, y1, x2, y2);
        System.out.println(result);
    }

    private static int cleanSpace(int a, int b, int c, int d){
        if(a > c && b > d)return b - c;
        if(a > c && d > b)return d - c;
        if(c > a && b > d)return b - a;
        if(c > a && d > b)return d - a;
        return 0;
    }
}