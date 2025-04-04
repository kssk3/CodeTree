import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntegerNum numA = new IntegerNum(a);
        IntegerNum numB = new IntegerNum(b);

        printNum(numA, numB);

    }


    private static void printNum(IntegerNum numA,IntegerNum numB){
        if(numA.value > numB.value){
            numB.value += 10;
            numA.value *= 2;
        }else{
            numA.value += 10;
            numB.value *= 2;
        }

        System.out.println(numA.value + " " + numB.value);
    }

}
class IntegerNum{

    int value;

    public IntegerNum(int value){
        this.value = value;
    }
}