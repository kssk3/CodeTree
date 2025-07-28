import java.util.*;

public class Main {

    public static final int MAX = 101;
    public static final String FOUND = "intersecting";
    public static final String NOTFOUND = "nonintersecting";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        foundSolution(sc);
    }

    private static void foundSolution(Scanner sc){
        // first
        int a = sc.nextInt();
        int b = sc.nextInt();

        // second
        int c = sc.nextInt();
        int d = sc.nextInt();

        boolean isfound = false;

        if(a < c){
            for(int i = a; i <= b; i++){
                for(int j = c; j <= d; j++){
                    if(i == j){
                        isfound = true;
                        break;
                    }
                }
            }
        }else{
            for(int i = c; i <= d; i++){
                for(int j = a; j <= b; j++){
                    if(i == j){
                        isfound = true;
                        break;
                    }
                }
            }
        }

        if(isfound){
            System.out.println(FOUND);
        }else{
            System.out.println(NOTFOUND);
        }
    }
}