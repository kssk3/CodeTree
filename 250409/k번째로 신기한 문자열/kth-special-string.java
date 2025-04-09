import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String s = sc.next();

        ArrayList<String> list = new ArrayList();

        for(int i = 0; i < n; i++){
            String text = sc.next();
            if(text.contains(s)){
                list.add(text);
            }
        }

        Collections.sort(list);

        String str = list.get(k);

        System.out.println(str);
    }
}