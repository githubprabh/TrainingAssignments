
public class BinaryRepresentationTest
{
	public static void main(String args[])
	{
		Solution s = new Solution();
		System.out.println(s.numSteps("1101"));
	}
}

class Solution {
    public int numSteps(String s) {
        
       char[] array = s.toCharArray();
        
        int count = 0;
        //int r = 0;
        int n = array.length-1;
           
        for(;n>0;)
        {
            
            if(array[n] == '1')
            {
                
                while(n>=0 && array[n] == '1')
                {   
                    array[n] = '0';
                    n--;     
                }
                
                if(n>=0)
                {
                     array[n] = '1';
                }
                count++;
            }
            
            else
            {
                n--;
            }
        }
       
        count += array.length - (n+1);
        
        return count;
    }
}
    