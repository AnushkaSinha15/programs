public class Tribonacci
{
    public void displaySeries()
    {
        
        int a = 0, b = 1, c = 2;
        
        System.out.print(a + ", " + b + ", " + c);
        
        for (int i = 0; i < 7; i++)
        {
            int n = a + b + c;
            System.out.print(", " + n);
            a = b;
            b = c;
            c = n;
        }
    }
}
