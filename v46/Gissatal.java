import java.util.Scanner;

public class Gissatal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("v�lj ett tal mellan 1 - 20");
		int a = (int) (Math.random() * 20 + 1);
		int b = 0;
		boolean again ;

		while (b != a) {
			b = input.nextInt();

			if (a > b) {

				System.out.println("Mitt tal �r st�rre");

			} else if (a < b) {
				System.out.println("mitt tal �r l�gre");
			}

			else if (a == b) {
				System.out.println("Du har valt r�tt nummer GRATTIS!!");
			}
		}
	}

}
