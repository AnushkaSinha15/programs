import java.util.*;
class Number
{
public static void main(String args[])
{
int n,r;
Scanner in = new Scanner(System.in);
System.out.println("Enter a number");
n=in.nextInt();
do
{
r=n%10;
n=n/10;
System.out.println(r);
}
while(n!=0); 
}
}