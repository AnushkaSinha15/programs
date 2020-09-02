import java.util.Scanner;
class ParkingLot
{
    int vno;
    int hours;
    double bill;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vehicle Number: ");
        vno = sc.nextInt();
        System.out.print("Hours: ");
        hours =sc.nextInt();
    }
    public void calculate()
    {
        if(hours <= 1)
        {
            bill = 3.0;
        }
        else
        {
            bill = 3.0 + 1.5 * (hours - 1);
        }
    }
    public void display(){
        System.out.println("Vehicle Number: " + vno);
        System.out.println("Hours: " + hours);
        System.out.println("Bill: Rs. " + bill);
    }
    public static void main(String args[])
    {
        ParkingLot obj = new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}