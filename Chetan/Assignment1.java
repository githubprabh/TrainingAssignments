public class Assignment1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Solution obj=new Solution();
int a=1,b=1,c=7;
System.out.println(obj.longestDiverseString(a, b, c));
	}
}
class Solution {
    public String longestDiverseString(int a, int b, int c) {
  int total=a+b+c;
int aa=0,bb=0,cc=0;
    String s="";
    
for(int i=0;i<total;i++)    
{
    if((a>=b && a>=c && aa!=2)||(a>0 && (bb==2||cc==2)))
    {
        s=s+"a";
        aa++;
        bb=0;
        cc=0;
        a--;
    }
           else if((b>=a && b>=c && bb!=2)||(b>0 && (aa==2||cc==2)))
    {
        s=s+"b";
        bb++;
        aa=0;
        cc=0;
        b--;
    }
            else if((c>=b && c>=a && cc!=2)||(c>0 && (bb==2||aa==2)))
    {
        s=s+"c";
        cc++;
        aa=0;
        bb=0;        
        c--;        
    }
}
    return s;
}
}
