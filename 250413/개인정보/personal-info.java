import java.util.*;

public class Main {

    public static final int NUMBER = 5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student[] students = new Student[NUMBER];

        for(int i = 0; i < NUMBER; i++){
            String name = sc.next();
            int he = sc.nextInt();
            double we = sc.nextDouble();

            students[i] = new Student(name,he,we);
        }

        Arrays.sort(students, new Comparator<String>(){
            @Override
        }
        
        );

        System.out.println("name");
        for(Student s : students){
            System.out.print(s.name + " ");
            System.out.print(s.height + " ");
            System.out.println(s.weight);
        }
    }
}

class Student{
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

}