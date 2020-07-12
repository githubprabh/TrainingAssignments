public class BinaryOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1001";
		System.out.print(solution(s));

	}
	public static int  solution( String s)
	{
		
		
		if(s.charAt(0)==0)
			return 0;
		
		int dec=Integer.parseInt(s,2);
		
		System.out.println("The number is: "+dec);
		int div=0;
		int count=0;

		
		while(div!=1)
		{
			if(dec%2==1)
				{
					dec++; 
					count++;
				}
			
			div=dec/2;
			count++;
			
			dec=dec/2;		
		}	
		return count;	
	}

}