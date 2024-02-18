class stud
{
    int rollno;
    String name;
    int marks1;
    int marks2;
    int marks3;

    stud(int a,String b,int c,int d,int e)
    {
        rollno = a;
        name = b;
        marks1 = c;
        marks2 = d;
        marks3 = e;
    }

    void put()
    {
        System.out.println("student roll number " +rollno);
        System.out.println("student namer " +name);
        System.out.println("student marks of java " +marks1);
        System.out.println("student IOT " +marks2);
        System.out.println("student web designing " +marks3);
    }

    int result()
    {
        return(marks1+marks2+marks3);
    }
    float percentage()
    {
         float percentage = marks1+marks2+marks3/100;
         return percentage;
    }
}
class parastud
{
    public static void main(String args[])
    {
        stud ob1 = new stud(143,"krisha",45,50,30);
        ob1.put();
        System.out.println("total marks  " +ob1.result());
         System.out.println("percentage  " +ob1.percentage());
        
    }
}