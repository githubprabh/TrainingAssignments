import java.util.*;
public class Assignment2 {

	public static void main(String args[])
	{
		int array[]= {5,4,4,5,0,12};
		int ans=solution(array);
		System.out.println("Ans : "+ans);
	}

    public static int solution(int[] A) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
		int initial =0,i=0;
		int[] L = new int[2];
		L[0]=-1;
		L[1]=-1;
		for(;i<A.length;i++) {
			if(L[0]==-1) 
			{
				L[0] = A[i];
			}
			else if(L[1]==-1) 
			{
				L[1] = A[i];
			}
			else {
				
				if(L[0]!=A[i] && L[1]!=A[i]) {
					list.add(i-initial);
					initial = i-1;
					int k = A[i-1];
					if(L[0]!=k) L[0]=A[i];
					else L[1]=A[i];
				}
			}
		}
		list.add(i-initial);
		return Collections.max(list);
    }
}