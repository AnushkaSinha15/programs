import java.util.Scanner;

public class Menu_Driven 
{
	int choice;
	void acceptdata()
	{
	System.out.println("Press 1 for Sum of series");
	System.out.println("Press 2 for Display Series");
        System.out.print("Enter your choice: ");
	Scanner kb = new Scanner(System.in);
	int choice = kb.nextInt();
        }
	void sum_of_series()
	{
            double sum = 0;
            for (int i = 1; i <= 20; i++)
            {
                if (i % 2 == 1)
                {
                    sum = sum + Math.pow(2, i);
                } 
                else
                {
                    sum = sum - Math.pow(2, i);
                }
            }
            System.out.println("Sum = " + sum);
        }
          void display_series()
          {
			for (int i = 1; i<= 5; i++)
			{
				for (int j = 1; j<= i; j++) 
				{
					System.out.print("1");
				}
				System.out.print(" ");
                        }
             }
              public void checking()
           {
         switch(choice)
        {
            case 1:
            sum_of_series();
            break;
            case 2:
            display_series();
            break;
            default:
            System.out.println("Invalid choice!");
        }
    }
         public static void main(String args[])
    {
             Menu_Driven obj= new Menu_Driven ();
            obj.acceptdata();
            obj.checking();
           
    }

}