import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // 4, 5, 11
        // -9, 15, -20  
        // -11 -9 -125 -999 -456 -17


        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    int num = arr[i] * arr[j] * arr[k];

                    if(num > 0)ans = Math.max(ans, num);
                    if(ans == 0 && num < 0)ans = num;
                    if(ans != 0 && num < 0)if(Math.abs(num) > ans)ans = Math.max(ans, num);
                }
            }
        }

        System.out.println(ans);
    }
}