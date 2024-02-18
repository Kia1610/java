class cric
{
    String name;
    String bgrp;
    long contact;
    int age;

    void disp()
    {
        System.out.println("name of crickter: " + name);
        System.out.println("blood group of crickter: " + bgrp);
        System.out.println("contact of crickter: " + contact);
        System.out.println("age of crickter: " + age);
    }
}
class score extends cric
{
    int wickets;
    int runs;
    int nomat;

    void disp2()
    {
         System.out.println("total wickets: " + wickets);
         System.out.println("total runs: " + runs);
         System.out.println("total matches: " + nomat);
    }
    score(String a,String b,long c,int d,int e,int f,int g)
    {
        name = a;
        bgrp = b;
        contact = c;
        age = d;
        wickets= e;
        runs = f;
        nomat = g;
    }
}
class cricket2
{
    public static void main(String args[])
    {
        score s = new score("lay","b+ve",1234567890,20,3,1024,23);
        s.disp();
        s.disp2();
    }
}