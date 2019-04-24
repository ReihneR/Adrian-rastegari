import java.util.Scanner;

public class Uppgift {

	public static void metod(String ord, int liv) {
		Scanner input = new Scanner(System.in);

		char[] fyllning = new char[ord.length()]; // Detta är fyllningen för bokstäverna som ännu inte har gissats rätt
													// på
		int i = 0;

		while (i < ord.length()) {
			fyllning[i] = '*';
			if (ord.charAt(i) == ' ') {
				fyllning[i] = ' ';

			}
			i++;
		}
		System.out.print(fyllning);
		System.out.println("      Återstående liv = " + liv);

		while (liv > 0) {
			char x = input.next().charAt(0); // spelarens insättning av bokstav och så länge livet inte når 0 kan
												// spelaren fortsätta chansa
			if (ord.contains(x + "")) {
				for (int y = 0; y < ord.length(); y++) { //den här loppen kollar alla index för bokstäverna och byter ut * mot bokstaven
					if (ord.charAt(y) == x) {
						fyllning[y] = x;
					}
				}
			}
				else {
					liv--; //Om det gissade bokstaven inte finns med i indexet tas ett liv bort
				}
			
			if(word.equals(String.valueof(fyllning))) {
				
				System.out.println(fyllning);
				System.out.println("Grattis du vann!!");
			}
			
			
			System.out.print(fyllning);
			System.out.println("      Återstående liv = " + liv);

			}
		}

	

	public static void main(String[] args) {
		String ord = "hello world"; // Meningen som spelaren ska gissa på
		int liv = 11; // Hur många försök spelaren får på sig att gissa fram till Meningen
		metod(ord, liv);
	}

}
