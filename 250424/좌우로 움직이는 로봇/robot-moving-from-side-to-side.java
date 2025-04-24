import java.util.*;

public class Main {

    public static final int MAX = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] robotA = new int[MAX];
        int[] robotB = new int[MAX];

        int aCount = moved(robotA,n,sc);
        int bCount = moved(robotB,m,sc);

        int minCount = Math.min(aCount, bCount);

        int sameLoaction = 0;

        if(aCount > bCount){
            for(int i = 1; i <= aCount; i++){
                if(robotA[i] == robotB[i] && robotA[i-1] != robotB[i-1]){
                    sameLoaction++;
                }

                if(robotB[bCount] == robotA[i]){
                    sameLoaction++;
                }
            }
        }else{
            for(int i = 1; i <= aCount; i++){
                if(robotA[i] == robotB[i] && robotA[i-1] != robotB[i-1]){
                    sameLoaction++;
                }

                if(robotA[aCount] == robotB[i]){
                    sameLoaction++;
                }
            }
        }

        System.out.println(sameLoaction);

        
    }

    public static int moved(int[] arr, int x, Scanner sc){
        int position = 0;
        int start = 0;

        for(int i = 0; i < x; i++){
            int duration = sc.nextInt();
            char direct = sc.next().charAt(0);

            for(int j = start; j < start + duration; j++){
                if(direct == 'R'){
                    position++;
                    arr[j] = position;
                }

                if(direct == 'L'){
                    position--;
                    arr[j] = position;
                }
            }
        start += duration;
        }
        return start;
    }

}