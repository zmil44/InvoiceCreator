/*
 * Zachary Miller
 * assignment 3.2
 * PurchaseTest.java
 * The purpose of this program is to get user input and create an instance of the purchase class
 * 6/27/2018
 * bellevue university
 */
import javax.swing.*;
public class PurchaseTest {

	public static void main(String[] args) {
		String rawInput;
		int invoiceNumber = 0;
		double purchaseAmount = 0;
		boolean inputCorrect=false;
		while(inputCorrect==false)
		{
			try
			{
				rawInput = JOptionPane.showInputDialog(null, "Please enter the invoice number for this purchase (this should be a whole number):");
				if(rawInput==null)
				{
					System.exit(0);
				}
				invoiceNumber = Integer.parseInt(rawInput);
				inputCorrect=true;
				
			}catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "I'm sorry but the number you entered for the invoice seems to be incorrect. Please try again");
				inputCorrect=false;
			}
			
		}
		rawInput=null;
		inputCorrect=false;
		while(inputCorrect==false)
		{
			try
			{
				rawInput = JOptionPane.showInputDialog(null, "Please enter the amount of the purchase: ");
				if(rawInput==null)
				{
					System.exit(0);
				}
				purchaseAmount = Double.parseDouble(rawInput);
				inputCorrect=true;
			}catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "I'm sorry but the number you entered for the purchase amount seems to be incorrect please try again.");
				inputCorrect=false;
			}
			
		}
		Purchase purchase1 = new Purchase();
		purchase1.setPurchaseAmount(purchaseAmount);
		purchase1.setInvoiceNumber(invoiceNumber);
		purchase1.setTotalPurchase();
		purchase1.display();
	}

}
