class character
{
    public void num_calc(int num, char ch)
    {
        if(ch == 's' || ch == 'S')
        {
            int s = num * num;
            System.out.println("Square = " + s);
        }
        else
        {
            int c = num * num * num;
            System.out.println("Square = " + c);
        }
    }
    public void num_calc(int a, int b, char ch)
    {
        if(ch == 'p' || ch == 'P')
        {
            int p = a * b;
            System.out.println("Product = " + p);
        }
        else
        {
            int s = a + b;
            System.out.println("Sum = " + s);
        }
    }
    public static void main (String args[]) 
    {
        character obj= new character();
        obj.num_calc(435,'A');
         obj.num_calc(233,343,'P');
}
}