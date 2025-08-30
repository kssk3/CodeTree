import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] line = new int[3];
        for(int i = 0; i < 3; i++){
            line[i] = sc.nextInt();
        }
        Arrays.sort(line);

        int ans = 0;

        int gap1 = line[1] - line[0] - 1;
        int gap2 = line[2] - line[1] - 1;

        ans = Math.max(gap1, gap2);

        System.out.println(ans);
    }
}