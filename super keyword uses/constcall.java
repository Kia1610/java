class emp
{
    int eno;
    String ename;
    long contact;
    int age;

    emp(int a,String b,long c,int d)
    {
        eno = a;
        ename = b;
        contact = c;
        age = d;
    }
    void disp()
    {
        System.out.println("employee number: " + eno);
        System.out.println("employee name: " + ename);
        System.out.println("employee contact: " + contact);
        System.out.println("employee age: " +age);
    }
}
class details extends emp
{
    String dept;
    String desig;
    int salary;

    details(int a,String b,long c,int d,String e,String f,int g)
    {
        super(a,b,c,d);
        dept = e;
        desig = f;
        salary = g;
    }

    void disp2()
    {
        System.out.println("employee department: " + dept);
        System.out.println("employee designation: " + desig);
        System.out.println("employee salary: " + salary);   
    }
}
class constcall
{
    public static void main(String args[])
    {
        details d = new details(143,"krisha",1234567890,20,"Artificial intelligence","AI DEVELOPER",2000000);
        d.disp();
        d.disp2();
    }
}