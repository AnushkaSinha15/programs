import java.util.Scanner;

public class Book_Fair
 {
    String Bname;
    double price;

   public Book_Fair()
 {
     Bname = null;
    price = 0.0;
}

public void Input()
    {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter book name: ");
    Bname = kb.nextLine();
    System.out.print("Enter price: ");
    price = kb.nextDouble();
   }

public void calculate()
 {
double discountPercentage = 0;
if (price <= 1000)
{
	discountPercentage = 2;
}
else if (price > 1000 && price <= 3000) 
{
	discountPercentage = 10;
} 
else if (price > 3000) 
{
discountPercentage = 15;
}
price = price - (price * discountPercentage / 100);
}
public void display() 
{
System.out.println("Name: " + Bname);
System.out.println("Price after discount: " + price);
}
public static void main(String[] args) 
{
Book_Fair bookFair = new Book_Fair();
bookFair.Input();
bookFair.calculate();
bookFair.display();
}
}