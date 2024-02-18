class stud
{
    int rollno;
    String name;
    int m1,m2,m3;

    void disp()
    {
        System.out.println("roll number of student: " + rollno);
        System.out.println("name of student: " + name);
        System.out.println("marks of java: " + m1);
        System.out.println("marks of web designing:" + m2);
        System.out.println("marks of  .NET: " + m3);
    }
    int result()
    {
        return(m1+m2+m3);
    }
    float percentage()
    {
        float r= m1+m2+m3/3.0f;
        return r;
    }
}
class objstud
{
    public static void main(String args[])
    {
        stud obj1 = new stud();
        obj1.rollno=143;
        obj1.name="krisha";
        obj1.m1=45;
        obj1.m2=43;
        obj1.m3=45;
        obj1.disp();
        obj1.result();
        System.out.println("result " +obj1.result());
        obj1.percentage();
        System.out.println("percentage "+obj1.percentage());
    }
}