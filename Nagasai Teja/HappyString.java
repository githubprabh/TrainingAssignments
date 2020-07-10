package Leetcode;

public class HappyString {
	
	public static void main(String[] args) {
		int a=2;
		int b=2;
		int c=7;
		Solution sol=new Solution();
		System.out.println(sol.HappyString(a, b, c));
			
	}


}
class Solution {
    
    public String HappyString(int a, int b, int c) {
         String S="";
        int counta=0,countb=0,countc=0;        
        
        for(int i=0;i<a+b+c;i++){
            
            if(a>=b && a>=c && a>1 && counta<2){
                S+="aa";
                a-=2;
                counta=2;
                countb=0;
                countc=0;
            }
            else if(b>=c && b>=a && b>1 && countb<2){
                S+="bb";
                b-=2;
                countb=2;
                counta=0;
                countc=0;
            }
            else if(c>=b && c>=a && c>1 && countc<2){
                S+="cc";
                c-=2;
                countc=2;
                countb=0;
                counta=0;
            }    
            
            else if(a>0 && counta<2){
                S+="a";
                a--;
                counta++;
                countb=0;
                countc=0;
                
            }
            
            else if(b>0 && countb<2){
                 S+="b";
                b--;
                countb++;
                counta=0;
                countc=0;
            }
            
            else if(c>0 && countc<2){
                S+="c";
                c--;
                countc++;
                counta=0;
                countb=0;
            }
            
        }
        
        
        return S;
    }
    
}