class Assignment_1 {
public String longestDiverseString(int a, int b, int c) {
        String S ="";
        int counta=0;
        int countb=0;
        int countc=0;
        int n=a+b+c;
        for(int i=0;i<n;i++){
            if(a>=b && a>=c && a>1 && counta<2){
                S+="aa";
                a=a-2;
                counta=2;
                countb=0;
                countc=0;
            }
            else if(b>=c && b>=a && b>1 && countb<2){
                S+="bb";
                b=b-2;
                counta=0;
                countb=2;
                countc=0;
            }
            else if(c>=a && c>=b && c>1 && countc<2){
                S+="cc";
                c=c-2;
                counta=0;
                countb=0;
                countc=2;
            }
            else if(a>0 && counta<2){
                S+="a";
                a--;
                counta++;
                countb=0;
                countc=0;
                
            }
            
            else if(b>0 && countb<2){
                S+="b";
                b--;
                counta=0;
                countb++;
                countc=0;
            }
            
            else if(c>0 && countc<2){
                S+="c";
                c--;
                counta=0;
                countb=0;
                countc++;
            }
        }
        return S;
        
    }
};