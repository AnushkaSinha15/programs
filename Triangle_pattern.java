import java.util.Scanner;

public class Triangle_pattern 
 {
     int choice;
     Scanner kb = new Scanner(System.in);
   void acceptdata()
    {
    Scanner kb = new Scanner(System.in);
    System.out.println("1. Floyd's triangle");
    System.out.println("2. ICSE Pattern");
    System.out.print("Enter your choice: ");
    choice = kb.nextInt();
   }
   void floyd_triangle()
   {
    System.out.print("Enter n (number of lines): ");
    int n = kb.nextInt();
    int currentNumber = 1;
     for (int i = 1; i <= n; i++)
    {  
	for (int j = 1; j <= i; j++)
	{
		System.out.print(currentNumber + " ");
		currentNumber++;
	}
	System.out.println();
    }
}
    void  icse_pattern()
    {
     System.out.print("Enter word: ");
     String word = kb.next();
     for (int i = 0; i < word.length(); i++) 
     {
	for (int j = 0; j <= i; j++)
	{
		System.out.print(word.charAt(j) + " ");
	}
	System.out.println();
     }
    }
      public void checking()
    {
         switch(choice)
        {
            case 1:
            floyd_triangle();
            break;
            case 2:
            icse_pattern();
            break;
            default:
            System.out.println("Invalid choice!");
        }
    }
         public static void main(String args[])
    {
            Triangle_pattern  obj= new Triangle_pattern ();
            obj.acceptdata();
            obj.checking();
           
    }

}