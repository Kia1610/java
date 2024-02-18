class stud
{
    int rno;
    String name;
    String add;

    stud(int a,String b,String c)
    {
        rno = a;
        name = b;
        add = c;
    }
    void disp()
    {
        System.out.println("roll number of student: " + rno);
        System.out.println("name of student: " + name);
        System.out.println("address of student: " + add);
    }
}
class marks extends stud
{
    int m1;
    int m2;
    int m3;

    marks(int a,String b,String c,int d,int e,int f)
    {
      super(a,b,c);
      m1 = d;
      m2 = e;
      m3 = f; 
    }
    void disp2()
    {
        System.out.println("java: " +m1);
        System.out.println("python: "+ m2);
        System.out.println("c++: " + m3);
    }

     int totm()
    {
        int t = m1+m2+m3;
        return t;
    }
    float per()
    {
        return(m1+m2+m3/100);
    }
}
class student
{
    public static void main(String args[])
    {
        marks m = new marks(143,"krisha","gopal nagar",45,50,45);
        m.disp();
        m.disp2();
        int t = m.totm();
        System.out.println("total marks: " + t);
        m.per();
        System.out.println("percentage: " + m.per()+"%");
    }
}