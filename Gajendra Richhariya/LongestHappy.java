package assignment1;

public class LongestHappy {

	public static void main(String[] args) 
	{
		LongestHappy obj = new LongestHappy();
		System.out.println(obj.solution(7, 1, 0));

	}
	public String solution(int a, int b, int c)
	    {
	        String longestHappy = "";
	        int total = a+b+c;
	        int countA = 0;
	        int countB = 0;
	        int countC = 0;
	        
	        for(int i=0;i<total;i++)
	        {
	        	
	        	if((a>=b && a>=c && countA!=2)||(a>0 && (countB==2||countC==2)))
	            {
	                longestHappy=longestHappy+"a";
	                countA++;
	                countB=0;
	                countC=0;
	                a--;
	            }
	            
	            
	            else if((b>=a && b>=c && countB!=2)||(b>0 && (countA==2||countC==2)))
	            {
	                longestHappy=longestHappy+"b";
	                countB++;
	                countA=0;
	                countC=0;
	                b--;
	            }
	            
	            
	            else if((c>=b && c>=a && countC!=2)||(c>0 && (countB==2||countA==2)))
	            {
	                longestHappy=longestHappy+"c";
	                countC++;
	                countA=0;
	                countB=0;        
	                c--;        
	            }
	        }
	        	
	        
	        
	        
	        
	        return longestHappy;
	        
	        
	    }
	}

