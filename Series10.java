import java.util.Scanner;

public class Series10
{
    public void computeSeriesSum()
    {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        double seriesSum = 0.0;
        int sum = 0;
        double prod = 1.0;
        
        for (int i = 1; i <= n; i++) 
        {
            sum += i;
            prod *= i;
            double term = sum / prod;
            seriesSum += term;
        }

        System.out.println("Sum=" + seriesSum);
    }
}
