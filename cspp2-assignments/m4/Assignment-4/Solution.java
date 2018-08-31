
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{/*
    Do not modify the main function 
    */
    /**
     * { function_description }
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static String reverseString(final String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char reverse = s.charAt(i);
            str = str + reverse;
        }
        return str;
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);

    }
    //Write reverseString function

}
