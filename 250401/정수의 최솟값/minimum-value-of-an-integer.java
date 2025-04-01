import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(minNum(a,b,c));
    }
    
    public static int minNum(int a, int b, int c){
        int minNumber = Math.min(a,b);
        int min = Math.min(minNumber, c);
        return min;
    }
}