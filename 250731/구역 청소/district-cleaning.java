import java.util.*;

public class Main {

    public static final int MAX = 101;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int[] arr = new int[MAX];

        for(int i = x1; i < y1; i++){
            arr[i] = 1;
        }

        for(int i = x2; i < y2; i++){
            arr[i] = 1;
        }

        int cnt = 0;
        for(int a : arr){
            if(a == 1){cnt++;}
        }

        System.out.println(cnt);
    }
}