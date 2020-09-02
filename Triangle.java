import java.util.Scanner;
class Triangle
{
        Scanner sc = new Scanner(System.in);
        int choice;
        void input (int ch)
        {
            choice=ch;
        }
        void accept ()
      {
        System.out.println("Type 1 for Triangle");
        System.out.println("Type 2 for Inverted Triangle");
        System.out.print("Enter your choice: ");
         choice = sc.nextInt();
          }
        public void tri1()
        {
            System.out.print("Enter a numner = ");
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++)
            {
               for(int j = 1; j <= i; j++)
                { 
                    System.out.print(i + " "); 
                } 
                System.out.println(); 
            } 
        }
             public void t2(int n)
            {
            System.out.print("Enter a number = "); 
            n = sc.nextInt(); 
            for(int i = n; i >= 1; --i)
            {
                for(int j = 1; j <= i; ++j)
                {
                    System.out.print(j + " ");
                }
                System.out.println( );
            }
        }
            public void checking ()
            {
                switch(choice)
                {
                case 1:
                tri1();
                break;
                case 2:
                t2(66);
                break;
              default:
            System.out.println("Invalid Input");
            break;
             }
            
        }
     public static void main (String args[])
     {
         Triangle obj= new Triangle();
         obj.input(1);
         obj.accept();
         obj.checking();
        }
    }