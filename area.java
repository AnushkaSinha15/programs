

public class area
{
    
     double x;
     double pie;
    public area()
    { 
        x = 0;
    }
    public void areacir()
    {
        pie=3.14;
        double a=pie*x*x;
        System.out.println(a);
    }
    public static void main(String args[])
    {
       area obj= new area();
       obj.areacir();
    }
}
