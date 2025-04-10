import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] people = new Person[n];
        for(int i = 0; i < n; i++){
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            people[i] = new Person(a,b,c);
        }

        int k = 0;
        // for(int i = 1; i < n; i++){
        //     if(people[i-1].name.charAt(0) < people[i].name.charAt(0)){
        //         k = i;
        //     }
        // }
        // people[k].InfoPrint();

        for(int i = 1; i < n; i++){
            if(people[i].name.compareTo(people[k].name) > 0){
                k = i;
            }
        }

        people[k].InfoPrint();
    }
}

class Person{
    String name, address, location;

    public Person(String name, String address, String location){
        this.name = name;
        this.address = address;
        this.location = location;
    }

    public void InfoPrint(){
        System.out.println("name " + name);
        System.out.println("addr " + address);
        System.out.println("city " + location);
    }
}