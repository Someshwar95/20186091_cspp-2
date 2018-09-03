import java.util.Scanner;
/**.
 * Class for input validator.
 */
class InputValidator {
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
        if (str.length() >= 6) {
            return true;
        } else {
            return false;
        }
    }
    }
/**.
 * Class for solution.
 */
public class Solution {
    /**.
     * { item_description }
     */
    public static void main(final String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }

}
