import java.util.*;

public class Main {

    public static final int MAX = 2001;
    public static final int OFFSET = 1000;

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
        
        boolean result = false;
        
        int cnt = 0;
        for(int x = 0; x < arr.length; x++){
            for(int y = 0; y < arr[x].length; y++){
                if(arr[x][y] == 2){
                    cnt++;
                    result = true;
                }
            }
        }
        if(result){
            System.out.println(cnt);
        }else{
            System.out.println(0);
        }
    }
}