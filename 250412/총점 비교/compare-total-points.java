import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            String na = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            students[i] = new Student(na,kor,eng,math);
        }

        Arrays.sort(students);

        for(Student student : students){
            System.out.print(student.name + " ");
            System.out.print(student.kor + " ");
            System.out.print(student.eng + " ");
            System.out.print(student.math + "\n");
        }
    }
}

class Student implements Comparable<Student> {

    String name;
    int kor, eng, math;
    
    public Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student){
        return (this.kor + this.eng + this.math) - (student.kor + student.eng + student.math);
    }
    
}