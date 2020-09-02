import java.util.Scanner;
class Employee
{
     int pan;
     String name;
     double taxIncome;
     double tax;
    public void input()
    {
       Scanner kb = new Scanner (System.in);
        System.out.print("PAN Number: ");
        pan = kb.nextInt();
        System.out.print("Name: ");
        name = kb.next();
        System.out.print("Taxable Income: ");
        taxIncome =kb.nextDouble();
    }
    public void calc()
    {
        if(taxIncome <= 100000.0)
            tax = 0.0;
        else if(taxIncome <= 150000.0)
            tax = 10.0 / 100 * (taxIncome - 100000.0);
        else if(taxIncome <= 250000.0)
            tax = 5000.0 + 20.0 / 100 * (taxIncome - 150000.0);
        else
            tax = 25000.0 + 30.0 / 100 * (taxIncome - 250000.0);
    }
    public void display()
    {
        System.out.println("PAN Number: " + pan);
        System.out.println("Name: " + name);
        System.out.println("Taxable Income: Rs. " + taxIncome);
        System.out.println("Tax: Rs. " + tax);
    }
    public static void main(String args[])
    {
        Employee obj = new Employee();
        obj.input();
        obj.calc();
        obj.display();
    }
}