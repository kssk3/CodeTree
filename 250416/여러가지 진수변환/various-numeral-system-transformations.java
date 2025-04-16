import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        int[] arr = new int[20];

        while(true){
            if(a < 1){
                break;
            }
            arr[count++] = a % b;
            a /= b;
        }

        for(int i = count - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }

    }
}