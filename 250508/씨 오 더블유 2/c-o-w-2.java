import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        char[] charArr = new char[n];

        for(int i = 0; i < n; i++){
            charArr[i] = s.charAt(i);
        }
        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(charArr[i] == 'C' && charArr[j] == 'O' && charArr[k] == 'W'){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}