

package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		//#1
		printIntSum();
		//#2
		printDoubleSum();
		//#3
		printSumDoubleAndInt();
		//#4
		//I changed the value of 'a' from 40 to 40.0
		//This created an error, but I fixed that by declaring 'a' as a double
		printQuotient();
		//#5
		printQuotient2();
		//#6
		printQuotient3();
		//#7
		calculatedConstant();
		//#8
		totalSale(3,4,2);


	}
	public static void printIntSum() {
		int a = 5;
		int b = 10;
		int sum = a + b;
		System.out.println(sum);
	}
	public static void printDoubleSum() {
		double a = 5000;
		double b = 10000;
		double sum = a + b;
		System.out.println(sum);
	}
	public static void printSumDoubleAndInt() {
		int a = 50;
		double b = 5000;
		double sum = a + b;
		System.out.println(sum);

	}
	public static void printQuotient() {
		double a = 40.0;
		int b = 30;
		double quotient = (double) a / b;

		System.out.println(quotient);
	}
	public static void printQuotient2() {
		double a = 50.0;
		double b = 40.0;
		double quotient = a / b;
		System.out.println(quotient);
	}
	public static void printQuotient3() {
		int x = 5;
		int y = 6;
		double q = (double) y;
		double quotient1 = x/y;
		double quotient2 = x/q;
		System.out.println(quotient1);
		System.out.println(quotient2);
	}
	public static void calculatedConstant() {
		final int CONSTANT = 20;
		int a = 5;
		int calculatedConstant = CONSTANT * a;
		System.out.println("this is a calculated constant");
		System.out.println(calculatedConstant);
	}
	public static void receipt() {

	}
	public static void totalSale(int coffees, int espressos, int greenTeas) {
		double coffeePrice = 4.50;
		double espressoPrice = 2.95;
		double greenTeaPrice = 1.95;
		final double SALES_TAX = 0.075;

		double subTotal = (coffees * coffeePrice) + (espressos * espressoPrice) +
			(greenTeas * greenTeaPrice);

		double totalSale = subTotal + (subTotal * SALES_TAX);
		System.out.println("Total price =");
		System.out.printf("$%.2f",totalSale);
	}
}

