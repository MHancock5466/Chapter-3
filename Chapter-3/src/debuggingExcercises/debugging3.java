/**
 * 
 */
package debuggingExcercises;

/**
 * @author MH137428
 *
 */
import java.util.Scanner;
public class debugging3 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	   {
	      String name;
	      name = getName();
	      displayGreeting(name);           
	   }
	   public static String getName()
	   {
	      String name;
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter name here: ");
	      name = input.nextLine();
	      return name;
	   }
	   public static void displayGreeting(String name)
	   {
	      System.out.println("Hello, " + name + "!");
	   }

}
