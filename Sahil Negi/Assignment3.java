public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1101";
		int ans = numSteps(s);
	    System.out.println("Ans : "+ans);
	}
	
	public static int numSteps(String s) 
    {
		int step = 0;
	    int carry = 0;

	    for (int i = s.length() - 1; i > 0; i--) {
	    	
	    	if (s.charAt(i) - '0' + carry == 1) {
	    		//if it is odd, add 1 with it and update step by 2
	            carry = 1;
	            step += 2;
	        } 
	    	else {
	            step += 1;
	        }
	    }
	    return step + carry;
    }

}
