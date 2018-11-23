import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double tal1 = 0.1;
		
		int summa = 0;

		System.out.println("skriv in hur många tal du vill");
		
		while(tal1 != 0 ) {
		
		tal1 = input.nextInt();
		summa += tal1;
		
		if(tal1 == 0) {	
			
			System.out.println(summa);
			break;
		
		
		}
			
		
	
	}

	}
	
}
