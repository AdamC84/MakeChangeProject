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

		if (change > 10.00) {
			int ten2 = (int) (change / 10);
			double ten1 = change % 10.00;
			System.out.println(ten2 + " ten dollar bills");

			if (ten1 % 5.0 == 0) {
				int five1 = (int)(ten1 / 5.0);
				System.out.println(five1 + " five dollar bills");
				if (ten1 % 5.0 != 0) {
					double five2 = ten1 % 5.0;
					System.out.println(five2);
				}
			}

		}
	}
}
