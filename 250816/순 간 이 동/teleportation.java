import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int direct = Math.abs(a - b);
        int jumpXtoY = Math.abs(a - x) + Math.abs(b - y);
        int jumpYtoX = Math.abs(a - y) + Math.abs(b - x);

        int ans = Math.min(direct, Math.min(jumpXtoY, jumpYtoX));

        System.out.println(ans);
    }
}