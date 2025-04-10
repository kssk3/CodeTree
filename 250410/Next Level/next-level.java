import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int n = sc.nextInt();

        User user1 = new User("codetree",10);
        user1.InfoPrint();

        User user2 = new User(str,n);
        user2.InfoPrint();
        
    }
}

class User{

    String id;
    int level;

    public User(String id,int level){
        this.id = id;
        this.level = level;
    }

    public void InfoPrint(){
        System.out.println("user " + id + " lv " + level);
    }
}