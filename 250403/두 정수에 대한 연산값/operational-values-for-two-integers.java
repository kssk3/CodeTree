import java.util.*;

public class Main {

    public static int a;
    public static int b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        validateNumber(a, b);
    }

    public static void validateNumber(int a, int b){
        IntWrapper wraA = new IntWrapper(a);
        IntWrapper wraB = new IntWrapper(b);

        if(a > b){
            wraA.value += 25;
            wraB.value *= 2; 
        }else{
            wraB.value += 25;
            wraA.value *= 2;
        }

        System.out.println(wraA.value + " " + wraB.value);
    }
}

class IntWrapper{

    public int value;

    public IntWrapper(int value){
        this.value = value;
    }

}