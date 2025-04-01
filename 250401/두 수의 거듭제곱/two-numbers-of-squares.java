import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.println(printNumber(a, b));
    }

    public static int printNumber(int a, int b){
        int number = a;
        for(int i = 1; i < b; i++){
            number *= a;
        }
        return number;
    }
}