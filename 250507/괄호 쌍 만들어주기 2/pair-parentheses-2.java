import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();

        char[] arr = new char[len];

        for(int i = 0; i < len; i++){
            arr[i] = s.charAt(i);
        }
        int count = 0;
        for(int i = 0; i < len - 3; i++){
            if(arr[i] == '(' && arr[i + 1] == '('){    
                for(int j = 1; j < len - 1; j++){
                    if(arr[j] == ')' && arr[j + 1] == ')'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}