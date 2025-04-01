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
        return n % 3 == 0 || contains369(n);
    }

    private static boolean contains369(int n){
        String number = Integer.toString(n);
        for(int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            if(c == '3' || c == '6' || c == '9'){
                return true;
            }
        }
        return false;
    }
    
}