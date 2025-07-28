import java.util.*;

public class Main {

    public static int x1, x2, y1, y2, a1, a2, b1, b2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        solution(sc);
    }

    public static void solution(Scanner sc){
        if(isFound(sc)){
            System.out.println("overlapping");
        }else{
            System.out.println("nonoverlapping");
        }
    }

    private static boolean isFound(Scanner sc){
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        a1 = sc.nextInt();
        b1 = sc.nextInt();
        a2 = sc.nextInt();
        b2 = sc.nextInt();

        if(((a1 < x2) && (b1 < y2)) || ((x1 < a1) && (y1 < b2))){
            return true;
        }else{
            return false;
        }
    }
}