    import java.util.*;

    public class Main {

        public static int[] dx = {0, 1, 0, -1};
        public static int[] dy = {1, 0, -1, 0};

        public static int[][] arr = new int[100][100];

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int x = 0, y = 0;
            int time = 0;

            for(int i = 0; i < n; i++){
                char direction = sc.next().charAt(0);
                int distance = sc.nextInt();

                int dir = getDireciotn(direction);

                for(int j = 0; j < distance; j++){
                    x += dx[dir];
                    y += dy[dir];
                    time++;

                    if(x == 0 && y == 0){
                        System.out.println(time);
                        return;
                    }
                }
            }
            System.out.println(-1);
        }

        public static int getDireciotn(char c){
            if(c == 'E'){
                return 0;
            }else if(c == 'S'){
                return 1;
            }else if(c == 'W'){
                return 2;
            }else{
                return 3;
            }
        }
    }