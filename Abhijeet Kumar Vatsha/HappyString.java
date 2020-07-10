class HappyString {
    
    class P {
        char c;
        int cnt;
        P(char c, int cnt){
            this.c=c;
            this.cnt=cnt;
        }
    }

    public String longestDiverseString(int a, int b, int c) {
        P[] ps = new P[]{new P('a', a), new P('b', b), new P('c', c)};
        
        StringBuilder sb = new StringBuilder();
        while(a>0 || b>0 || c>0){
            Arrays.sort(ps, (x, y)->{
                return y.cnt-x.cnt; 
            });
            boolean flag=true;
            for(int i=0; i<ps.length; i++){
                if(ps[i].cnt==0 || sb.length()>=2 && sb.charAt(sb.length()-1)==ps[i].c && sb.charAt(sb.length()-2)==ps[i].c) continue;
                sb.append(ps[i].c);
                ps[i].cnt--;
                flag=false;
                break;
            }
            if(flag) break;
        }
        
        return sb.toString();
    }
    
}
