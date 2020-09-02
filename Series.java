import java.util.Scanner;
class Series
{
    Scanner sc = new Scanner(System.in);
    int x,choice;
    void acceptdata()
    {
        System.out.println("1. series");
        System.out.println("2. series");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        x=sc.nextInt();
    }
        void series1()
        {
        System.out.print("x = ");
        double x = sc.nextInt();
        double sum = 0.0;
        int sign = 1;
        for(int i = 1; i <= 10; i++)
        {
            sum += sign * i * 2;
            sign *= -1;
        }
        System.out.println("Series 1 sum: " + sum);
    }
    void series2()
    {
        double sum = 0.0;
        double d = 2;
        while(d <= 20)
        {
            sum += x / d;
            d += 3;
        }
        System.out.println("Series 2 sum: " + sum);
    }
    public void checking()
    {
         switch(choice)
        {
            case 1:
            series1();
            break;
            case 2:
            series2();
            break;
            default:
            System.out.println("Invalid choice!");
        }
    }
         public static void main(String args[])
    {
            Series obj= new Series();
            obj.acceptdata();
            obj.checking();
           
    }
}
