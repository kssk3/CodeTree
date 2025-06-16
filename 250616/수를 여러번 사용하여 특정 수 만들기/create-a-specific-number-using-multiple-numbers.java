import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;
        for(int i = 0; i < 1000; i++){
            for(int j = 0; j < 1000; j++){
                
                int maxDiff = (a * i) + (b * j);
                if(maxDiff <= c)max = Math.max(max, maxDiff);    
            }
        }

        System.out.println(max);
    }
}