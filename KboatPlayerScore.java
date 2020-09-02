import java.util.Scanner;

public class KboatPlayerScore
{
    public void computeScore()
    {
        
        Scanner in = new Scanner(System.in);
        int runs = 0, balls = 0, r = 0;
        
        do 
        {
            System.out.print("Enter runs: ");
            r = in.nextInt();
            
            if (r == -1)
                System.out.println("Player is out");
            else
                runs += r;
                
            balls++;
        }
        while(r != -1);
        
        System.out.println("Total Runs: " + runs);
        System.out.println("Total Balls: " + balls);
    }
}