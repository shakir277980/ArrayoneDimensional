package arrayonedimensional;

public class exercise2 {

	public static void main(String[] args) {
		//write a statement that declare a string array initiablize with the following string:sunday,monday,tuesday,wednesday,thurday,friday,saturday
		//write a loop that display cintent of each element in the array that u declare
				
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

		for (int i=0; i<7; i++) {
			System.out.println(days[i]);
		}  
		System.out.println();
			
		int c=0;
		while(c<days.length) {
			  System.out.println(days[c]);
			  c++;
		}
	    System.out.println();
	    int count=0;
		do {
		     System.out.println(days[count]);
			 count++;
		 }while(count<7);
			    
			    

	}

}
