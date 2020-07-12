
/*Question 3
 Given a number s in their binary representation. Return the number of steps to reduce it to 1 under the following rules:

If the current number is even, you have to divide it by 2.

If the current number is odd, you have to add 1 to it.
*/
public class Binary {
	public static void main(String args[])
	{
		//String s="1101";
		String s="11101111110010";
		int ans=solution(s);
		System.out.println(ans);
	}
	 public static int solution(String s)
	    {
		 int decimal = 0;  
		 int n = 0;
		 int  binary=0;
		 int bin=0;
		 int factor = 1;
		 for(int i = s.length()-1; i >= 0; i--) //to convert string into integer
    	  {
			 bin += (s.charAt(i) - '0') * factor;
			 factor *= 10;
    	  }
      binary=(int)Math.abs(bin); //to convert the negative number to positive
      //System.out.println(bin);
     // System.out.println(binary);
	    while(true){
	        
	      if(binary == 0){
	          
	        break;  
	      } 
	        else 
	        {  
	          int temp = binary%10;  
	          decimal += temp*Math.pow(2, n);  
	          binary = binary/10;  
	          
	          n++;  
	       }  
	    }  
	    int count=0;
	    while(decimal>1)
	    {
	      
	    	if( decimal%2==0)
	    	{
	    		decimal = decimal/2;
	    		count++;
	    	}
	       
	    	else
	    	{
	    		decimal = (decimal+1);
	    		count++;
	    	}
	    
	    }	
	    
	    return count;
	    
	    }
}
//