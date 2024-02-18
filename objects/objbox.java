class box
{
    int height;
    int width;
    int depth;

    void disp()
    {
        System.out.println("height: " +height);
        System.out.println("width: " +width);
        System.out.println("depth: " +depth);
    }
    int vol()
    {
        return(height*width*depth);
    }
}
class objbox
{
    public static void main(String args[])
    {
        box obj1 = new box();
        obj1.height=10;
        obj1.width=7;
        obj1.depth=4;
        obj1.disp();
        obj1.vol();
        System.out.println("volume of box is " +obj1.vol());
    }
}