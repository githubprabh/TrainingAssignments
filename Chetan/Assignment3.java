public class Assignment3 {

	public static void main(String[] args) {
		String binaryString="1101";
		int count=0;
		int decimal=Integer.parseInt(binaryString,2);
		System.out.println(decimal);
		int num=decimal;
		while(num>1)
		{
			count++;
			if(num%2==0)
					num=num/2;
			else
					num=num+1;
		}
		System.out.println(count);
	}
}
