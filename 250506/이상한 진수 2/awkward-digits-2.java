import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); 
        
        System.out.println(maxValueByFlippingOneBit(a));
    }
    
    public static int maxValueByFlippingOneBit(String a) {
        // 0을 1로 바꾸는 경우 (왼쪽에서 첫 번째 0을 찾아 1로 바꿈)
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '0') {
                StringBuilder sb = new StringBuilder(a);
                sb.setCharAt(i, '1');
                return Integer.parseInt(sb.toString(), 2);
            }
        }
        
        // 모든 비트가 1인 경우 (맨 앞을 0으로 바꿈)
        StringBuilder sb = new StringBuilder(a);
        sb.setCharAt(a.length() - 1, '0');
        return Integer.parseInt(sb.toString(), 2);
    }
}
