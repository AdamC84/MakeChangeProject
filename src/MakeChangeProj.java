import java.util.Scanner;

public class MakeChangeProj {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double tender, change, price;

		System.out.println("How much is the item that you are purchasing?");
		price = kb.nextDouble();
		System.out.println("How much money are you paying for that item?");
		tender = kb.nextDouble();

		if (price > tender) {
			System.out.println("That is not enough money.");
		} else if (price == tender) {
			System.out.println("That was the exact amount and ther is no change.");
		}
		change(tender, price);

		kb.close();
	}

	public static void change(double tend, double price1) {
		double change = (double) (tend - price1);
		int change1 = (int) (change * 100);
		int dollar1 = 0, dollar, five2, ten1, ten2, cent10,cent102, cent1,cent12;

//		System.out.println(change1);

		if (change1 > 1000) {
			 ten2 = (int) (change1 / 1000);
			 ten1 = change1 % 1000;
//			System.out.println(ten1);
			System.out.println(ten2 + " ten dollar bills");

			if (ten1 % 500 == 0) { 
				double five1 = ten1 / 5.00;
				System.out.println(five1 + " five dollar bills");
			}
			if (ten1 % 500 != 0) {
				five2 = ten1 % 500;
				System.out.println(five2 + " 5 dollar bills");

//				System.out.println(five2);
			}
			if (ten1 < 500) {
				dollar = ten1 / 100;
				dollar1 = ten1 % 100;
				System.out.println(dollar + " 1 dollar bills");
			}
			if (dollar1 < 100) {
				cent10 = dollar1 / 100;
				cent102 = dollar1 % 100;
				System.out.println(cent10 + "dimes");

			}
		}
	}

}
