import java.util.*;

public class Main {

    public static final int MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        int min = MAX;
        boolean found = false;

        for(int a = 0; a < 5; a++){
            for(int b = a + 1; b < 5; b++){
                for(int c = 0; c < 5; c++){
                    for(int d = c + 1; d < 5; d++){
                        if(a == c || a == d || b == c || b == d) continue;
                        
                        int e = -1;
                        for(int i = 0; i < 5; i++){
                            if(i != a && i != b && i != c && i != d){
                                e = i;
                                break;
                            }
                        }
                        
                        int sum1 = arr[a] + arr[b]; 
                        int sum2 = arr[c] + arr[d];  
                        int sum3 = arr[e];           
                        
                        if(sum1 != sum2 && sum2 != sum3 && sum1 != sum3){
                            int maxSum = Math.max(Math.max(sum1, sum2), sum3);
                            int minSum = Math.min(Math.min(sum1, sum2), sum3);
                            int diff = maxSum - minSum;
                            
                            if(diff > 0) {
                                min = Math.min(min, diff);
                                found = true;
                            }
                        }
                    }
                }
            }
        }
        
        if(found){
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}