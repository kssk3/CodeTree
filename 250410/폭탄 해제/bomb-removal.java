import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char c = sc.next().charAt(0);
        int n = sc.nextInt();

        Solution solution = new Solution(s,c,n);
        solution.print();
    }
}

class Solution{
    String code;
    char color;
    int time;

    public Solution(String code, char color,int time){
        this.code = code;
        this.color = color;
        this.time = time;
    }

    public void print(){
        System.out.println("code : " + code);
        System.out.println("color : " + color);
        System.out.println("second : " + time);
    }
}
