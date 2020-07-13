package assignment1;

public class BinaryToOne
{

	public static void main(String[] args)
	{
		String str = "1101";
		BinaryToOne obj = new BinaryToOne();
		System.out.println(obj.solution(str));
	}
	
	public int solution(String s)
	{
		char[] array = s.toCharArray();
        int count = 0;
        int index = array.length-1;
        
        for(;index>0;)
        {
            if(array[index] == '1')
            {
                  while(index>=0 && array[index] == '1')
                  {
                      array[index] = '0';
                      index--;
                      
                  }
                  if(index>=0)
                  {
                      array[index] = '1';
                  }
                  count++;
            }
            else
            {
                index--;
            }
        }
     
        count += array.length - (index+1);
     
        return count;
	}
}





















