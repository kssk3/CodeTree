import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String loca = sc.next();
        int t = sc.nextInt();

        Solution solution = new Solution(code,loca,t);
        solution.print();
    }

}
class Solution{
    String code, location;
    int time;

    public Solution(String code, String location, int time){
        this.code = code;
        this.location = location;
        this.time = time;
    }
    public void print(){
        System.out.println("secret code : " + code);
        System.out.println("meeting point : " + location);
        System.out.println("time : " + time);
}
}

    