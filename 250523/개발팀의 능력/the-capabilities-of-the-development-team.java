import java.util.*;

public class Main {

    public static final int MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 1; i < 5; i++){
            if(arr[i - 1] == arr[i]){count++;}
        }

        int min = MAX;
        for(int a = 0; a < 5; a++){
            for(int b = a + 1; b < 5; b++){
                for(int c = 0; c < 5; c++){
                    for(int d = c + 1; d < 5; d++){
                        if(a == c || a == d || b == c || b == d){continue;}

                        int e = 0;
                        for(int i = 0; i < 5; i++){
                            if(i == a || i == b || i == c || i == d){continue;}
                            e = i;
                        }

                        int sum1 = arr[a] + arr[b];
                        int sum2 = arr[c] + arr[b];
                        int maxSum = Math.max(Math.max(sum1, sum2), e);
                        int minSum = Math.min(Math.min(sum1, sum2), e);
                        min = Math.min(min, maxSum - minSum);
                    }
                }
            }
        }
        if(count == 4){
            System.out.println(-1);
        }else{
            System.out.println(min);
        }
    }
}