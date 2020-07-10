
import java.math.*;
class Assignment3 {
    public int numSteps(String s) {
        int count = 0;
        while(s.length() != 1 && s.charAt(0)=='1'){
            count++;
            if(s.charAt(s.length()-1) == '1'){
                BigInteger n = new BigInteger(s, 2);
                n = n.add(new BigInteger("1"));
                s = n.toString(2);
            }
            else{
                s = s.substring(0, s.length()-1);
            }
        }
        return count;
    }
}