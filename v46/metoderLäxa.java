



public class metoderLäxa {

	
		 public static double volume(double radius) {
			 
			double volume = 4 * Math.PI * Math.pow(radius, 3);
			return volume;
		 }
		 
		public static String reverse(String str) {
			 String reverse = "";
			 for(char i : str.toCharArray()) {
				 reverse = i + reverse;
				 
				
			 }
			 return reverse;
			                                          
		 }
		public static int count (String str, char c) {
		
		
			int räkna = 0;
			for (char bokstav : str.toCharArray()) {

				System.out.println("Bokstav: " + bokstav + " = " + c + " ?");
				if(bokstav == c) {
					räkna++;
			
					
		}
				
	}


