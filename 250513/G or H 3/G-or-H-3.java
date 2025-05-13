import java.util.*;

public class Main {

    public static final int MAX = 100_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사람 수 
        int n = sc.nextInt();
        // 사진의 크기
        int k = sc.nextInt();

        int[] arr = new int[MAX];
        char[] charArr = new char[MAX];

        int max = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            charArr[i] = sc.next().charAt(0);

            max = Math.max(max, arr[i]);
        }

        int[] pos = new int[MAX];

        for(int i = 0; i < n; i++){
            if(charArr[i] == 'G'){pos[arr[i]] = 1;}
            if(charArr[i] == 'H'){pos[arr[i]] = 2;}
        }


        int maxCount = 0;
        for(int i = 1; i <= max - k + 1; i++){
            int point = 0;
            for(int j = i; j <= i + k; j++){
                point += pos[j];
            }
            maxCount = Math.max(maxCount, point);
        }

    System.out.println(maxCount);

    }
}