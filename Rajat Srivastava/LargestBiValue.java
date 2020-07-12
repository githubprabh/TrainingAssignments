public class LargestBiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,4,5,0,12};
		System.out.print(solution(a));

	}
	public static int solution(int[] A) {
		int maxSize = 0;
		int currSize = 1;
		int a = A[0], b = 0;
		int repeat = 0;
		int num = 1;
		for(int i = 1; i<A.length; i++) {
			if(A[i] == a)
				currSize++;
			else if(num == 1) {
				b= A[i];
				currSize++;
				num++;
			}
			else if(A[i] == b)
				currSize++;
			else {
				maxSize = Math.max(currSize, maxSize);
				a = A[i-1];
				b = A[i];
				if(repeat != 0)
					currSize = 2+repeat;
				else
					currSize = 2;
			}
			maxSize = Math.max(currSize, maxSize);
			if(A[i] == A[i-1])
				repeat++;
			else
				repeat = 0;
		}
		return maxSize;
	}

}