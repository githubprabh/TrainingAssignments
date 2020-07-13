
public class ReduceBinaryToOne {
	static int reduce(String s) {
		int pow = 0, num = 0, div = 0, count = 0;
		for(int i = s.length()-1; i>=0; i--) {
			div = s.charAt(i) - 48;
			num = div*(int)Math.pow(2,pow)+num;
			pow++;
		}
		int num2 = Integer.parseInt(s,2);
		System.out.println(num2);
		
		while(num!=1) {
			if(num%2 == 0) num = num/2; 
			else num = num+1; 
			count++;
		}
		return count;
	}

	
	public static void main(String[] args) {
		System.out.println(reduce("1101"));
	}
}
