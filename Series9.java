import java.util.Scanner;

public class Series9
{
    public void computeSeriesSum() 
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int sum = 0, term = 0;
        
        for (int i = 1; i <= n; i++)
        {
            term += i;
            sum += term;
        }
        
        System.out.println("Sum=" + sum);
    }
}