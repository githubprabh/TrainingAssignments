
public class BinaryToOneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryToOne binToOne = new BinaryToOne();
		String s = "1101";
		int ans = binToOne.numSteps(s);
		System.out.println("ans : "+ans);

	}

}
class BinaryToOne {
    public int numSteps(String s) {
        char[] array = s.toCharArray();
        
        
           int count = 0;
           int read_index = array.length-1;
           
           for(;read_index>0;){
               if(array[read_index] == '1'){
                     while(read_index>=0 && array[read_index] == '1'){
                         array[read_index] = '0';
                         read_index--;
                         
                     }
                     if(read_index>=0){
                         array[read_index] = '1';
                     }
                     count++;
               }else{
            	   read_index--;
               }
           }
        
           count += array.length - (read_index+1);
        
           return count;
    }
}