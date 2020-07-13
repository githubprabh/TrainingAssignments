
class Assignment2
{
public static void main(String args[])
{
	
int A[]={4,5,5,4,5,4,5,3,2,5,4,5,4,5,5,5,5,5,4,4,4};
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
System.out.println(count);
}
}