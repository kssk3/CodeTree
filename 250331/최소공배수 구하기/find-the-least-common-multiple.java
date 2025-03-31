import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        int max = findNum(n, m);
        // System.out.println(max);
        int min = (n * m) / max;
        System.out.println(min);


    }
    public static int findNum(int n, int m){
        if(m == 0){return n;}
        return findNum(m, n%m);
    }
}