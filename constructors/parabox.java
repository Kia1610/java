class box
{
    int height;
    int width;
    int depth;

    box(int a,int b,int c)
    {
        height = a;
        width = b;
        depth = c;
    }
        void put()
        {
        System.out.println("height:" +height);
        System.out.println("width:" +width);
        System.out.println("depth:" +depth);
        }
        int vol()
        {
            return(height*width*depth);
        }
}
class parabox
{
    public static void main(String args[])
    {
        box obj1 = new box(20,15,5);
        obj1.put();
        System.out.println("volume is  " +obj1.vol());
    }
}