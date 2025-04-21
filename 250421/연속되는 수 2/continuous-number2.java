import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int maxCount = 0;
        int cnt = 0;

        for(int i = 0; i < arr.length; i++){
            if(i == 0 || arr[i] ==  arr[i - 1]){cnt++;}
            else{
                if(cnt > maxCount)
                {
                    maxCount = cnt;
                }
                cnt = 1;
            }
        }

        if(maxCount > cnt){
            System.out.println(maxCount);
        }else{
            System.out.println(cnt);
        }

    }
}