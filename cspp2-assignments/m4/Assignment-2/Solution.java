import java.util.*;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = {};
		int[][] b = {};
		int[][] c = new int[3][3];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
		System.out.println(c[i][j]+"");
			}
		}
		
		
	}
}