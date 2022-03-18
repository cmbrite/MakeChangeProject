package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner cashIn = new Scanner(System.in);
//		User Story #1
//		The user is prompted asking for the price of the item.
//
//		User Story #2
//		The user is then prompted asking how much money was tendered by the customer.
//
//		User Story #3
//		Display an appropriate message if the customer provided too little money or the exact amount.
//
//		User Story #4
//		If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
		System.out.println("Hello! How much does your item cost? ");
		double cost = cashIn.nextDouble();
		System.out.println("How much money was tendered? ");
		double cashTendered = cashIn.nextDouble();
		double change = cashTendered - cost;
		String quarter = "quarter";
		String dime = "dime";
		String nickel = "nickel";

		if (cashTendered < cost) {
			System.out.println("You haven't paid enough for the item!");
		} else if (cashTendered == cost) {
			System.out.println("Thanks for your business. Have a nice day!");
		} else if (cashTendered > cost) {
			System.out.print("You change is " + change);
		}

	}

}
