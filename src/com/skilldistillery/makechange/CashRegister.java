package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner cashIn = new Scanner(System.in);

//		The user is prompted asking for the price of the item.
		System.out.println("Hello! How much does your item cost? ");
		double cost = cashIn.nextDouble();
//
//		The user is then prompted asking how much money was tendered by the customer.
		System.out.println("How much money was tendered by the customer? ");
		double cashTendered = cashIn.nextDouble();
//
//		Display an appropriate message if the customer provided too little money or the exact amount.
		if (cashTendered < cost) {
			System.out.println("You haven't paid enough for the item!");
		}
		if (cashTendered == cost) {
			System.out.println("Thanks for your business. Have a nice day!");
		}
//
//		If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
		double change = cashTendered - cost;
		int tenDollarBills = (int) change / 10; // TODO Get ten dollar bill total to show up without minimal if()
												// functions
		int fiveDollarBills = (int) change % 10;
		int oneDollarBills = (int) change % 5;

//		Dollar calculations are working accurately!
		if (cashTendered > cost) {
			System.out.print("Your change is ");
		}
		if (change >= 10) {
			System.out.print(tenDollarBills + " ten dollar bill,");
		}
		if (change % 10 >= 5 || change >= 5 && change < 10) {
			System.out.print(" 1 five dollar bill, ");
		}
		if (change >= 1) {
			System.out.print(oneDollarBills + " one dollar bills ");
		}

		double coins = change - (int)change;
		float coins2 = (float) coins;
		int quarter1 = (int)(coins2 / 0.25); // Quarter works fine.
		float dime1 = (float) (coins2 % 0.25);
		float dime2 =  (int)(dime1 / 0.1);
		//Calculation work fine up to here. Nickel and penny non working.
		float nickel1 = (float)(dime1 % 0.1);
		double nickel2 = (int)(nickel1 / 5);
		int penny1 = (int)((dime1 % .01) % .05);
		float penny2 =  (int)(penny1 / 0.01);

		if (quarter1 > 0) {
			System.out.print((int) quarter1 + " quarters ");
		}
		if (dime2 > 0) {
			System.out.print(dime2 + " dimes ");
		}
		if (nickel2 > 0) {
			System.out.print((int) (nickel2) + " nickels ");
		}
		if (penny2 > 0) {
			System.out.print(penny2 + " pennies");
		}

//		System.out.println(" " + coins2); // This print is to test coins

	}
}
