package assignment1;

import java.util.*;
public class BiValuedSlice {

	public static void main(String[] args) {
		int arr[] = {5,4,4,5,0,12};
		LargestBiValuedSlice lobj = new LargestBiValuedSlice();
		int response = lobj.bToOne(arr);
		System.out.println(response);


	}

}
class LargestBiValuedSlice{
	public int bToOne(int[] A) {
		ArrayList<Integer> listArray = new ArrayList<Integer>();
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
					listArray.add(i-initial);
					initial = i-1;
					int k = A[i-1];
					if(B[0]!=k) B[0]=A[i];
					else B[1]=A[i];
				}
			}
		}
		listArray.add(i-initial);
		return Collections.max(listArray);
	}
}