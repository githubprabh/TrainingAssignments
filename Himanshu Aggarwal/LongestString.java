

public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//System.out.println(solution(2,5,8));
		System.out.println(solution(2,2,1)); }
		public static String solution(int X,int Y,int Z){
			String dString="";
			int countx=0,county=0,countz=0;
			int N=X+Y+Z;
			for(int i=0;i<N;i++){
				if(X>=Y && X>=Z && X>1 && countx<2){
					dString+="aa";
					X-=2;
					countx=2;
					county=0;
					countz=0;
				}
				else if(Y>=Z && Y>=X && Y>1 && county<2){
					dString+="bb";
					Y-=2;
					county=2;
					countx=0;
					countz=0;
				}
				else if(Z>=Y && Z>=X && Z>1 && countz<2){
					dString+="cc";
					Z-=2;
					countz=2;
					county=0;
					countx=0;
				}		
				else if(X>0 && countx<2){
					dString+="a";
					X--;
					countx++;
					county=0;
					countz=0;	
				}	
				else if(Y>0 && county<2){
					dString+="b";
					Y--;
					county++;
					countx=0;
					countz=0;
				}	
				else if(Z>0 && countz<2){
					dString+="c";
					Z--;
					countz++;
					countx=0;
					county=0;
				}	
			}				
			return dString;
	}
}
