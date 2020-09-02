import java.util.Scanner;

public class KSeries5
{
    public void computeSeriesSum() {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        
        int a = 1, b = 1;
        int sum = a + b;

        for (int i = 3; i <= n; i++) {
            int term = a + b;
            sum += term;
            a = b;
            b = term;
        }
        
        System.out.println("Sum=" + sum);
    }
    
}