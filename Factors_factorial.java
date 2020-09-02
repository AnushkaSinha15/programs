import java.util.Scanner;
class Factors_factorial
{
    int choice;
    int n;
    Scanner sc = new Scanner(System.in);
    void input (int ch)
    {
        choice=ch;
    }    
    void acceptdata()
    {
        System.out.println("1. Factors");
        System.out.println("2. Factorial");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
    }
        void factors()
        {
            System.out.print("Number: ");
            n = sc.nextInt();
            for(int i = 1; i < n; i++)
            {
                if(n % i == 0)
              {
                    System.out.print(i + "\t");
              }
        }
    }
            void factorial()
    {
            System.out.print("Number: ");
            n = sc.nextInt();
            int f = 1;
            for(int i = 1; i <= n; i++)
            {
                f *= i;
            }
            System.out.println(f);
    }
        public void checking()
    {
         switch(choice)
        {
            case 1:
            factors();
            break;
            case 2:
            factorial();
            break;
            default:
            System.out.println("Invalid choice!");
        }
    }
         public static void main(String args[])
    {
            Factors_factorial obj= new Factors_factorial();
            obj.acceptdata();
            obj.checking();
           
    }
}