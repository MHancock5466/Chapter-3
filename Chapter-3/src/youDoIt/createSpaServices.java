/**
 * 
 */
package youDoIt;

/**
 * @author MH137428
 *
 */
import java.util.Scanner;
public class createSpaServices 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String service;
		double price;
		
		spaService firstService = new spaService();
		spaService secondService = new spaService();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter service >> ");
		service = keyboard.nextLine();
		
		System.out.print("Enter price >> ");
		price = keyboard.nextDouble();
		
		firstService.setServiceDescription(service);
		
		firstService.setPrice(price);
		
		keyboard.nextLine();
		System.out.print("Enter service >> ");
		service = keyboard.nextLine();
		System.out.print("Enter price >> ");
		price = keyboard.nextDouble();
		secondService.setServiceDescription(service);
		secondService.setPrice(price);
		System.out.println("First Service Details:");
		System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
		System.out.println("Second Service Details:");
		System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
		
	}

}
