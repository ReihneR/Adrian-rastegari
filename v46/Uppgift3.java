import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tal = 0;
		int produkt = 1;
		
		for(int i = 1; i<= 10; i++) {
			
			tal = input.nextInt();
			produkt = produkt * tal;
			if(produkt >= 100000) {	
				
				break;
			
			
			}
				
		}
		System.out.println(produkt);
		input.close();
	}

}
