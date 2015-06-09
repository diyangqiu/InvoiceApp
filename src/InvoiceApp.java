//Diyang Qiu
//06/07/2015

import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {

	public static double getDiscountPercent(double subtotal) {
		assert subtotal > 0;
		double discountPercent = 0.0;
		if (subtotal >= 500)
			discountPercent = .25;
		else if (subtotal >= 200)
			discountPercent = .2;
		else if (subtotal >= 100)
			discountPercent = .1;
		else
			discountPercent = 0.0;
		return discountPercent;
	}
	

	public static void main(String[] args) {
		int total_invoice = 0;
		double avg_discount_amount = 0;
		double total_discount_amount = 0;
		double total_invoice_amount_before_tax = 0;
		double total_invoice_amount_after_tax = 0;
		double discountPercent;
		Invoice invoice = new Invoice();
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		do {
			double subtotal = Validator.getint(sc, "Enter subtotal:   ", 1, 10000);
			assert subtotal > 0;
			discountPercent = getDiscountPercent(subtotal);
			invoice.setDiscountPercent(discountPercent);
			invoice.setDiscountAmount(subtotal * invoice.getDiscountPercent());
			invoice.setTotalBeforeTax(subtotal - invoice.getDiscountAmount());

			String message = "Discount percent: " + percent.format(discountPercent) + "\n"
					+ "Discount amount:  " + currency.format(invoice.getDiscountAmount()) + "\n"
					+ "Invoice total before tax:    " + currency.format(invoice.getTotalBeforeTax()) + "\n"
					+ "Invoice total after tax:     " + currency.format(invoice.getTotalAfterTax());
			System.out.println(message);
			System.out.println();
			
			total_invoice++;
			total_discount_amount += invoice.getDiscountAmount();
			total_invoice_amount_before_tax += invoice.getTotalBeforeTax();
			total_invoice_amount_after_tax += invoice.getTotalAfterTax();
			avg_discount_amount = total_discount_amount / total_invoice;
			String summary = "Number of invoices: " + total_invoice + "\n"
					+ "Average invoice amount before tax: "
					+ currency.format(Math.round(total_invoice_amount_before_tax)) + "\n"
					+ "Average invoice amount after tax: "
					+ currency.format(Math.round(total_invoice_amount_after_tax)) + "\n"
					+ "Average discount amount: " + currency.format(avg_discount_amount) + "\n";
			System.out.println(summary);

			System.out.print("Continue? (n): ");
			choice = sc.next();
			System.out.println();
		} while (!choice.equalsIgnoreCase("n"));
		System.out.println("Goodbye");
		sc.close();
	}
}