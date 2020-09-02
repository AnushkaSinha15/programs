public class Sum_of_series
 {
	public void SumSeries(int n, double x)
	{
		double sum = 0;
		for (int i = 1; i <= n; i++)
		{
			if (i % 2 == 1)
			{
				sum = sum + (x / i);
			}
 			else {
				sum = sum - (x / i);
			}
		}
		System.out.println("Sum = " + sum);
	}
	public void SumSeries()
	{
		int sum = 0;
		for (int i = 1; i <= 20; i++)
		{
			int product = 1;
			for (int j = 1; j <= i; j++)
			{
				product = product * j;
			}
			sum = sum + product;
		}
		System.out.println("Sum = " + sum);
	}
}