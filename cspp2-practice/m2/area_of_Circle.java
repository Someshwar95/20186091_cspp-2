public class area_of_Circle
{
	static double area(int r)
	{
		double area = pi() * r * r;
		return area;
	}
	static double pi()
	{
		return 3.14f;
	}
	public static void main(String[] args)
	{
		int radius = 3;
		double x = area(radius);
		System.out.println(x);

	}

}