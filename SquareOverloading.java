public class SquareOverloading
{
    void prnsqr(int i ) 
    {
        System.out.println("integers "+i+"square is "+i*i);
    }
    void prnsqr (char ch)
    {
        System.out.println(ch+"is a character "+"thus no square");
    }
    void prnsqr(double r)
    {
        System.out.println("Double"+ r+"square is"+r*r);
    }
void prnsqr(float y)
    {
        System.out.println("float"+y+"square is "+y*y);
    }
    public static void main()
    {
        SquareOverloading obj=new SquareOverloading ();
        obj.prnsqr(55);
        obj.prnsqr('E');
        obj.prnsqr(74);
        obj.prnsqr(43f);
    }
}
