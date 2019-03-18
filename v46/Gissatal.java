import java.util.Scanner;

public class Gissatal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// här frågar du att man ska välja ett tal mellan 1 till 20
		System.out.println("välj ett tal mellan 1 - 10");
		// här så vals det ett slumpmässigt tal mellan 1 till 10
		int a = (int) (Math.random() * 10 + 1);
		int b = 0;
		boolean again = true;
		while (again) {
			int antal = 0;
			// om man inte har gissat rätt så kommer den att fortsätta köra
			while (b != a) {
				b = input.nextInt();
				antal++;
				// om det random talet är större än det talet du skriver in så kommer det att
				// stå mitt tal är större
				if (a > b) {

					System.out.println("Mitt tal är större");
					// och här är det tvärtom ifall det är mindre
				} else if (a < b) {

					System.out.println("mitt tal är lägre");
				}
				// ifall du gissar rätt så kommer det att stå GRATTIS
				else if (a == b) {

					System.out.println("Du har valt rätt nummer GRATTIS!!, det tog " + antal + " försök");
				}
			}
			// här kör den om ifall man skriver ja
			System.out.println("vill du köra igen");
			System.out.println("skriv ja");
			System.out.println("eller nej");
			String fake = input.nextLine();
			String fraga = input.nextLine();

			if (fraga.equals("ja")) {
				again = true;
				a = (int) (Math.random() * 10 + 1);
				System.out.println("välj ett tal mellan 1 - 10");

			} else if (fraga.equals("nej")) {
				again = false;

				System.out.println("okej hejdå");
				break;

			} else {

				System.out.println("fel inmatning");

			}
		}
	}

}
