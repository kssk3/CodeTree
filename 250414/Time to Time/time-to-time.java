import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        Time timeA = new Time(h1%12,m1);

        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        Time timeB = new Time(h2%12,m2);

        System.out.println(timeB.sum() - timeA.sum());
        
        
    }
}

class Time{
    int hour, min;

    public Time(int hour, int min){
        this.hour = hour;
        this.min = min;
    }

    public int sum(){
        return (this.hour * 60) + this.min;
    }
}