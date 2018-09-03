import java.util.Scanner;
/**.
 * Class for input validator.
 */
class InputValidator {
    /**.
     * { var_description }
     */
    public static final int NUM = 6;
    /**.
     * { var_description }
     */
    private String str;
    /**.
     * Constructs the object.
     *
     * @param      s     { parameter_description }
     */
    public InputValidator(final String s) {
    this.str = s;
    }

    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public boolean validateData() {
        if (str.length() >= NUM) {
            return true;
        } else {
            return false;
        }
    }
    }
/**
 * . Class for solution.
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
        /**.
         * empty constructor.
         */
    }
    /**
     * . { item_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }

}
