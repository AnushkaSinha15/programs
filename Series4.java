public class Series4
{
    public void generateSeries() {
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print(", ");
        }
        
    }
}