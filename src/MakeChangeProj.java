import java.util.Scanner;

public class MakeChangeProj {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double tender, price;
		int tender1, price1, change0;

		System.out.println("How much is the item that you are purchasing?");
		price = kb.nextDouble();
		System.out.println("How much money are you paying for that item?");
		tender = kb.nextDouble();
		
//		System.out.println(tender + " " + price);

		if (price > tender) {
			System.out.println("That is not enough money.");
		} else if (price == tender) {
			System.out.println("That was the exact amount and ther is no change.");
		}
		double change1 = (double) tender * 100;
		double change2 = (double) price * 100;
//		System.out.println(change1 + " " + change2);
		change(change1, change2);

		kb.close();
	}

	public static void change(double tend, double price1) {
		double change = (double)(tend - price1);
//		System.out.println(change);
//		if (change0 )
//		System.out.println(change0);
//		int change = (int)(change0 * 100);
//		change++;
//		System.out.println(change);

		if (change == 10.00) {
			System.out.println("One 10 dollar bill");
		}

		else if (change > 1000) {
			int ten1;
			int ten2, ten3;
			ten1 = (int) (change / 1000);
			ten2 = (int) (change % 1000);
			System.out.println(ten1 + " ten dollar bills");
			ten1 = (int) (ten2 / 500);
			ten3 = (int) (ten2 % 500);
			System.out.println(ten1 + " 5 dollar bills");
			ten1 = (int) (ten3 / 100);
			ten2 = (int) (ten3 % 100);
			System.out.println(ten1 + " 1 dollar bills");
			ten1 = (int) (ten2 / 25);
			ten3 = (int) (ten2 % 25);
			System.out.println(ten1 + " quarters");
			ten1 = (int) (ten3 / 10);
			ten2 = (int) (ten3 % 10);
			System.out.println(ten1 + "dimes");
			ten1 = (int) (ten2 / 05);
			ten3 = (int) (ten2 % 05);
			System.out.println(ten1 + "nickels");
			ten1 = (int) (ten3 / 01);
			ten2 = (int) (ten3 % 01);
			System.out.println(ten1 + "pennies");
		}

		else if (change == 500) {
			System.out.println("One five dollar bills");
		} else if (change > 500 && change < 1000) {
			int five1;
			int five2, five3;
			five1 = (int) (change / 500);
			five2 = (int) (change % 500);
			System.out.println(five1 + " 5 dollar bills");
			five1 = (int) (five2 / 100);
			five3 = (int) (five2 % 100);
			System.out.println(five1 + " 1 dollar bills");
			five1 = (int) (five3 / 25);
			five2 = (int) (five3 % 25);
			System.out.println(five1 + " quarters");
			five1 = (int) (five2 / 10);
			five3 = (int) (five2 % 10);
			System.out.println(five1 + "dimes");
			five1 = (int) (five3 / 05);
			five2 = (int) (five3 % 05);
			System.out.println(five1 + "nickels");
			five1 = (int) (five2 / 01);
			five3 = (int) (five2 % 01);
			System.out.println(five1 + "pennies");
		}

//		System.out.println(five2);

		if (change == 100) {
			System.out.println("One 1 dollar bill");
		} else if (change > 100 && change < 500) {
			int dollar1;
			int dollar2, dollar3;
			dollar1 = (int) (change / 100);
			dollar2 = (int) (change % 100);
			System.out.println(dollar1 + " 1 dollar bills");
			dollar1 = (int) (dollar2 / 25);
			dollar3 = (int) (dollar2 % 25);
			System.out.println(dollar3);
			System.out.println(dollar1 + " quarters");
			dollar1 = (int) (dollar3 / 10);
			dollar2 = (int) (dollar3 % 10);
			System.out.println(dollar1 + "dimes");
			dollar1 = (int) (dollar2 / 05);
			dollar3 = (int) (dollar2 % 05);
			System.out.println(dollar1 + "nickels");
			dollar1 = (int) (dollar3 / 01);
			dollar2 = (int) (dollar3 % 01);
			System.out.println(dollar1 + "pennies");
		}

		if (change == 25) {
			System.out.println("1 quarter");
		}

		else if (change > 25 && change < 100) {
			int qtr1;
			int qtr2, qtr3;
			qtr1 = (int) (change / 25);
			qtr2 = (int) (change % 25);
			System.out.println(qtr1 + " quarters");
			qtr1 = (int) (qtr2 / 10);
			qtr3 = (int) (qtr2 % 10);
			System.out.println(qtr1 + "dimes");
			qtr1 = (int) (qtr3 / 05);
			qtr2 = (int) (qtr3 % 05);
			System.out.println(qtr1 + "nickels");
			qtr1 = (int) (qtr2 / 01);
			qtr3 = (int) (qtr2 % 01);
			System.out.println(qtr1 + "pennies");
		}
		if (change == 10) {
			System.out.println("1 dime");
		} else if (change > 10 && change < 25) {
			int dime1;
			int dime2, dime3;
			dime1 = (int) (change / 10);
			dime2 = (int) (change % 10);
			System.out.println(dime1 + "dimes");
			dime1 = (int) (dime2 / 05);
			dime3 = (int) (dime2 % 05);
			System.out.println(dime1 + "nickels");
			dime1 = (int) (dime3 / 01);
			dime2 = (int) (dime3 % 01);
			System.out.println(dime1 + "pennies");
		}

		if (change == 05) {
			System.out.println("1 nickel");
		} else if (change > 05 && change < 10) {
			int nickle1;
			int nickle2, nickle3;
			nickle1 = (int) (change / 05);
			nickle2 = (int) (change % 05);
			System.out.println(nickle1 + "nickels");
			nickle1 = (int) (nickle2 / 01);
			nickle3 = (int) (nickle2 % 01);
			System.out.println(nickle1 + "pennies");

			if (change == 01) {
				System.out.println("1 penny");
			} else if (change > 01 && change < 05) {
				int penny1;
				penny1 = (int) (change / 01);
				System.out.println(penny1 + "pennies");
			}
		}
	}
}
