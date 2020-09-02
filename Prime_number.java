public class Prime_number
{ 
    int i,m=0,flag=0, n; 
 void input(int num)
 {  
     int n = num;
    }
    void checkPrime()
    {
  m=n/2;      
  if(n==0||n==1)
  {  
   System.out.println(n+" is not prime number");      
  }
  else
  {  
   for(i=2;i<=m;i++)
   {      
    if(n%i==0)
    {      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number");
    }  
  }//end of else  
}  
 public static void main(String args[])
    
{
    Prime_number obj = new Prime_number();
    obj.input(56);
    obj.checkPrime();
}    

}   