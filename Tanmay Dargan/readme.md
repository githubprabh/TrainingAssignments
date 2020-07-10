import java.util.ArrayList;
import java.util.Collections;


public class All3Assignment {

	public static void main(String[] args) {
		
		Assignment1 as = new Assignment1();
		int a=1; int b = 1; int c=7;
		System.out.println("================================================");
		System.out.println("---------Assignment1-----------");
		System.out.println("a = "+a+"b = "+b+"c = "+c);
		
		String num = as.longestDiverseString(a,b,c);
		System.out.println("Longest String = "+num);
		
		System.out.println("================================================");
		System.out.println("---------Assignment2-----------");
		
		int arr[] = {5,4,4,5,0,12};
		System.out.println("Arrays for finding largest bi valued = ");
		
		for(int i = 0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println(" ");
		
		int num1 = SolutionBiValue.solution(arr);
		
		System.out.println("Largest bi- valued Slice of array   = "+num1);

		System.out.println("===============================================");
		System.out.println("---------Assignment2-----------");
		String str = "10";
		System.out.println("String to be reduced = "+str);
		
		int num2 = solutionReduce.solution(str);
		System.out.println("Number of Steps = "+num2);
		System.out.println("===============================================");
		
		
	}

}

class Assignment1 {

    public String longestDiverseString(int a, int b, int c) {

StringBuilder sb = new StringBuilder();

int size = a + b + c;

int A = 0, B = 0, C = 0;

for(int i = 0; i < size; i++) {

if ((a >= b && a >= c && A != 2) || (B == 2 && a > 0) || (C == 2 && a > 0))  {

sb.append("a");


a--;

A++;

B = 0;

C = 0;  


}
else if ((b >= a && b >= c && B != 2) || (A == 2 && b > 0) || (C == 2 && b > 0)) {


sb.append("b");

b--;

B++;

A = 0;

C = 0;

} else if ((c >= a && c >= b && C != 2) || (B == 2 && c > 0) || (A == 2 && c > 0)) {


sb.append("c");

c--;

C++;

A = 0;

B = 0;  

}

}

return sb.toString();

}

}



class SolutionBiValue{
	public static int solution(int[] A) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		int initial =0,i=0;
		int[] B = new int[2];
		B[0]=-1;B[1]=-1;
		for(;i<A.length;i++) {
			if(B[0]==-1) {
				B[0] = A[i];
			}else if(B[1]==-1) {
				B[1] = A[i];
			}else {
				if(B[0]!=A[i] && B[1]!=A[i]) {
					l.add(i-initial);
					initial = i-1;
					int k = A[i-1];
					if(B[0]!=k) B[0]=A[i];
					else B[1]=A[i];
				}
			}
		}
		l.add(i-initial);
		return Collections.max(l);
	}
}
class solutionReduce {
	static int solution(String str) {
		 int steps = 0;
		 char[] s = str. toCharArray();       
		 int i = str.length() - 1;
		        int carry = 0;
		        while (i >= 0) {
		            if (s[i] == '0') 
		            {
		                if (carry == 0) 
		                {
		                    
		                    --i;
		                    ++steps;
		                } else {
		                    s[i] = '1';
		                    carry = 0;
		                }
		            } else {
		                if (carry == 0) {
		                    if (i == 0) return steps;
		                    
		                    // add 1
		                    carry = 1;
		                   
		                    ++steps;
		                } 
		                
		                // divide it by 2
		                --i;
		                ++steps;
		            }
		        }
		        return steps;

		    }
		}
