import java.util.Scanner;

public class Gissatal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// h�r fr�gar du att man ska v�lja ett tal mellan 1 till 20
		System.out.println("v�lj ett tal mellan 1 - 10");
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
					System.out.println("Mitt tal �r st�rre");

				} else if (a < b) {
					antal= antal +1;
					System.out.println("mitt tal �r l�gre");
				}

				else if (a == b) {
					antal= antal +1;
					System.out.println("Du har valt r�tt nummer GRATTIS!!, det tog " + antal + " f�rs�k");
				}
			}
			System.out.println("vill du k�ra igen");
			String fake = input.nextLine();
			String fraga = input.nextLine();
			if (fraga.equals("ja")) {
				again = true;
				a = (int) (Math.random() * 10 + 1);
				System.out.println("v�lj ett tal mellan 1 - 10");
				antal = 0;

			} else {
				System.out.println("okej hejd�");
				break;
			}
		}
	}

}
