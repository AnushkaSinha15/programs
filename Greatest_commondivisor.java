public class Greatest_commondivisor
{
   int num1 , num2, gcd=1;
     Greatest_commondivisor()
    {
        num1=0;
        num2=0;
    }
    void checking()
    {
        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }

        System.out.printf("Greatest common divisor"+ gcd);
    }
 public static void main (String args [])
 {
   Greatest_commondivisor obj= new Greatest_commondivisor();
   obj.checking();
}
}