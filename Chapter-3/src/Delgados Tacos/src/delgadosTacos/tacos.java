/**
 * 
 */
package delgadosTacos;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class tacos 
{

	public static void main(String[] args)
	{
		String response;
		byte burritos, tacos, churros, nachos, enchiladas, quesadillas, tamales, empanadas, fajitas, pops;
		
		tacoTruck();
		
		response = JOptionPane.showInputDialog(null, "How many burritos would you like?");
		burritos = Byte.parseByte(response);
		response = JOptionPane.showInputDialog(null, "How many tacos would you like?");
		tacos = Byte.parseByte(response);
		response = JOptionPane.showInputDialog(null, "How many churros would you like?");
		churros = Byte.parseByte(response);
		response = JOptionPane.showInputDialog(null, "How many nachos would you like?");
		nachos = Byte.parseByte(response);
		response = JOptionPane.showInputDialog(null, "How many enchiladas would you like?");
		enchiladas = Byte.parseByte(response);
		response = JOptionPane.showInputDialog(null, "How many quesadillas would you like?");
		quesadillas = Byte.parseByte(response);
		response = JOptionPane.showInputDialog(null, "How many tamales would you like?");
		tamales = Byte.parseByte(response);
		response = JOptionPane.showInputDialog(null, "How many empanadas would you like?");
		empanadas = Byte.parseByte(response);
		response = JOptionPane.showInputDialog(null, "How many fajitas would you like?");
		fajitas = Byte.parseByte(response);
		response  = JOptionPane.showInputDialog(null, "How many drinks would you like?");
		pops = Byte.parseByte(response);
		
		salesTax(burritos, tacos, churros, nachos, enchiladas, quesadillas, tamales, empanadas, fajitas, pops);
	}

	public static void salesTax(byte bu, byte ta, byte ch, byte na, byte en, byte qu, byte tam, byte em, byte fa, byte po)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		double burritoPrice = 2;
		double tacoPrice = 1.5;
		double churroPrice = .75;
		double nachoPrice = 1.75;
		double enchiladaPrice = 2;
		double quesadillaPrice = 1.25;
		double tamalePrice = 1.5;
		double empanadaPrice = 3;
		double fajitaPrice = 2.5;
		double popPrice = 1;
		double tax = .075;
		double cost, costTax;
		cost = (bu * burritoPrice) + (ta * tacoPrice) + (ch * churroPrice) + (na * nachoPrice) + (en * enchiladaPrice) + (qu * quesadillaPrice)
				+ (tam * tamalePrice) + (em * empanadaPrice) + (fa * fajitaPrice) + (po * popPrice);
		costTax = cost * tax;
		JOptionPane.showMessageDialog(null, "Your food cost is $" + (df.format(cost)) + ". The sales tax is $" + (df.format(costTax)) + 
				". Your total price will be $" + (df.format(cost+costTax)) + ".");
	}
	
	public static void tacoTruck()
	{
		System.out.println("******************************************");
		System.out.println("*   TACOS TACOS TACOS TACOS TACOS TACOS   ***");
		System.out.println("*        *************************           **");
		System.out.println("*        *                       *             *");
		System.out.println("*        *                       *             *");
		System.out.println("*        *                       *             *");
		System.out.println("*        *************************              ********");
		System.out.println("*                                                       **");
		System.out.println("*        *****   *    ***** *****                         *");
		System.out.println("*          *    * *   *     *   *                         *");
		System.out.println("*          *   *****  *     *   *                         *");
		System.out.println("*          *  *     * ***** *****                        *");
		System.out.println("*********************************************************");
		System.out.println("     *      *                              *      *");
		System.out.println("      **  **                                **  **");
		System.out.println("        **                                    **");
	}
	
}
