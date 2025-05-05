import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        char[][] arr = new char[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.next().charAt(0);
            }
        }

        int x = 0;
        int y = 0;
        
        char start = arr[x][y];

        int count = 0;

        for(int i = 1 + count; i < r; i++){
            for(int j = 1 + count; j < c; j++){
                if(arr[i][j] != start){
                    start = arr[i][j];
                    count++;
                }
            }
        }
        count += - 1;
        if(count == 2){
            System.out.println(count);
        }else{
            System.out.println(0);
        }

    }
}