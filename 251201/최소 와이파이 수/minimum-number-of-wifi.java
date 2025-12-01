import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] city = new int[n];

        for(int i = 0; i < n; i++){
            city[i] = sc.nextInt();
        }

        int cnt = 0;

        int pos = 0;
        while(pos < n){
            if(city[pos] == 1){
                cnt++;
                
                pos = pos + 2 * m + 1;
            }else{
                pos++;
            }
        }

        System.out.println(cnt);
    }
}