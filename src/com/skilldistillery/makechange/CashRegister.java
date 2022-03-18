package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner cashIn = new Scanner(System.in);

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
		} 
		else if (cashTendered == cost) {
			System.out.println("Thanks for your business. Have a nice day!");
		}
		else if  (cashTendered > cost) {
			System.out.print("You change is " + change);
		}

	}

}
