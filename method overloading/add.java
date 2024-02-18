class madd
{
    void add(int a)
    {
        int num1 = a+a;
        System.out.println("add of single number " +num1);
    }
    void add(int a,int b)
    {
        int num2 = a+b;
        System.out.println("add of two numbers " +num2);
    }
    void add(int a,int b,int c)
    {
        int num3 = a+b+c;
        System.out.println("add of three numbers " +num3);
    }
}
class add
{
    public static void main(String args[])
    {
        madd ob1 = new madd();
        ob1.add(4,7);
        ob1.add(4);
        ob1.add(3,6,7);
    }
}