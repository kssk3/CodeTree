import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] Alphabets = new char[n];

        for(int i = 0; i < n; i++){
            Alphabets[i] = sc.next().charAt(0);
        }

        char[] findResult = Alphabets.clone();
        Arrays.sort(Alphabets);

        int ans = 0;
        for(int i = 0; i < n; i++){
            if(Alphabets[i] == findResult[i])continue;

            for(int j = i + 1; j < n; j++){
                // 'A', 'B', 'C', 'D' == Alphabets;
                // 'A', 'D', 'B', 'C' == findResult;
                findResult[j] = findResult[i];
                findResult[i] = Alphabets[i];
                ans++;
                break;
            }

        }

        System.out.println(ans);
    }
}