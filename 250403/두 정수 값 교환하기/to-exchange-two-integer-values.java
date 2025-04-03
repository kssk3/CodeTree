import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper n = new IntWrapper(a);
        IntWrapper m = new IntWrapper(b);

        swap(n, m);

        System.out.println(n.value + " " + m.value);

    }

    private static void swap(IntWrapper n, IntWrapper m){
        int temp = m.value;
        m.value = n.value;
        n.value = temp;
    }
}
    class IntWrapper{
        int value;

        public IntWrapper(int value){
            this.value = value;
        }
    }