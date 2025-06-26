import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = sc.next();

        char[] arr = str.toCharArray();

        int max = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == '1')continue;
            
            int len = Integer.MAX_VALUE;
            char[] crr = arr;
            crr[i] = '1';
            // System.out.println(Arrays.toString(crr));
            for(int j = 0; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(crr[j] == '1' && crr[k] == '1'){
                        len = Math.min(len, k - j);
                        // System.out.print(len + " ");
                    }
                }
            }
            max = Math.max(max, len);
            crr[i] = '0';
            // System.out.println("///" + max);
        }

        System.out.println(max);
    }
}