import java.util.Scanner;

class student
{
    int rollno;
    String name;
    int m1;
    int m2;
    int m3;
    
    void disp()
        {
            System.out.println("roll number of student " + rollno);
            System.out.println("name of student " + name);
            System.out.println("marks of java " + m1);
            System.out.println("marks of python "  + m2);
            System.out.println("marks of C " + m3);
        }

        void calculateresult()
        {
            double average = (m1+m2+m3) /3;
            System.out.println("average marks: " + average);
            if (average>=60)
            {
                System.out.println("pass");
            }else{
                System.out.println("failed");
            }
        }
}
class arraystud
{
    public static void main(String args[])
    {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("enter the number of student: ");
        int nstud = scanner.nextInt();

        student[] students = new student[nstud];
        for(int i = 0;i<=nstud;i++)
        {
            students[i]=new student();
            System.out.println("enter student details" + (i + i) + ":");
            System.out.println("roll number of student ");
            students[i].rollno = scanner.nextInt();
            System.out.println("name of student ");
            students[i].name = scanner.next();
            System.out.println("marks of java ");
            students[i].m1 = scanner.nextInt();
            System.out.println("marks of python ");
            students[i].m2 = scanner.nextInt();
            System.out.println("marks of C ");
            students[i].m3 = scanner.nextInt();
             
        }
        {
             student.disp();
                student.calculateresult();
        }
            
           

        scanner.close();
        
    }
}