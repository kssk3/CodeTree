import java.util.*;

public class Main {

    public static final int MAX = 2001;
    public static final int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[MAX][MAX];


        for(int i = 0; i < 1; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int x = x1 + OFFSET; x < x2 + OFFSET; x++){
                for(int y = y1 + OFFSET; y < y2 + OFFSET; y++){
                    arr[x][y] = 1;
                }
            }
        }

        for(int i = 0; i < 1; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int x = x1 + OFFSET; x < x2 + OFFSET; x++){
                for(int y = y1 + OFFSET; y < y2 + OFFSET; y++){
                    arr[x][y] = 0;
                }
            }
        }

        int lowMax = 0;
        int rowMax = 0;

        for(int x = 0; x < arr.length; x++){
            int low = 0;
            int row = 0;
            for(int y = 0; y < arr[x].length; y++){
                if(arr[y][x] == 1){low++;}
                if(arr[x][y] == 1){row++;}

                if(low > lowMax){lowMax = low;}
                if(row > rowMax){rowMax = row;}
        
            }
        }
        System.out.println(lowMax * rowMax);
    }
}