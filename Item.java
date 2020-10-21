package hw1;

/* Kallan Brainard
 * CS211
 * 5 July 2020
 *  
 * This is one of the classes for exercise 10 of Chapter 9
 * used by permission from this student:
 * CS211 Alperen Cucioglu 
 * Homework Assignment 01
 * 22 September 2019
 */

public class Item {
	private String name;
	private double price;
	private double discount;

	public Item(String name, double price, double discount) { 
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	//Accessor methods   
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}

	public String toString() { // toString method for printing the receipt
		return name + ": $" + price + " (-$" + discount + ")";
	}
	
}
