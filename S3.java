public class S3
{
    public void generateSeries() 
    {
        int term = 1;
        
        for (int i = 1; i <= 10; i++) 
        {
            System.out.print(term + ", ");
            term = term * 10 + 1;
        }
    }
}