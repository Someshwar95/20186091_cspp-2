import java.util.Scanner;

public class Solution {
	static double areaOfTriangle(int base, int height)
	{
		return  0.5 * base * height;
	}
	/*
	Do not modify this main function.
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		int height = scan.nextInt();
		System.out.println(areaOfTriangle(base, height));
		
	}
	/*
	Need to fill the areaOfTriangle function and print the output
	of fahrenheit.
	*/
}