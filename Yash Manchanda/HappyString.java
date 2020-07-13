
public class HappyString {
	static String solution(int a, int b, int c) {
		String str ="";
		int tot = a+b+c;
		int countA = 0, countB = 0, countC = 0;
		for(int i = 0; i<tot; i++) {
			if(a>=b && a>=c && countA!=2 ){
				str = str+"a";
				countA++;
				a--;
				countB=0;
				countC=0;
			}
			else if (a>0 && (countB==2 || countC==2)){
				str = str+"a";
				countA++;
				a--;
				countB=0;
				countC=0;
			}
			else if(b>=a && b>=c && countB!=2){
				str = str+"b";
				countB++;
				b--;
				countA=0;
				countC=0;
			}
			else if (b>0 && (countA==2 || countC==2)){
				str = str+"b";
				countB++;
				b--;
				countA=0;
				countC=0;
			}
			else if(c>=b && c>=a && countC!=2) {
				str = str+"c";
				countC++;
				c--;
				countB=0;
				countA=0;
			}
			else if (c>0 && (countB==2 || countA==2)) {
				str = str+"c";
				countC++;
				c--;
				countB=0;
				countA=0;
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(6,4,2));
	}
}
