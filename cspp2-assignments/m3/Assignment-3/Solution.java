
import java.util.Scanner;
/*
    Do not modify this main function.
    */
/**
 * Class for solution.
 */
public class Solution {
    /**.
     * { function_description }
     *
     * @param      n1    The n 1
     * @param      n2    The n 2
     *
     * @return     { description_of_the_return_value }
     */
    static int gcd(final int n1, final int n2)
    {
        //int n1, n2;
        int max = 0;
        if (n1 > n2) {
            max = n1;
        } else {
            max = n2;
        }
        int gcd_val = 1;
        for (int i = 1; i <= max; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd_val = i;
            }
        }

        // for(int i=1;i<=n1;i++) {
        //     if (n1%i == 0)
        //         return i;

        // }



        // for(int i=1;i<=n2;i++) {
        //     if(n2%i == 0)
        //         return i;

        // }
        return gcd_val;
    }

    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int i = gcd(n1, n2);
        System.out.println(i);
    }
    /*
    Need to write the gcd function and print the output.
    */
}
