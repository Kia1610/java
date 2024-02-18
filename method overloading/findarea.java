class movr
{
    void area(int l)
    {
        int areasquare = l*l;
        System.out.println("area of square " +areasquare);
    }
    void area(int l,int b)
    {
        int arearec = l*b;
        System.out.println("area of rectangle " +arearec);
    }
    void area(double b,double h)
    {
        double areatriangle = b*h*0.5;
        System.out.println("area of triangle " +areatriangle);
    }
}
class findarea
{
    public static void main(String args[])
    {
        movr ob1 = new movr();
        ob1.area(9,8);
        ob1.area(6.7,8.9);
        ob1.area(5);
    }
}