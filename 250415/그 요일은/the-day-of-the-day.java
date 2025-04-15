import java.util.*;

public class Main {

    public static int[] day_of_month =
         new int[] {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] day =
         new String[]{"Mon", "Tue", "Wed", "Thu","Fri","Sat","Sun"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int total = totalDays(m2,d2) - totalDays(m1,d1);
        String str1 = sc.next();

        int count = 0;
        for(int i = 0; i <= total; i++){
            String current = day[(total - i)%7];
            if(current.equals(str1)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static int totalDays(int m, int d){
        int total = 0;
        for(int i = 1; i < m; i++){
            total += day_of_month[i];
        }
        return total + d;
    }
}