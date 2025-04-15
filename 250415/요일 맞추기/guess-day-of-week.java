import java.util.*;

public class Main {

    public static final int[] DAY_OF_MONTH =
                        //1,  2, 3,  4,  5. , 6, 7 , 8 , 9 , 10, 11, 12
            new int []{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int sum1 = sum(m1,d1);

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int sum2 = sum(m2,d2);

        if(sum1 <= sum2){
            int number = sum2 - sum1;
            switch(number%7){
                case 0 : System.out.println("Mon"); break;
                case 1 : System.out.println("Tue"); break;
                case 2 : System.out.println("Wed"); break;
                case 3 : System.out.println("Thu"); break;
                case 4 : System.out.println("Fri"); break;
                case 5 : System.out.println("Sat"); break;
                case 6 : System.out.println("Sun"); break;
                default : System.out.println("없음");break;
            }
        }else{
            int number = sum1 - sum2;
            switch(number%7){
                case 1 : System.out.println("Sun"); break;
                case 2 : System.out.println("Sat"); break;
                case 3 : System.out.println("Fri"); break;
                case 4 : System.out.println("Thu"); break;
                case 5 : System.out.println("Wed"); break;
                case 6 : System.out.println("Tue"); break;
                case 0 : System.out.println("Mon"); break;
                default : System.out.println("없음");break;
            }
        }
    }

    public static int sum(int m, int d){
        int sum = 0;

        for(int i = 1; i < m; i++){
            sum += DAY_OF_MONTH[i];
        }
        return sum + d;
    }
}