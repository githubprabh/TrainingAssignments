package Leetcode;

public class BinarySteps {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String s="1101";
		Solution2 sol = new Solution2();
		System.out.println("Min steps is :"+sol.solution(s));

	}

}

class Solution2
{
	    public static int solution(String s) {
			if (s.length() == 1) 
		         return 0; 
			
		     int count = 0; 
		     char[] chArr=s.toCharArray(); 
		     for (int i= s.length()-1; i>0;) { 
		    	 
		         if (chArr[i] == '0') { 
		             count++; 
		             i--; 
		         } 
		         
		         else { 					
		        	 count++; 
		  
		             while (chArr[i] == '1' && i > 0) { 
		            	 count++; 
		                 i--; 
		             } 
		             if (i == 0) 
		            	 count++; 
		             chArr[i] = '1'; 		
		         } 
		     } 
		     return count;
		}
}

