import java.util.*;

public class BiValuedSlice {
	public static void main(String args[])
	{
		int A[] = {3,2,-6,4,0};
		Slice s = new Slice();
		System.out.println("ans : "+s.solution(A));
	}
}

class Slice
{
	public int solution(int[] A)
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int init=0,i=0;
		int[] B = new int[2];
		B[0]=-1;B[1]=-1;
		for(;i<A.length;i++)
		{
			
			if(B[0]==-1) { B[0] = A[i]; }
			else if(B[1]==-1) { B[1] = A[i]; }
			else
			{
				if(B[0]!=A[i] && B[1]!=A[i])
				{
					ar.add(i-init);
					init = i-1;
					int k = A[i-1];
					if(B[0]!=k) B[0]=A[i];
					else B[1]=A[i];
				}
			}
		}
			ar.add(i-init);
			return Collections.max(ar);
	}	
}