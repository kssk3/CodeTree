import java.util.*;

public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    
    public static int time = 0;
    public static int dim = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int len = s.length();

        int x = 0, y = 0;
        
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            int direction = getDirection(c);

            if(c == 'L'){continue;}
            if(c == 'R'){continue;}

            
            x += dx[direction];
            y += dy[direction];

            if(x == 0 && y == 0){
                System.out.println(time);
                break;
            }
        }

    }

    public static int getDirection(char c){
        time++;

        if(c == 'R'){
            return dim = (dim + 1) % 4;
        }else if(c == 'L'){
            return dim = (dim - 1 + 4) % 4;
        }else{
            return dim;
        }
    }
}