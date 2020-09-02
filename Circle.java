class Circle 
{
    double r;
    double area;
    void init (int radius)
    {
        r=radius ;
    }
    void calcArea()
    {
        final double pi=3.14;
        area = pi*r*r;
    }
    void display()
    {
        System.out.println("the area of the circle "+area);
    }
    public static void main (String args[])
    {
        Circle obj;
        obj = new Circle() ;
        obj.init(65);
        obj.display();
    }
}
 