import java.util.Scanner;

public class Population
{
     float p;
     float r;

    public Population(float a, float b)
    {
        p = a;
        r = b;
    }

    public void print()
    {
        float q = p;
        for (int y = 2001; y <= 2007; y++) 
        {
            q = q * (1 + r / 100);
            System.out.println("Population in " + y + ": " + q);
        }
    }
    
    public static void main(String args[])
    {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter population in the year 2000: ");
        float x = in.nextFloat();
        System.out.print("Enter growth rate: ");
        float y = in.nextFloat();
        
        Population obj = new Population(x,y);
        obj.print();
    }
}