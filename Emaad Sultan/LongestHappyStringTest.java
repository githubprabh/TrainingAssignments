
public class LongestHappyStringTest 
{
	public static void main(String args[])
	{
		Diverse d = new Diverse();
		System.out.println(d.longestDiverseString(1, 1, 7));
	}

}

class Diverse{
    public String longestDiverseString(int a, int b, int c) {
        
        int total=a+b+c;
        int count_a=0,count_b=0,count_c=0;


        String s="";
    
        for(int i=0;i<total;i++)    
        {
            if((a>=b && a>=c && count_a!=2)||(a>0 && (count_b==2||count_c==2)))
             {
                s=s+"a";
                count_a++;
                count_b=0;
                count_c=0;
                a--;
             }
            else if((b>=a && b>=c && count_b!=2)||(b>0 && (count_a==2||count_c==2)))
            {
                s=s+"b";
                count_b++;
                count_a=0;
                count_c=0;
                b--;
            }
            else if((c>=b && c>=a && count_c!=2)||(c>0 && (count_b==2||count_a==2)))
            {
                s=s+"c";
                count_c++;
                count_a=0;
                count_b=0;        
                c--;        
            }
        }
    
    return s;
}
}
  
