import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        printResult(m, d);
    }

    public static void printResult(int m, int d){
        int n = findLastNumber(m);

        if(validate(n, d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static int findLastNumber(int m){
        int day;

        switch(m){
            case 1 : case 3 : case 5 : case 7 :
            case 8 : case 10 : case 12 : 
            day = 31; 
            break;

            case 4 : case 6 :  case 9 : case 11 : 
            day = 30;
            break;

            case 2 : day = 28;
            break;

            default : day = 0;
        }
        return day;
    }

    private static boolean validate(int n, int d){
        return n >= d;
    }
}