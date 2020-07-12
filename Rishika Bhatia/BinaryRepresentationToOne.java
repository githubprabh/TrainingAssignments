
public class BinaryRepresentationToOne 
{
	public static void main(String[] args) 
	{
		String s = "10";
		int ans = solution(s);
		System.out.println(ans);
	}
	public static int solution(String s)
	{
		int count=0;
		int decimal=Integer.parseInt(s,2);
		while(decimal != 1)
		{
			if(decimal%2 == 0)
			{
				decimal = decimal/2;
				count++;
			}
			else
			{
				decimal = decimal+1;
				count++;
			}
		}
		return count;
	}

}
