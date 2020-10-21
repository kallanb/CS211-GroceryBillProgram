package hw1;
/* Kallan Brainard
 * CS211
 * 5 July 2020
 */

public class DiscountBillTester {

	public static void main(String[] args) {
		//Create object for Item class
		Item i1 = new Item ("Milk", 2.0, 0.0);
		Item i2 = new Item ("Bananas", 1.50, 0.2);

		//Create objects for DiscountBill Class
		DiscountBill discountBill1 = new DiscountBill(new Employee ("Kallan"), true); 
		discountBill1.add(i1);
		discountBill1.add(i2);

		DiscountBill discountBill2 = new DiscountBill(new Employee ("Anna"), false); 
		discountBill2.add(i1);
		discountBill2.add(i2);

		//Display receipt
		discountBill1.printReceipt();
		System.out.println();
		discountBill2.printReceipt();
	} 

}
