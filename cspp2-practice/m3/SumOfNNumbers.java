import java.util.Scanner;

public class SumOfNNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=val;i++){

			sum = sum + i;
			
		}

		System.out.println(sum);

		
	}
}