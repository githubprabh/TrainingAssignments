import java.lang.Math;
public class HappyString
{
    public static void main(String args[])
    {
        
        longestDiverseString(1,1,7);
        longestDiverseString(2,2,1);
        longestDiverseString(7,1,0);

        
    }
public static String longestDiverseString(int a, int b, int c)
    {
        int[] num = new int[]{a, b, c, 0};
        char[] chr = new char[]{'a', 'b', 'c', 'd'};
        StringBuilder sbr = new StringBuilder();
        int occ = 2;
        int max = 3;
        while(true)
        {
            int index = 3;
            for(int i=0; i<3; i++)
            if(num[i]>num[index] && i != max) 
                index = i;
            if(num[index] == 0) 
                break;
            if(num[index] >= num[max]) 
                occ =2;
            else 
                occ = 1;
            int count = Math.min(occ, num[index]);
            max = index;
            while(count > 0) 
            {
                sbr.append(chr[index]);
                num[index]--;
                count--;
            }
        }
        System.out.println(sbr.toString());
        return sbr.toString();

    }
}