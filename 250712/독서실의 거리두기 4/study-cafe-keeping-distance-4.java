import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String text = sc.next();
        char[] crr = text.toCharArray();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            if(crr[i] == '1'){arr[i] = 1;}
            else{arr[i] = 0;}
        }

        int cnt = 0;
        for(int a = 0; a < n; a++){
            if(arr[a] == 1){continue;}
            for(int b = a + 1; b < n; b++){
                if(arr[b] == 1){continue;}

                int[] temp = Arrays.copyOf(arr, n);

                temp[a] = 1;
                temp[b] = 1;

                int findcost = 0;
                for(int i = 0; i < n; i++){
                    if(temp[i] == 1)findcost++;
                }

                int[] ones = new int[findcost];
                int index = 0;
                for(int i = 0; i < n; i++){
                    if(temp[i] == 1)ones[index++] = i; 
                }

                int min = n;
                for(int i = 1; i < findcost; i++){
                    int cost = ones[i] - ones[i - 1];
                    min = Math.min(min, cost);
                }

                cnt = Math.max(cnt, min);
            }
        }

        System.out.println(cnt);
    }
}