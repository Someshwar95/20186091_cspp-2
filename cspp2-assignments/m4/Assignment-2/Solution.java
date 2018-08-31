import java.util.*;
public class Solution {
	public static Scanner sc = new Scanner(System.in);
	/* Fill the main function to print resultant of addition of matrices*/
	
	public static void main(String[] args) {

		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		int[][] a = new int[m][n];
		int m1 = sc.nextInt();
		int n1 = sc.nextInt();
		sc.nextLine();
		int[][] b = new int[m1][n1];
		int[][] c = new int[3][3];
        for (int i = 0; i < m ; i++ ) {
			for (int j = 0; j < n ; j++ ) {
				a[i][j] = sc.nextInt();
			}
			// sc.nextLine();
		}

		for (int k = 0; k < m1; k++) {
			for (int l = 0; l < n1; l++) {
				b[k][l] = sc.nextInt();
			}
			// sc.nextLine();	
		}
		for (int i = 0;i < m;i++ ) {
			for (int j = 0;j < n;j++ ) {
				c[i][j] = a[i][j] + b[i][j];
				
			}
			
		}
	}
}
	