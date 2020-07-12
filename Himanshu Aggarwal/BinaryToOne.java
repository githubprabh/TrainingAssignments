
public class BinaryToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String binaryNumber = "1";
		//String binaryNumber = "10";
		String binaryNumber = "1101";
		System.out.println(solution(binaryNumber)); 	
		}
		public static int solution(String binaryNumber){
			
		long decimal=Long.parseLong(binaryNumber,2);		
		long len=decimal; int count=0;
		for(int i=0;i<len;i++) {
			if(decimal%2!=0) {
				decimal+=1;
				count++;
			}
			else {
				decimal=decimal/2;
				count++;
			}
			if(decimal==1) {
				return count;
			}
		}
		return count;
	}

}
