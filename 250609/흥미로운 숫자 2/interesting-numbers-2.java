import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        int totalCnt = 0;
        for(int i = x; i <= y; i++){
            if(found(i))totalCnt++;
        }
        System.out.println(totalCnt);

    }
    private static boolean found(int x){
        String s = Integer.toString(x);
        String[] arr = s.split("");
        
        if(arr.length <= 1) return false;
        
        int[] digitCount = new int[10];
        
        for(String digit : arr) {
            digitCount[Integer.parseInt(digit)]++;
        }
        
        List<Integer> counts = new ArrayList<>();
        for(int count : digitCount) {
            if(count > 0) {
                counts.add(count);
            }
        }
        
        if(counts.size() != 2) return false;
        
        Collections.sort(counts);
        return counts.get(0) == 1 && counts.get(1) == arr.length - 1;
    }
    
}