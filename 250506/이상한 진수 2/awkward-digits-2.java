import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Integer integer = (Integer) a;

        String s = integer.toString();
        int len = s.length();

        String[] strArr = s.split("");

        for(int i = 1; i < len; i++){
            if(strArr[i] != "1"){
                strArr[i] = "1";
                break;
            }
        }
        s = "";
        for(int i = 0; i < len; i++){
            s += strArr[i];
        }

        System.out.println(Integer.parseInt(s,2));


    }
}