import java.util.Scanner;

public class Gissatal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// h�r fr�gar du att man ska v�lja ett tal mellan 1 till 20
		System.out.println("v�lj ett tal mellan 1 - 10");
		// h�r s� vals det ett slumpm�ssigt tal mellan 1 till 10
		int a = (int) (Math.random() * 10 + 1);
		int b = 0;
		boolean again = true;
		while (again) {
			int antal = 0;
			// om man inte har gissat r�tt s� kommer den att forts�tta k�ra
			while (b != a) {
				b = input.nextInt();
				antal++;
				// om det random talet �r st�rre �n det talet du skriver in s� kommer det att
				// st� mitt tal �r st�rre
				if (a > b) {

					System.out.println("Mitt tal �r st�rre");
					// och h�r �r det tv�rtom ifall det �r mindre
				} else if (a < b) {

					System.out.println("mitt tal �r l�gre");
				}
				// ifall du gissar r�tt s� kommer det att st� GRATTIS
				else if (a == b) {

					System.out.println("Du har valt r�tt nummer GRATTIS!!, det tog " + antal + " f�rs�k");
				}
			}
			// h�r k�r den om ifall man skriver ja
			System.out.println("vill du k�ra igen");
			System.out.println("skriv ja");
			System.out.println("eller nej");
			String fake = input.nextLine();
			String fraga = input.nextLine();

			if (fraga.equals("ja")) {
				again = true;
				a = (int) (Math.random() * 10 + 1);
				System.out.println("v�lj ett tal mellan 1 - 10");

			} else if (fraga.equals("nej")) {
				again = false;

				System.out.println("okej hejd�");
				break;

			} else {

				System.out.println("fel inmatning");

			}
		}
	}

}
