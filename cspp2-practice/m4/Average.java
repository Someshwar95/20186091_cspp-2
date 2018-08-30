import java.util.Scanner;
public class Average
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		double sum = 0;
		double avg = 0;
        int a[] = new int[size];
        for(int i=0;i<a.length;i++) {
        	a[i]=s.nextInt();
        	sum = sum+a[i];
        }
        avg = sum/size;
        System.out.println(avg);
	}
}