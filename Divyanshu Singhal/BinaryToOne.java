class BinaryToOne {

	public static void main(String[] args) {
		String binaryNum = "1101";
		int step = Solution.numSteps(binaryNum);
		System.out.println("Number of steps required to convert " + binaryNum + " to " + "1 : " +step);
	}
}


class Solution {
    public int numSteps(String s) {
        char[] arr = s.toCharArray();
        
        
           int count = 0;
           int r = 0;
           int arrIndex = arr.length-1;
           
           while(arrIndex>0)
           {
               if(arr[arrIndex] == '1')
               {
                     while(arrIndex>=0 && arr[arrIndex] == '1')
                     {
                         arr[arrIndex] = '0';
                         arrIndex--;
                         
                     }
                     if(arrIndex>=0){
                         arr[arrIndex] = '1';
                     }
                    count++;
               }
               else
               {
                   arrIndex--;
               }
           }
           count += arr.length - (arrIndex+1);
        
           return count;
}
}
