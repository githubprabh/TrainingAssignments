class LogestHappyString1 {

    public static void main(String[] args) {
    	int a=1,b=1,c=7;
	String lngHappyStr = Solution.longestDiverseString(a,b,c);
	System.out.printf("Longest happy string a=%d, b=%d, c=%d is : %s\n", a, b, c, lngHappyStr);
    }
}


class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder builder= new StringBuilder();
        int total = a+b+c;
        int strA=0;
        int strB=0;
        int strC=0;
        
        for (int i=0;i<total;i++)
        {
            if((a>=b && a>=c && strA !=2)|| (a>0 && (strB==2||strC==2)))
            {
                builder.append("a");
                strA++;
                strB=0;
                strC=0;
                a--;
            }
            else if((b>=a && b>=c && strB !=2)|| (b>0 && (strA==2||strC==2)))
            {
                builder.append("b");
                strB++;
                strA=0;
                strC=0;
                b--;
            }
            else if((c>=b && c>=a && strC !=2)|| (c>0 && (strB==2||strA==2)))
            {
                builder.append("c");
                strC++;
                strA=0;
                strB=0;
                c--;
            }
        }   
        return builder.toString();
    }
}