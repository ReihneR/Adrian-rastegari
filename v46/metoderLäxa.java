
public class metoderL�xa {

	
		static double volume(double radius) {
			 
			double volume = 4 * Math.PI * Math.pow(radius, 3);
			return volume;
		 }
		 
		 static String reverse(String str) {
			 String reverse = "";
			 for(char i : str.toCharArray()) {
				 reverse = i + reverse;
				 
				
			 }
			 return reverse;
			                                          
		 }
		public static int count (String str, char c) {
		
			
			int r�kna = 0;
			for (char bokstav : str.toCharArray()) {

				System.out.println("Bokstav: " + bokstav + " == " + c + " ?");
				if(bokstav == c) {
					r�kna++;
					
				
				}
				
					
					}
			System.out.println("det finns s� h�r m�nga av samma");
			return r�kna;
			
			}
		public static String sjorovare(String str) {
			
			String vokaler = "aou�eiy��";
			
		for (int X = 0; X < str.length(); X++) {
			char Z = str.charAt(X);
			boolean Vokaler = false;
			for (int vokal = 0; vokal < vokaler.length(); vokal++) {
				char vokalen = vokaler.charAt(vokal);
				if (Z == vokalen) {
					vokaler = "TESTSETSETSE";
				}
				
			}
				
				
				
			}
			return vokaler;
			
			
		}
		
		
		
			}
	


