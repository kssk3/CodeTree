import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[15];

        int max = 0;
        for(int i = 0; i < 15; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[1];
        int c = 0;

        if(a + b == arr[2]){
            c = arr[3];
        }else{
            c = arr[2];
        }
        
        int d = max - a - b- c;

        System.out.println(a + " " + b + " " + c + " " + d);
    }
}