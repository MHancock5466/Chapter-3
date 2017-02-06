/**
 * 
 */
package debuggingExcercises;

/**
 * @author MH137428
 *
 */
public class debugging1 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double myCheck = 50.00;
		double yourCheck = 19.95;
		System.out.println("Tips are: ");
		calcTip(myCheck);
      	calcTip(yourCheck);
    }
	
	public static void calcTip(double bill)
    {
		final double RATE = 0.15;
		double tip;
		tip = bill * RATE;
		System.out.println("The tip should be at least " + tip);
    }
}


