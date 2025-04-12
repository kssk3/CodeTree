import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            String na = sc.next();
            int k = sc.nextInt();
            int e = sc.nextInt();
            int m = sc.nextInt();

            students[i] = new Student(na,k,e,m);
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++){
            System.out.println(students[i].name + " " + students[i].kor + " " + students[i].eng + " " + students[i].math);
        }
    }
}

class Student implements Comparable<Student>{
    public String name;
    public int kor, eng, math;

    public Student(String name,int kor,int eng,int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student){
        if(this.kor == student.kor){
            if(student.eng == this.eng){
                return student.math - this.math;
            }else{
                return student.eng - this.eng;
            }
        }
        return student.kor - this.kor;
    }
}