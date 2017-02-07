/**
 * 
 */
package excersisesPage175;

/**
 * @author MH137428
 *
 */
import java.util.Scanner;
public class fiveB 
{
	
	public static void main(String[] args) 
	{
		String answer;
		double first, second;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		first = keyboard.nextDouble();
		
		System.out.println("Please enter another number");
		second = keyboard.nextDouble();
		
		computePercent(first, second);
		computePercent(second, first);
	}

	public static void computePercent(double fr, double sc)
	{
		double percent1;
		percent1 = 100*(fr/sc);
		System.out.println(fr + " is " + percent1 + " percent of " + sc + ".");
	}
	
}
