import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] people = new Person[n];

        for(int i = 0; i < n; i++){
            String na = sc.next();
            int h = sc.nextInt();
            int w = sc.nextInt();

            people[i] = new Person(na, h, w);
        }

        Arrays.sort(people);

        for(Person s : people){
            System.out.println(s.name + " " + s.height + " " + s.weight);
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
        return this.height - p.height;
    }
}