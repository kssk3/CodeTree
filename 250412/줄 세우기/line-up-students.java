import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int number = i + 1;

            students[i] = new Student(h,w, number);
        }

        Arrays.sort(students);

        for(Student student : students){
            System.out.print(student.height + " ");
            System.out.print(student.weight + " ");
            System.out.println(student.number);
        }
    }
}

class Student implements Comparable<Student> {
    int height, weight, number;

    public Student(int height, int weight, int number){
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student student){
        if(student.height == this.height){
            if(student.weight == this.weight){
                return this.number - student.number;
            }
            return student.weight - this.weight;
        }

        return student.height - this.height;
    }
}