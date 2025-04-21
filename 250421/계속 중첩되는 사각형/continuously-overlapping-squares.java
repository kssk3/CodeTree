import java.util.*;

public class Main {

    public static final int MAX = 201;
    public static final int OFFSET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[MAX][MAX];

        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if(i % 2 == 0){
                for(int x = x1 + OFFSET; x < x2 + OFFSET; x++){
                    for(int y = y1 + OFFSET; y < y2 + OFFSET; y++){
                        arr[x][y] = 1;
                    }
                }
            }else{
                for(int x = x1 + OFFSET; x < x2 + OFFSET; x++){
                    for(int y = y1 + OFFSET; y < y2 + OFFSET; y++){
                        arr[x][y] = 2;
                    }
                }
            }    
        }

        int minX = MAX;
        int maxX = -1;
        int minY = MAX;
        int maxY = -1;
        boolean result = false;

        for(int x = 0; x < arr.length; x++){
            for(int y = 0; y < arr[x].length; y++){
                if(arr[x][y] == 2){
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
                    result = true;
                }
            }
        }
        if(result){
            System.out.println((maxX - minX + 1) * (maxY - minY + 1));
        }else{
            System.out.println(0);
        }
    }
}