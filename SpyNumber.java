import java.util.Scanner;

public class SpyNumber
 {
     int n;
void acceptdata()
{
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter number: ");
     n = kb.nextInt();
}
void calc()
{
int sum = 0;
int product = 1;
while (n>0)
 {
    int r = n % 10;
    sum = sum + r;
    product = product * r;
    n = n / 10;
}
if (sum == product)
 {
   System.out.println("Spy number");
}
else
 {
   System.out.println("Not a spy number");
}
}
   public static void main(String args[])
	{
	    SpyNumber obj = new SpyNumber();
            obj.acceptdata();
            obj.calc();

       }
    }