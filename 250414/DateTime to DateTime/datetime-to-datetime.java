import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        Day dayA = new Day(11, 11, 11);
        Day dayB = new Day(y,m,d);

        if(dayB.sum() > dayA.sum()){
            System.out.println(dayB.sum() - dayA.sum());
        }else if(dayB.sum() == dayA.sum()){
            System.out.println(dayB.sum() - dayA.sum());
        }else{
            System.out.println("-1");
        }
    }
}

class Day{
    int day, hour, minute;

    public Day(int day, int hour, int minute){
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public int sum(){
        return ((24 * 60 * (this.day - 1)) + (hour * 60) + minute);
    }
}