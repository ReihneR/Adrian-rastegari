public class Arraymetoder {
	
	public static int numberOfSevens(int[] numbers) {
		 int counter = 0;
		
		for(int i = 0; i< numbers.length; i++) {
			
			if(numbers[i] ==7) {
				
				
				counter++;
				
			}
			
		}
		return counter;
	}

	public static int search(String[] names, String search) {
		
		int counter = 0;
		
		for(int i = 0; i< names.length; i++) {
			
			if(names[i].equals(search)) {
			 
				  counter++ ;
				
							
				}
		}
		return counter;
		
		
		
	}

	
 public static int maxnmin(int[] numbers) {
	 
		 int counter = 0;
			for(int i = 0; i<10; i++) {
		for(int j = 0; j< numbers.length; j++) {
			
			if(numbers[j] ==i) {
				
				
				counter++;
				
			}
			
		}
			}
		return counter;
	}
	   
	   
	   
   }

	

