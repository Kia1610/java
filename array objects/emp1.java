import java.util.Scanner;

class empdetail{
    int eno;
    String ename;
    String edesig;
    int esalary;

    Scanner sc = new Scanner(System.in);

    public void get()
    {
        System.out.println("enter employee number: ");
        eno = sc.nextInt();
        System.out.println("enter employee name: ");
        ename = sc.next();
        System.out.println("enter employee desig: ");
        edesig = sc.next();
        System.out.println("enter employee salary: ");
        esalary = sc.nextInt();
    }
    public void post()
    {
        System.out.println("employee number: " +eno);
        System.out.println("employee name: "+ename);
        System.out.println("employee designation: " +edesig);
        System.out.println("employee salary: " +esalary);
    }
}
public class emp1
{
    public static void main(String args[])
    {
        empdetail[] edetail = new empdetail[2];
        for(int i=0;i<2;i++){
        edetail[i] = new empdetail();
        edetail[i].get();
        }
         for(int j=0;j<4;j++){
        edetail[j].post();
        }
       
    }
}