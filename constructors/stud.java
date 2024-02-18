class defstud
{
    int rollno;
    String name;
    int marks1;
    int marks2;
    int marks3;

    defstud()
    {
        rollno = 143;
        name = "krisha";
        marks1 = 78;
        marks2= 67;
        marks3 = 56;
    }
    void disp()
    {
        System.out.println("student roll number " +rollno);
        System.out.println("student namer " +name);
        System.out.println("student marks of java " +marks1);
        System.out.println("student IOT " +marks2);
        System.out.println("student web designing " +marks3);
    }
    int result()
    {
        int r = marks1+marks2+marks3/100;
        return r;
    }
}
class stud
{
    public static void main(String args[])
    {
        defstud obj1 = new defstud();
        obj1.disp();
        System.out.println("result is " +obj1.result());

    }
}