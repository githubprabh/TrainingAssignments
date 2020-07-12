import java.util.ArrayList;
import java.util.Collections;

public class LargestBiValuedTest {

	public static void main(String[] args) {
		int array[] = {5,4,4,5,0,12};
		LargestBiValued lbv = new LargestBiValued();
		int ans = lbv.solution(array);
		System.out.println("ans "+ans);
	}
}
class LargestBiValued{
	public int solution(int[] A) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int initial =0;
		int i=0;
		int[] B = new int[2];
		B[0]=A[0];
		B[1]=A[1];
		for(i=0;i<A.length;i++) {
			if(B[0]!=A[i] && B[1]!=A[i]) {
					list.add(i-initial);
					initial = i-1;
					int k = A[i-1];
					if(B[0]!=k) B[0]=A[i];
					else B[1]=A[i];
				}
			}
		list.add(i-initial);
		return Collections.max(list);
	}
}