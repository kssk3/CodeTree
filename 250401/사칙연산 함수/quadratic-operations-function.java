import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        masicNumber(a,o,c);
    }

    public static void masicNumber(int a, char o, int c){
        if(isOperator(o)){
            if(o == '+'){add(a, c);}
            if(o == '-'){sub(a, c);}
            if(o == '*'){mul(a, c);}
            if(o == '/'){div(a, c);}
        }else{
            System.out.println("False");
        }

    }

    private static boolean isOperator(char o){
        return (o == '+' || o == '-' || o == '/' || o == '*');
    }

    private static void add(int a, int c){
        System.out.println(a + " + " + c + " = " + (a+c));
    }

    private static void sub(int a, int c){
        System.out.println(a + " - " + c + " = " + (a-c));
    }

    private static void mul(int a, int c){
        System.out.println(a + " * " + c + " = " + (a*c));
    }

    private static void div(int a, int c){
        System.out.println(a + " / " + c + " = " + (a/c));
    }
}