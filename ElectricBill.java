import java.util.Scanner;

public class ElectricBill
 {
	 String n;
	 int units;
	 double bill;

	public void accept()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter name: ");
		n = kb.next();
		System.out.print("Enter units: ");
		units = kb.nextInt();
	}
	public void calculate()
	{
		if (units<= 100)
		{
			bill = units * 2;
		}
		else if (units>100 && units<=300)
		{
			bill = units * 3;
		}
		else 
		{
			bill = units * 5;
			double surcharge = bill * 2.5 / 100;
			bill = bill + surcharge;
		}
	}
	public void print() 
	{
		System.out.println("Name of the customer: " +n);
		System.out.println("Number of units consumed: " +units);
		System.out.println("Bill amount: " +bill);
	}
	public static void main(String[] args) 
	{
		ElectricBill EB = new ElectricBill();
		EB.accept();
		EB.calculate();
		EB.print();
	}
}