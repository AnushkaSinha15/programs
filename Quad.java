import java.util.*;
public class Quad
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("An quadratic expression is  ax^2+bx+c=0");
        System.out.println("Enter the number");
        double a=ob.nextDouble();
        System.out.println("Enter the number");
        double b=ob.nextDouble();
        System.out.println("Enter the constant term");
        double c=ob.nextDouble();
        double dis=b*b-4*a*c;
        if(dis>0)
        {
            System.out.println("The equation has 2 real and distinct solutions.");
            double root1=(-b+Math.sqrt(dis))/(2*a);
            double root2=(-b-Math.sqrt(dis))/(2*a);
            System.out.println("Root 1 is : "+root1);
            System.out.println("Root 2 is : "+root2);
        }
        else if(dis==0)
        {
            System.out.println("The equation has 2 real and equal solutions.");
            double root=(-b+Math.sqrt(dis))/(2*a);
            System.out.println("The equal Root  is : "+root);
        }
        else
        {
            System.out.println("The equation has no real solution.It has only imaginary solution.");
            System.out.println("No solution can be represented here.");
        }
    }
}
