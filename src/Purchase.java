/*
 * Zachary Miller
 * assignment 3.2
 * Purchase.java
 * The purpose of this program is to provide the Purchase class and set the amounts for sales amount, tax, total, and invoice number
 * and display them 
 * 6/27/2018
 * bellevue university
 */
import java.text.DecimalFormat;
import javax.swing.*;

public class Purchase {
	static double salesTax = .075;
	double purchaseAmount,taxAmount, totalAmount;
	int invoiceNumber;
	public void setInvoiceNumber(int invoice)
	{
		invoiceNumber=invoice;
	}
	
	public void setPurchaseAmount(double purchaseamnt)
	{
		purchaseAmount = purchaseamnt;
		taxAmount = purchaseAmount*salesTax;
	}
	
	public double getPurchaseAmount()
	{
		return purchaseAmount;
	}	
	public void setSalesTax()
	{
		taxAmount = purchaseAmount*salesTax;
	}
	public double getSalesTax()
	{
		return taxAmount;
	}
	public void setTotalPurchase()
	{
		totalAmount = purchaseAmount+taxAmount;
	}
	public double getTotalPurchase()
	{
		return totalAmount;
	}
	public void display()
	{
		DecimalFormat formatter = new DecimalFormat("#0.00");
		JOptionPane.showMessageDialog(null, "Invoice Number: "+invoiceNumber+"\nSale: "+formatter.format(purchaseAmount)+
				"\nSales Tax: "+formatter.format(taxAmount)+"\n______"+"\nTotal: "+formatter.format(totalAmount));
	}
}
