import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        Student[] students = new Student[in];

        for(int i = 0; i < in ; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();

            students[i] = new Student(h,w,i+1);
        }

        Arrays.sort(students);

        for(Student s : students){
            System.out.print(s.height + " ");
            System.out.print(s.weight + " ");
            System.out.println(s.number);
        }

    }
}

class Student implements Comparable<Student>{
    int height, weight, number;

    public Student(int height, int weight, int number){
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student s){
        if(this.height != s.height){return this.height - s.height;}
        return s.weight - this.weight;
    }
}