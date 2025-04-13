import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Point[] pointer = new Point[n];

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            pointer[i] = new Point(a,b, i+1);
        }

        Arrays.sort(pointer, new Comparator<Point>(){
            @Override
            public int compare(Point a, Point b){
                int abs1 = Math.abs(a.x) + Math.abs(a.y);
                int abs2 = Math.abs(b.x) + Math.abs(b.y);

                if(abs1 == abs2){
                    return a.number - b.number;
                }
                return abs1 - abs2;
            }
        });

        for(Point p : pointer){
            System.out.println(p.number);
        }
    }
}

class Point{
    int x, y, number;

    public Point(int x, int y, int number){
        this.x = x;
        this.y = y;
        this.number = number;
    }
}