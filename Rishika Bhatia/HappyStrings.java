public class HappyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = solution(1,1,0);
		System.out.println("string is :"+s);
	}
public static String solution(int a, int b, int c)
{
	String s = "";
	while(a>0 || b>0 || c>0)
	{
		if(a>=b && a>=c)
		{
			if(b>=1 && (a-2)>=0)
			{
				s=s+"aab";
				a=a-2;
				b=b-1;
			}
			else if(c>=1 && (a-2)>=0)
			{
				s=s+"aac";
				a=a-2;
				c=c-1;
			}
			else if(a==1)
			{
				s=s+"a";
				a--;
			}
			else if(a==2)
			{
				s=s+"aa";
				a=a-2;
			}
			else
			{
				System.out.println("Happy string cannot be made");
				s="";
				break;
			}
			
		}
		
		else if(b>=a && b>=c)
		{
			if(a>=1 && (a-2)>=0)
			{
				s=s+"bba";
				b=b-2;
				a=a-1;
			}
			else if(c>=1 && (b-2)>=0)
			{
				s=s+"bbc";
				b=b-2;
				c=c-1;
			}
			else if(b==1)
			{
				s=s+"b";
				b--;
			}
			else if(b==2)
			{
				s=s+"bb";
				b=b-2;
			}
			else
			{
				System.out.println("Happy string cannot be made");
				s="";
				break;
			}
			
		}
		
		else if(c>=a && c>=b)
		{
			if(a>=1 && (c-2)>=0)
			{
				s=s+"cca";
				c=c-2;
				a=a-1;
			}
			else if(b>=1 && (c-2)>=0)
			{
				s=s+"ccb";
				c=c-2;
				b=b-1;
			}
			else if(c==1)
			{
				s=s+"c";
				c--;
			}
			else if(c==2)
			{
				s=s+"cc";
				c=c-2;
			}
			else
			{
				System.out.println("Happy string cannot be made");
				s="";
				break;
			}
			
		}
	}
	return s;
}
}
