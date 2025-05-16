import java.util.*;

public class Main {

    public static final int MAX = 21;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[] arr = new char[MAX];
        int len = arr.length;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            arr[a] = sc.next().charAt(0);
        }

        int distance = 0;
        for(int i = 0; i < len; i++){
            if(arr[i] == 'G' || arr[i] == 'H'){
                for(int j = i; j < len; j++){
                    if(arr[j] == 'G' || arr[j] == 'H'){
                        int cntG = 0;
                        int cntH = 0;
                        for(int k = i; k <= j; k++){
                            if(arr[k] == 'G') cntG++;
                            if(arr[k] == 'H') cntH++;
                        }
                        
                        if(cntG == 0 || cntH == 0 || cntG == cntH){
                            distance = Math.max(distance, j - i);
                        }
                    }
                }
            }
        }
        if(n != 1){
            System.out.println(distance);
        }else{
            System.out.println(0);
        }
    }
}