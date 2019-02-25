import java.util.Scanner;

public class Gissatal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// här frågar du att man ska välja ett tal mellan 1 till 20
		System.out.println("välj ett tal mellan 1 - 10");
		int a = (int) (Math.random() * 10 + 1);
		int b = 0;
		boolean again = true;
		int antal = 0;
		while (again) {

			while (b != a) {
				antal = 0;
				b = input.nextInt();

				if (a > b) {
					antal= antal +1;
					System.out.println("Mitt tal är större");

				} else if (a < b) {
					antal= antal +1;
					System.out.println("mitt tal är lägre");
				}

				else if (a == b) {
					antal= antal +1;
					System.out.println("Du har valt rätt nummer GRATTIS!!, det tog " + antal + " försök");
				}
			}
			System.out.println("vill du köra igen");
			String fake = input.nextLine();
			String fraga = input.nextLine();
			if (fraga.equals("ja")) {
				again = true;
				a = (int) (Math.random() * 10 + 1);
				System.out.println("välj ett tal mellan 1 - 10");
				antal = 0;

			} else {
				System.out.println("okej hejdå");
				break;
			}
		}
	}

}
