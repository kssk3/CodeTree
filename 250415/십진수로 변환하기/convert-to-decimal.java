import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = Integer.toString(n);

        String[] strArr = str.split("");

        int[] arr = new int[strArr.length];

        for(int i = 0; i < strArr.length; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int num = 0;
        for(int i = 0; i < arr.length; i++){
            num = num * 2 + arr[i];
        }

        System.out.println(num);
    }
}