class cric
{
    String name;
    String bloodgroup;
    long contact;
    int age;

    void post()
    {
        System.out.println("name of cricketer: " + name);
        System.out.println("blood group of cricketer: " + bloodgroup);
        System.out.println("contact of cricketer: " + contact);
        System.out.println("age of cricketer: " + age);
    }
}
class score extends cric
{
    int wickets;
    int runs;
    int nomatch;

    void disp()
    {
        System.out.println("total wickets: " + wickets);
        System.out.println("total runs: " + runs);
        System.out.println("total number of matches: " + nomatch);
    }
}
class cricket1
{
    public static void main(String args[])
    {
        score s = new score();
        s.name = "lay";
        s.bloodgroup = "b+ve";
        s.contact = 1234567890;
        s.age = 19;
        s.wickets = 2;
        s.runs = 45;
        s.nomatch = 32;
        s.post();
        s.disp();
    }
}