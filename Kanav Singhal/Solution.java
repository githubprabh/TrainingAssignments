//question1
/*Given three integers a, b and c, return any string s, which satisfies following conditions:

s is happy and longest possible.
s contains at most a occurrences of the letter 'a', at most b occurrences of the letter 'b' and at most c occurrences of the letter 'c'.
s will only contain 'a', 'b' and 'c' letters.
*/
public class Solution {
    public static void main(String[] args) {
// TODO Auto-generated method stub
    	int a=1;
    	int b=1;
    	int c=7;
    	String s=longestDiverseString(a, b, c);
    	System.out.println(s);

}
        public static String longestDiverseString(int a, int b, int c) {
             String s="";
            int counta=0,countb=0,countc=0;
            int total=a+b+c;
            for(int i=0;i<total;i++)
            	{
                	if(a>=b && a>=c && a>1 && counta<2)
                	{
                		s+="aa";
                		a-=2;
                		counta=2;
                		countb=countc=0;
                	}
                	else if(b>=c && b>=a && b>1 && countb<2)
                	{
                		s+="bb";
                		b-=2;
                		countb=2;
                		counta=countc=0;
                	}
                	else if(c>=b && c>=a && c>1 && countc<2)
                	{
                		s+="cc";
                		c-=2;
                		countc=2;
                		countb=counta=0;
                	}    
                	else if(a>0 && counta<2)
                	{
                		s+="a";
                		a--;
                		counta++;
                		countb=countc=0;
                    }
                	else if(b>0 && countb<2)
                	{
                		s+="b";
                		b--;
                		countb++;
                		counta=countc=0;
                	}
                	else if(c>0 && countc<2)//so that after cc c is not printed 
                	{
                		s+="c";
                		c--;
                		countc++;
                		counta=countb=0;
                	}
            	}
            return s;
        }
        
    }

