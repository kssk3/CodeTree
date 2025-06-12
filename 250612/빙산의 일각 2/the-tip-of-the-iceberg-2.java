import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int maxHeight = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            maxHeight = Math.max(maxHeight, arr[i]);
        }

        int maxCnt = 0;
        for(int i = 0; i <= maxHeight; i++){
            int cnt = countIceberg(arr, i);
            maxCnt = Math.max(maxCnt, cnt);
        }

        System.out.println(maxCnt);
    }
    private static int countIceberg(int[] arr, int h){
        int pointCnt = 0;
        boolean inGroup = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > h){
                if(!inGroup){
                    pointCnt++;
                    inGroup = true;
                }
            }else{
                inGroup = false;
            }
        }
        
        return pointCnt;
    }
}