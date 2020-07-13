package Leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class BiValueSliceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {5,4,4,5,0,12};
		Solution3 sol=new Solution3();
		System.out.println(sol.solution(A));

	}

}
class Solution3{
	public int solution(int[] A) {
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