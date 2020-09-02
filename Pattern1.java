class Pattern1
{
    public static void main(String args[])
    {
        char ch = '*';
        for(int i = 1; i <= 5; i++)
        {
            ch = '*';
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch);
                if(ch == '*')
                    ch = '#';
                else
                    ch = '*';
            }
            System.out.println();
        }
    }
}