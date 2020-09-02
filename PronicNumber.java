import java.util.Scanner;

public class PronicNumber
{
    public void pronicCheck()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = in.nextInt();
        
        boolean isPronic = false;
        
        for (int i = 1; i <= num - 1; i++) 
        {
            if (i * (i + 1) == num)
            {
                isPronic = true;
                break;
            }
        }
        if (isPronic)
            System.out.println(num + " is a pronic number");
        else
            System.out.println(num + " is not a pronic number");
    }
}