import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String binary = sc.next();
        int num = 0;

        for(int i = 0;  i < binary.length(); i++){
            num = num * a + (binary.charAt(i) - '0');
        }

        int[] arr = new int[100];
        int count = 0;

        while(true){
            if(num < 1){
                break;
            }
            arr[count++] = num % b;
            num /= b;
        }

        for(int i = count - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}