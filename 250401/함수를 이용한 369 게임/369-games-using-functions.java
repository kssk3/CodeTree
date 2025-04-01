import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        findNumber(A, B);
    }

    public static void findNumber(int A, int B){
        int count = 0;
        for(int i = A; i <= B; i++){
            if(isMasicNumber(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isMasicNumber(int n){
        return n % 3 == 0 || Games(n);
    }
    
    private static boolean Games(int n){
        return (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) || 
        (n / 10 == 3 || n / 10 == 6 || n / 10 == 9);
    }
}