import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cntA = 0;
        int cntB = 0;

        int ans = 0;
        for(int i = 0; i < n; i++){
            char target = sc.next().charAt(0);
            int num = sc.nextInt();

            //System.out.print("ans = " + ans);
            int tmp = 0;
            if(target == 'A'){
                tmp = cntA;
                cntA += num;
                }

            if(target == 'B'){
                tmp = cntB;
                cntB += num;
            }

            //System.out.println(" target = " + target + ", num = " + num + ", cntA = " + cntA + ", cntB = " + cntB);
            if(target == 'A' && tmp > cntB && num > 0)continue;
            if(target == 'A' && tmp <= cntB && num > 0 && cntA >= cntB)ans++;
            if(target == 'A' && tmp >= cntB && num < 0 && cntA <= cntB)ans++;

            if(target == 'B' && tmp > cntA && num > 0)continue;
            if(target == 'B' && tmp <= cntA && num > 0 && cntB >= cntA)ans++;
            if(target == 'B' && tmp >= cntA && num < 0 && cntA >= cntB)ans++;
        }

        System.out.println(ans);
    }
}