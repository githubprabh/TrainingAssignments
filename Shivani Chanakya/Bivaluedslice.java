package lessons;

import java.util.ArrayList;
import java.util.Collections;

public class Bivaluedslice {
	public int solution(int[] A) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int start =0;
		int i;
		int[] B = new int[2];
		B[0]=-1;
		B[1]=-1;
		for(i=0;i<A.length;i++) {
			if(B[0]==-1) {
				B[0] = A[i];
			}else if(B[1]==-1) {
				B[1] = A[i];
			}else {
				if(B[0]!=A[i] && B[1]!=A[i]) {
					al.add(i-start);
					start = i-1;
					int k = A[i-1];
					if(B[0]!=k) 
						B[0]=A[i];
					else 
						B[1]=A[i];
				}
			}
		}
		al.add(i-start);
		int b=Collections.max(al);
		System.out.println("The size of the largest bi-valued slice in A is "+b);
		return b;
	}
        
    
	public static void main(String args[])
	{
		int[] A = {5,4,4,5,0,12};
		Bivaluedslice obj=new Bivaluedslice();
			obj.solution(A);		
	}
}
