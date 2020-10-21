package hw1;
/* Kallan Brainard
 * CS211
 * 5 July 2020
 */

public class DiscountBill extends GroceryBill {
	private int discountItem;
	private double discount;
	private boolean preferred;

	public DiscountBill(Employee clerk, boolean preferred) { // Constructor with Employee and preferred customer parameters 
		super(clerk);
		this.preferred = preferred;
		discountItem = 0;
		discount = 0.0;
	}

	public void add(Item i) { //Overrides parent mutator method. Adds each item if there is a discount
		super.add(i);
		if (preferred && i.getDiscount() > 0) {
			discountItem++;
			discount += i.getDiscount();
		}
	}

	//Accessor methods
	public int getDiscountCount() {
		return discountItem;
	}

	public double getDiscountAmount() {
		return discount;
	}

	public double getTotal() { //Overrides parent method to compute new total after discount
		return super.getTotal() - discount;
	}

	public double getDiscountPercent() {
		return (discount / super.getTotal()) * 100;
	}

	public void printReceipt() {	
		// Prints bill with discount info
		System.out.println("--------------------------------");
		System.out.println("     Welcome to Fred Meyer!");
		System.out.println("--------------------------------");
		System.out.println("Cashier Name: " + getCashierName()); 
		System.out.println(receiptToString()); 
		System.out.println("No. of Discounted Items: " + getDiscountCount()); 
		System.out.println("Total Amount: " + "$" + super.getTotal());
		System.out.println("Total After Discount: $" + this.getTotal());
		System.out.println("Total Savings: " + "$" + getDiscountAmount() + " %" + Math.round(getDiscountPercent() * 100.0) / 100.0);
		System.out.println("--------------------------------");
		System.out.println(" Thank You For Shopping With Us!");
		System.out.println("--------------------------------");
		System.out.println();
	}

}
