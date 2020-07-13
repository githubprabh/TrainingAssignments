package codility_assignments;

import java.lang.Math; 
import java.util.*;

public class reduceNumberInBinaryRepresentationToOne {
    public int numSteps(String s) {
        char[] s1 = s.toCharArray();
        int len = s.length() - 1;
        int count = 0;
        try {
        while(len > 0) {
            count++;
            if(s1[len] == '1') {
                int i = len;
                while(i >= 0 && s1[i] != '0') {
                    s1[i] = '0';
                    i--;
                }
                if(i == -1)
                    len++;
                else
                    s1[i] = '1';
            }
            else {
                len--;
            }
        }
        }
        catch(Exception e){
            return s.length()+1;
            
        }
        return count;
    }
}