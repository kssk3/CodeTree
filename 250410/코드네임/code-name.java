import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] person = new Person[5];

        for(int i = 0; i < 5; i++){
            String t = sc.next();
            int m = sc.nextInt();
            person[i] = new Person(t,m);
        }

        String e = person[0].codeName;
        int min = person[0].point;
        for(int i = 1; i < 5; i++){
            if(min > person[i].point){
                min = person[i].point;
                e = person[i].codeName;
            }
        }

        System.out.println(e + " " + min);
    }
}

class Person{

    String codeName;
    int point;

    public Person(){
        this.codeName = "";
        this.point = 0;
    }

    public Person(String a, int b){
        this.codeName = a;
        this.point = b;
    }
}