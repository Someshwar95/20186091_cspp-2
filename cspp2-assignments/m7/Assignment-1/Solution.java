import java.util.*;
class InputValidator
{
    String str; 
    public InputValidator(String s) {
    this.str = s;
    }

    /*Write the atrributes and methods for InputValidator*/
    public boolean validateData() {
        if(str.length() >= 6) {
            return true;
        } else{
            return false;
        }
    }
    }
/**
 * Class for solution.
 */
public class Solution {
    /**
     * { item_description }
     */
    public static void main(final String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }

}
