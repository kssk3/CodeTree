import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Person[] people = new Person[n];

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            people[i] = new Person(name,height,weight);
        }

        Arrays.sort(people);

        for(Person p : people){
            System.out.print(p.name + " ");
            System.out.print(p.height + " ");
            System.out.println(p.weight);
        }
    }
}

class Person implements Comparable<Person>{
    String name;
    int height, weight;

    public Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person p){
        if(this.height == p.height){
            return p.weight - this.weight;
        }

        return this.height - p.height;
    }
}