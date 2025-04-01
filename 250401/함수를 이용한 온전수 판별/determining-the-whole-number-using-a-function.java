import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(findOnJeonSu(a, b));
    }

    private static int findOnJeonSu(int a, int b){
        int count = 0;
        for(int i = a; i <= b; i++){
            if(validateOnJeonSu(i)){
                count++;
            }
        }
        return count;
    }

    private static boolean validateOnJeonSu(int i){
        if(i % 2 == 0){return false;}
        if(i % 10 == 5){return false;}
        if(i % 3 == 0 && i % 9 != 0){return false;}
        return true;
    }
}