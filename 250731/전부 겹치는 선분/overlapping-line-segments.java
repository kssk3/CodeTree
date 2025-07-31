import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = Integer.MIN_VALUE;;
        int y = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            x = Math.max(x, a);
            y = Math.min(y, b);
        }

        if(isFound(x, y)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    private static boolean isFound(int x, int y){
        if(y >= x){return true;}
        return false;
    }
}