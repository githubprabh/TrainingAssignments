package codility_assignments;

public class LargestBiValuedSlice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {5,4,5,3,5,3,3,3,5,1,0,12};
		System.out.println("Largest Bi-valued Slice in an Array : " + getVal(A));
	}
	public static int getVal(int [] A) {
		int len = A.length;
		if(len < 2) {
			return 0;
		}
		int x1 = A[0];
		int x2 = A[1];
		int maxLen = 2;
		int count = 2;
		int lastx1 = 0;
		int lastx2 = 1;
		for(int i = 2; i < len; i++) {
			if(A[i] == x1 || A[i] == x2) {
				if(A[i] == A[i-1]) {
					count++;
				}
				else {
					count++;
					if(A[i] == x1)
						lastx1 = i;
					else 
						lastx2 = i;
				}
			}
			else {
				if(lastx1 > lastx2) {
					x2 = A[i];
					lastx2 = i;
					count = i - lastx1 + 1;
				}
				else {
					x1 = A[i];
					lastx1 = i;
					count = i - lastx2 + 1;
				}
			}
			if(count > maxLen) {
				maxLen = count;
			}
		}
		return maxLen;
	}
}
