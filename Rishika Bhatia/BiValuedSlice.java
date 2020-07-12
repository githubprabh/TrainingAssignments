

public class BiValuedSlice 
{
	public static void main(String[] args) 
	{
		int A[] = {5,4,4,5,0,12};//4,5,5,4,5,4,5,3,2,5,4,5,4,5,5,5,5,5,4,4,4
		int ans = solution(A);
		System.out.println(ans);

	}
	public static int solution(int[] A)
	{
		int first=A[0];
		int second=A[1];
		int count=2;
		for(int i=2;i<A.length;i++)
		{
			if(A[i]==first)
			{
				count++;
			}
			else if(A[i]==second)
			{
				count++;
			}
			else
			{
				count=0;
				first=A[i];
				second=A[i+1];
				count+=1;
			}
		}
		return count;
		}
		
	}


