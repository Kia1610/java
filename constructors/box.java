class defbox
{
    int height;
    int width;
    int depth;

    defbox()
    {
        height=15;
        width=10;
        depth=5;
    }
    void put()
    {
        System.out.println("height:" +height);
        System.out.println("width:" +width);
        System.out.println("depth:" +depth);
    }
    int vol()
    {
     int v = height*width*depth;
     return v;
    }
}
    class box
    {
        public static void main(String args[])
        {
            defbox obj = new defbox();
            obj.put();
            System.out.println("volume is = " +obj.vol());
        }
    }
