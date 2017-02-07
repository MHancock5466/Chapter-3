/**
 * 
 */
package excersisesPage175;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
public class fourB 
{
	int first;
	public static void main(String[] args) 
	{
		String answer;
		int first;
		
		answer = JOptionPane.showInputDialog(null, "Enter a whole number");
		first = Integer.parseInt(answer);
		
		JOptionPane.showMessageDialog(null, "The number when doubled is " + displayTwiceTheNumber(first) + ". The number plus five is " + 
				displayNumberPlusFive(first) + ". The number when squared is " + displayNumberSquared(first) + ".");
	}
	
	public static int displayTwiceTheNumber(int frst)
	{
		int twice;
		twice = (2 * frst);
		return twice;
	}

	public static int displayNumberPlusFive(int frst)
	{
		int five;
		five = (frst + 5);
		return five;
	}
	
	public static int displayNumberSquared(int frst)
	{
		int squared;
		squared = frst * frst;
		return squared;
	}
	
}
