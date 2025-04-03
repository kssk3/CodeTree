import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        printSeason(y,m,d);
    }

    public static void printSeason(int y, int m, int d){
        int day = validateYear(y, m);
        if(day >= d){
            findSeason(m);
        }else{
            System.out.println("-1");
        }
    }

    private static void findSeason(int m){
        if(m == 3 || m == 4 || m == 5){
            System.out.println("Spring");
        }else if(m == 6 || m == 7 || m == 8){
            System.out.println("Summer");
        }else if( m == 9 || m == 10 || m == 11){
            System.out.println("Fall");
        }else{
            System.out.println("Winter");
        }
    }

    public static int validateYear(int y, int m){
        if(y % 4 == 0){
            if(y % 100 != 0 || (y % 100 == 0 && y % 400 == 0)){
                return leapYear(m);
            }
        }
        return commonYear(m);
    }

    private static int leapYear(int m){
        int day;
        switch(m){
            case 1 : case 3 : case 5 : case 7 : 
            case 8 : case 10 :case 12 : 
            day = 31;
            break;

            case 4 : case 6 : case 9 : case 11 : 
            day = 30;
            break;
                
            case 2 : day = 29; break;

            default : day = -1; break;
        }
        return day;
    }

    private static int commonYear(int m){
        int day;
        switch(m){
            case 1 : case 3 : case 5 : case 7 : 
            case 8 : case 10 :case 12 : 
            day = 31;
            break;

            case 4 : case 6 : case 9 : case 11 : 
            day = 30;
            break;
                
            case 2 : day = 28; break;

            default : day = -1; break;
        }
        return day;
    }

}