import java.lang.Math;
public class BinaryRep
{
    public static void main(String args[])
    {
        
        numSteps("1101");
        numSteps("10");
        numSteps("1");

        

        
    }
public static int numSteps(String s)
    {
        int count =0;
        int num=Integer.parseInt(s,2);
        if (num == 1)
        {
            return count;
        }
        else 
        while(num>1)
        {
             if (num % 2 == 0) 
            {
                num = (num / 2);
                count++;
            }
            else
            {
                num= 1 + num;
                count++; 
            }
        }
        System.out.println(count);
        return count;
    }
}