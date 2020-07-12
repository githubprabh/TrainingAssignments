public class 
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		x=1;y=1;z=7;
		System.out.print(solution(x,y,z));
	}
	
	    public static String solution(int a, int b, int c) {
	        int maxval=a+b+c;
	        int counta=0;
	        int countb=0;
	        int countc=0;
	         String s="";
	    
	for(int i=0;i<maxval;i++)    
	{
	    
	    if((a>=b && a>=c && counta!=2)||(a>0 && (countb==2||countc==2)))
	    {
	        s=s+"a";
	        counta++;
	        countb=0;
	        countc=0;
	        a--;
	    }
	    
	    
	           else if((b>=a && b>=c && countb!=2)||(b>0 && (counta==2||countc==2)))
	    {
	        s=s+"b";
	        countb++;
	        counta=0;
	        countc=0;
	        b--;
	    }
	    
	    
	            else if((c>=b && c>=a && countc!=2)||(c>0 && (countb==2||counta==2)))
	    {
	        s=s+"c";
	        countc++;
	        counta=0;
	        countb=0;        
	        c--;        
	    }
	}
	    
	    return s;
	   
	        
	    }
	}

