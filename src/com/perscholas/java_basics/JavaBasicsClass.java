/**
 * Casey Echternacht
 * class: 2024-RTT-64
 * instructor: Ezra Williams
 * 7/9/2024
 * This program demonstrates my understanding of how variables work.
 * It prints the sums and quotients of integers and doubles.
 *
 */



package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		printIntSum();
		printDoubleSum();
		printSumDoubleAndInt();
		//I changed the value of 'a' from 40 to 40.0
		//This created an error, but I fixed that by declaring 'a' as a double
		printQuotient();
		printQuotient2();
		printQuotient3();
		calculatedConstant();
		totalSale(3,4,2);


	}
	// this method creates two int variables and prints their sum
	public static void printIntSum() {
		int num1 = 5;
		int num2 = 10;
		int sum = num1 + num2;
		System.out.println(sum);
	}
	// this method creates two doubles and prints their sum
	public static void printDoubleSum() {
		double num1 = 5000;
		double num2 = 10000;
		double sum = num1 + num2;
		System.out.println(sum);
	}
	//this method creates a double and int and prints their sum
	public static void printSumDoubleAndInt() {
		int num1 = 50;
		double num2 = 5000;
		double sum = num1 + num2;
		System.out.println(sum);
	}
	//this method creates an int and a double and prints their quotient
	public static void printQuotient() {
		double num1 = 40.0;
		int num2 = 30;
		double quotient = (double) num1 / num2;
		System.out.println(quotient);
	}
	// this method creates two doubles and prints their quotient
	public static void printQuotient2() {
		double num1 = 50.0;
		double num2 = 40.0;
		double quotient = num1 / num2;
		System.out.println(quotient);
	}
	// this method creates two ints (x, y) and a double (q), it prints the quotient of
	// x,y and x,q
	public static void printQuotient3() {
		int x = 5;
		int y = 6;
		double q = (double) y;
		double quotient1 = x/y;
		double quotient2 = x/q;
		System.out.println(quotient1);
		System.out.println(quotient2);
	}
	// this method declares a constant and an int. It prints the outcome of multiplying the
	// constant by the int
	public static void calculatedConstant() {
		final int CONSTANT = 20;
		int a = 5;
		int calculatedConstant = CONSTANT * a;
		System.out.println("this is a calculated constant");
		System.out.println(calculatedConstant);
	}
	//this method declares prices for 3 products, takes quantities for each of those products
	//prints out a total price that includes sales tax
	public static void totalSale(int coffeeQuantity, int espressoQuantity,
								 int greenTeaQuantity) {
		double coffeePrice = 4.50;
		double espressoPrice = 2.95;
		double greenTeaPrice = 1.95;
		final double SALES_TAX = 0.075;
		double subTotal = (coffeeQuantity * coffeePrice) + (espressoQuantity * espressoPrice) +
			(greenTeaQuantity * greenTeaPrice);
		double totalSale = subTotal + (subTotal * SALES_TAX);
		System.out.println("Total price =");
		System.out.printf("$%.2f",totalSale);
	}
}

