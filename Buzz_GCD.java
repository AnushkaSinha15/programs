import java.util.Scanner;
class Buzz_GCD
{
    int choice;
    Scanner sc = new Scanner(System.in);
    void input (int ch)
    {
        choice=ch;
    }
    void accept ()
    {
       
        System.out.println(" Press 1 Buzz number ") ;
        System.out.println(" Press 2 GCD of two numbers" );
        System.out.println( "Enter your choice:" );
         choice = sc.nextInt();
    }
    void buzz_num()
    {
            System.out.print("enter a number ");
            int n = sc.nextInt();
            if(n % 10 == 7 || n % 7 == 0)
            {
                System.out.println("Buzz number");
            }
            else
            {
                System.out.println("Not a buzz number");
            }
        }
            void gcd()
 {
            System.out.println("First number: ");
            int a =sc.nextInt();
            System.out.println("Second number: ");
            int b = sc.nextInt();
            while(a % b != 0)
            {
                int rem = a % b;
                a = b;
                b = rem;
            }
            System.out.println("GCD = " + b);
        }
        void checking ()
        {
            
            switch(choice)
            {
                case 1:
                buzz_num();
                break;
                case 2:
                gcd();
                break;
            default:
            System.out.println("Invalid Input");
            break;
        }
    }

public static void main(String args[])
{
    Buzz_GCD obj = new Buzz_GCD();
    obj.checking ();
}
}

    
 