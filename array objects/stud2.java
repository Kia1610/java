import java.util.Scanner;

class Student{
    int rno;
    String studname;
    int age;

    Scanner scanner = new Scanner(System.in);

    public void get(){
        System.out.println("enter roll number: ");
        rno = scanner.nextInt();
        System.out.println("enter student name: ");
        studname = scanner.next();
        System.out.println("enter age: ");
        age = scanner.nextInt();
    }
    public void post(){
        System.out.println("roll number of student " + rno);
        System.out.println("name of student " + studname);
        System.out.println("age of student " + age);
    }
}
public class stud2{
    public static void main(String args[])
    {
        Student[] students = new Student[3];
        for(int i=0;i<3;i++){
            students[i] = new Student();
            students[i].get();
        }
        for(int j=0;j<3;j++){
            students[j].post();
        }
    }
}