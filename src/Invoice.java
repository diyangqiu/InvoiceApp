//Diyang Qiu
//06/07/2015
//Invoice Class

public class Invoice {
	private double discountPercent;
	private double discountAmount;
	private double totalBeforeTax;
	private double salesTax;
	private final double SALES_TAX_PERCENT = 0.2;

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public double getTotalBeforeTax() {
		return totalBeforeTax;
	}

	public void setTotalBeforeTax(double totalBeforeTax) {
		this.totalBeforeTax = totalBeforeTax;
		setSalesTax();
	}

	public void setSalesTax() {
		this.salesTax = totalBeforeTax * SALES_TAX_PERCENT;
	}
	
	public double getTotalAfterTax() {
		return this.salesTax + getTotalBeforeTax();
	}
}
