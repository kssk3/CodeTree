import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = {a, b, c};

        if((arr[0] + 1 == arr[1]) && (arr[1] + 1 == arr[2])){
            System.out.println(0);
        }else if(((arr[1] + 2 == arr[0]) && (arr[1] + 1 == arr[2])) || ((arr[0] + 2 == arr[1]) && (arr[1] - 1 == arr[2]))){
            System.out.println(1);
        }else{
            System.out.println(2);
        }
    }
}