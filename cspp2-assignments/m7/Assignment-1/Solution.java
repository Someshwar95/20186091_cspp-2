import java.util.*;
class InputValidator
{
	String str; 
	public InputValidator(String s) {
	this.str = s;
	}

	/*Write the atrributes and methods for InputValidator*/
	public boolean validateData() {
		if(str.length()>=6) {
			return true;
		} else{
			return false;
		}
	}
	}
public class Solution
{
	public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
    	String input=s.next();
    	InputValidator i=new InputValidator(input);    	
    	System.out.println(i.validateData());

    }

}
