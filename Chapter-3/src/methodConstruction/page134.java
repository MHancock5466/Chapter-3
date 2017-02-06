/**
 * 
 */
package methodConstruction;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
public class page134 
{
	
	public static void main(String[] args) 
	{
		String valueSpecified;
		char vType = 'S';
		int value;
		double commRate = 0.08;
		
		valueSpecified = JOptionPane.showInputDialog(null, "What is the value of the vehicle?");
		value = Integer.parseInt(valueSpecified);
				
		computeCommission(value, commRate, vType);
		computeCommission(40000, 0.10, 'L');
	}

	public static void computeCommission(int value, double rate, char vehicle)
	{
		double commission = value * rate;
		System.out.println("\nThe " + vehicle + " type vehicle is worth $" + value);
		System.out.println("With " + (rate * 100) + "% commission rate, the commission is $" + commission);	
	}
	
}
