import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();

        int num = 0;

        for(int i = 0; i < binary.length(); i++){
            num = (num * 2) + binary.charAt(i) - '0';
        }

        num *= 17;

        int[] arr = new int[20];
        int count = 0;

        while(true){
            if(num < 2){
                arr[count++] = num;
                break;
            }
            arr[count++] = num % 2;
            num /= 2;
        }

        for(int i = count - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}