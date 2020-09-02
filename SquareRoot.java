import java.util.Scanner;
public class SquareRoot
 {
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        if (n < 0)
        {
            System.out.println("Cannot find square root of a negative number");
            System.exit(0);
        }
        double sqrt = Math.sqrt(n);
        System.out.println("Square root of " + n + " = " + sqrt);
    }
}