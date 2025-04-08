import java.util.*;

public class Main {
    
    public static int n;
    public static int[] arrA;
    public static int[] arrB;

    public static boolean result = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        arrA = new int[n];
        arrB = new int[n];

        for(int i = 0; i < n; i++){
            arrA[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        // System.out.println(Arrays.toString(arrA));
        // System.out.println(Arrays.toString(arrB));

        for(int i = 0; i < n; i++){
            if(arrA[i] != arrB[i]){
                result = false;
                break;
            }
        }

        if(result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}