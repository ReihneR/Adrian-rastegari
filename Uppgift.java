import java.util.Scanner;

public class Uppgift {

	public static void metod(String ord, int liv) {
		Scanner input = new Scanner(System.in);

		char[] fyllning = new char[ord.length()]; // Detta �r fyllningen f�r bokst�verna som �nnu inte har gissats r�tt
													// p�
		int i = 0;

		while (i < ord.length()) {
			fyllning[i] = '*';
			if (ord.charAt(i) == ' ') {
				fyllning[i] = ' ';

			}
			i++;
		}
		System.out.print(fyllning);
		System.out.println("      �terst�ende liv = " + liv);

		while (liv > 0) {
			char x = input.next().charAt(0); // spelarens ins�ttning av bokstav och s� l�nge livet inte n�r 0 kan
												// spelaren forts�tta chansa
			if (ord.contains(x + "")) {
				for (int y = 0; y < ord.length(); y++) { //den h�r loppen kollar alla index f�r bokst�verna och byter ut * mot bokstaven
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
			System.out.println("      �terst�ende liv = " + liv);

			}
		}

	

	public static void main(String[] args) {
		String ord = "hello world"; // Meningen som spelaren ska gissa p�
		int liv = 11; // Hur m�nga f�rs�k spelaren f�r p� sig att gissa fram till Meningen
		metod(ord, liv);
	}

}
