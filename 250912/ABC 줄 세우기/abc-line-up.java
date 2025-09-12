import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] Alphabets = new char[n];

        for(int i = 0; i < n; i++){
            Alphabets[i] = sc.next().charAt(0);
        }

        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1; j++){
                if(Alphabets[j] > Alphabets[j + 1]){
                    char tmp = Alphabets[j];
                    Alphabets[j] = Alphabets[j + 1];
                    Alphabets[j + 1] = tmp;
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}