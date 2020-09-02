import java.util.Scanner;

public class Series11
{
    public void computeSeriesSum()
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) 
        {
            sum += Math.pow(a, i);
        }
        
        System.out.println("Sum=" + sum);
    }
}