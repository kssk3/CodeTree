import java.util.*;

public class Main {

    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findMax(n-1));
        
    }

    public static int findMax(int n){
        if(n == 0) return arr[n];

        int prevMax = findMax(n - 1);
        int curr = arr[n];

        return (prevMax > curr) ? prevMax : curr;
    }

}