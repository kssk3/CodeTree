import java.util.*;

public class Main {

    public static int x1, x2, y1, y2, a1, a2, b1, b2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        found(sc);
    }

    public static void found(Scanner sc){
        if(foundX(sc) && foundY(sc)){
            System.out.println("overlapping");
        }else{
            System.out.println("nonoverlapping");
        }
    }

    private static boolean foundX(Scanner sc){
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        a1 = sc.nextInt();
        a2 = sc.nextInt();

        if(a1 < x2 || a2 < x1){
            return false;
        }else{
            return true;
        }
    }

    private static boolean foundY(Scanner sc){
        y1 = sc.nextInt();
        y2 = sc.nextInt();
        b1 = sc.nextInt();
        b2 = sc.nextInt();

        if(b1 < y2 || b2 < y1){
            return false;
        }else{
            return true;
        }
    }
}