import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int max = 0;
        for(int i = n; i <= m; i++){
            int a = getNumber(i);
            
            max = Math.max(max, a);
        }

        System.out.println(max);
    }

    private static int getNumber(int i){
        int d1 = i / 10000;
        int d2 = (i / 1000) % 10;
        int d3 = (i / 100) % 10;
        int d4 = (i / 10) % 10; 
        int d5 = i % 10; 
        
        return d1 + d2 + d3 + d4 + d5;
    }
}