class emp
{
    int eno;
    String ename;
    int age;

    void post()
    {
        System.out.println("number of employee: " +eno);
        System.out.println("name of employee: " +ename);
        System.out.println("age of employee: " +age);
    }
}
class details extends emp
{
    String dept;
    String desig;
    long contact;
    int msalary;
    int bonus;
    int pf;

    void disp()
    {
        System.out.println("department of employee: " +dept);
        System.out.println("designation of employee: " +desig);
        System.out.println("contact number of employee: " +contact);
        System.out.println("salary of employee: " +msalary);
        System.out.println("bonus of employee: " +bonus);
        System.out.println("provident fund: " +pf);
    }

    int annsal()
    {
        return((msalary+bonus-pf)*12); 
    }
}
class employee1
{
    public static void main(String args[])
    {
        details det = new details();
        det.eno = 101;
        det.ename = "krisha";
        det.age = 20;
        det.dept = "artificial intelligence";
        det.desig = "AI-DEVELOPER";
        det.contact = 123456789;
        det.msalary = 200000;
        det.bonus = 3000;
        det.pf = 4500;
        det.post();
        det.disp();
        System.out.println("total annual salary: " +det.annsal());
    }
}