import java.util.Scanner;

public class Series7
{
    public void computeSeriesSum() 
    {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        
        int sum = 0;
        
        for (int i = 1, j = 2; i <= n; i++, j = j + 2)
        {
            if (i % 2 == 0)
            {
                sum -= j;
            }
            else
            {
                sum += j;
            }
        }
        
        System.out.println("Sum=" + sum);
    }
}