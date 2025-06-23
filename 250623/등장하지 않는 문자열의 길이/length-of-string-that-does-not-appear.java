import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = sc.next();
        char[] crr = str.toCharArray();

        int min = Integer.MAX_VALUE;

        for(int i = 1; i <= n; i++){
            List<String> list = new ArrayList();
            boolean found = true;;

            for(int j = 0; j <= n - i; j++){
                String s = "";
                for(int k = j; k < j + i; k++){
                    s += crr[k];
                }

                if(!list.contains(s)){
                    list.add(s);
                }else{
                    found = false;
                }
            }
            if(found){
                min = Math.min(min, list.get(0).length());
            }
        }

        System.out.println(min);
    }
}