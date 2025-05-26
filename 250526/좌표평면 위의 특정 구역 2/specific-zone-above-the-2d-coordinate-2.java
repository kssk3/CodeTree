import java.util.*;

public class Main {

    public static final int MAX = Integer.MAX_VALUE;
    public static final int MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 점의 수 
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int minArea = MAX;
        boolean found = false;

        for(int i = 0; i < n; i++){
            int maxX = MIN, maxY = MIN;
            int minX = MAX, minY = MAX;
            for(int j = 0; j < n; j++){
                if(i == j)continue;

                maxX = Math.max(maxX, arr[j][0]);
                minX = Math.min(minX, arr[j][0]);
                maxY = Math.max(maxY, arr[j][1]);
                minY = Math.min(minY, arr[j][1]);
            }

            if(maxX > minX && maxY > minY){
                found = true;
                int width = maxX - minX;
                int height = maxY - minY;
                int area = width * height;

                minArea = Math.min(minArea, area);
            }
        }

        if(found){
            System.out.println(minArea);
        }else{
            System.out.println(0);
        }
    }
}