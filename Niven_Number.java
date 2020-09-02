import java.util.Scanner;
public class Niven_Number
  {
       int number;
       int sumOfDigits = 0;
       void acceptdata()
       {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
       }
        void calc()
            {
		int copyOfNum = number;
		while (number > 0)
		{
			int remainder = number % 10;
			number = number / 10;
			sumOfDigits = sumOfDigits + remainder;
		}
		if (copyOfNum % sumOfDigits == 0)
		{
			System.out.println("Niven number");
		}
		else 
		{
			System.out.println("Not a niven number");
		}
             }
       public static void main(String args[])
	{
	    Niven_Number obj = new Niven_Number();
            obj.acceptdata();
            obj.calc();
	}
}
	
