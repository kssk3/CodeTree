import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        divideEven(arr, n);
        printArr(arr, n);


    }

    private static void divideEven(int[] arr, int n){
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                arr[i] /= 2; 
            }
        }
    }

    private static void printArr(int[] arr, int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}