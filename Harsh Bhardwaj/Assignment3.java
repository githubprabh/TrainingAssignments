public class Assignment3
{
	public static void main(String args[])
	{
		String s="1101";
		
		int result = numSteps(s);
		
		System.out.println("Ans  -> "+result);
		
	}


	 public static int numSteps(String s)
	    {
	       int decimal = 0;  
	       int n = 0;
	       int binary=Integer.parseInt(s);
	        
	    while(true){
	        
	      if(binary == 0){
	          
	        break;  
	      } 
	        else 
	        {  
	          int temp = binary%10;  
	          decimal += temp*Math.pow(2, n);  
	          binary = binary/10;  
	          System.out.println("Decimal no-> "+decimal);
	          n++;  
	       }  
	    }  
	   
	    int count=0;
	    while(decimal>1)
	    {
	      
	    	if( decimal%2==0)
	    	{
	    		decimal = decimal/2;
	    		System.out.println("decimal when even -- "+decimal);
	    		count++;
	    	}
	       
	    	else
	    	{
	    		decimal = (decimal+1);
	    		System.out.println("decimal when odd -- "+decimal);
	    		count++;
	    	}
	    
	    }	
	    
	    return count;
	    
	    }

