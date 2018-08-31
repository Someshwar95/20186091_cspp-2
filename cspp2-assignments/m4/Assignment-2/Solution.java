import java.util.*;
public class Solution {
	public static Scanner sc = new Scanner(System.in);
	/* Fill the main function to print resultant of addition of matrices*/
	
	public static void main(String[] args) {

		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] a = new int[m][n];
        for (int i = 0; i < m ; i++ ) {
			for (int j = 0; j < n ; j++ ) {
				a[i][j] = sc.nextInt();
			}
		}
		int m1 = sc.nextInt();
		int n1 = sc.nextInt();
		sc.nextLine();
		int[][] b = new int[m1][n1];
		int[][] c = new int[3][3];

		for (int k = 0; k < m1; k++) {
			for (int l = 0; l < n1; l++) {
				b[k][l] = sc.nextInt();
			}
		}
		for (int i = 0;i < m;i++ ) {
			for (int j = 0;j < n;j++ ) {
				System.out.print(c[i][j]);
				
			}
			System.out.println();
			
		}

	}
}
	