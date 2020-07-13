public class Assignment3 {
	
	public static void main(String[] args) {
		String S = "1101";
		int ans = solution(S);  		
		System.out.println("Steps required to reduce the given binary number to 1: "+ans); 		
	}


	public static int solution(String s) {
        
		if (s.length() == 1) 
	         return 0; 
		
	     int step = 0; 
	     char[] chArr=s.toCharArray(); 
	     for (int i= s.length()-1; i>0;) { 
	    	 
	         if (chArr[i] == '0') { 
	             step++; 
	             i--; 
	         } 
	         
	         else { 				
	             step++; 
	  
	             while (chArr[i] == '1' && i > 0) { 
	                 step++; 
	                 i--; 
	             } 
	             if (i == 0) 
	                 step++; 
	             chArr[i] = '1'; 
	         } 
	     } 
	     return step;
	}
}