package codility_assignments;

public class longestHappyString {
    public String longestDiverseString(int a, int b, int c) {
        int aPrev = 0;
        int bPrev = 0;
        int cPrev = 0;
        int total = a + b + c;
        String ans = "";
        int i = 0;
        while(i++ < total) {
            if((a >= b && a >= c && aPrev < 2) || (a > 0 && (bPrev == 2 || cPrev == 2))) {
                ans = ans + 'a';
                aPrev++;
                bPrev = 0;
                cPrev = 0;
                a--;
            }
            else if((b >= a && b >= c && bPrev < 2) || (b > 0 && (aPrev == 2 || cPrev == 2))) {
                ans = ans + 'b';
                bPrev++;
                aPrev = 0;
                cPrev = 0;
                b--;
            }
            else if((c >= a && c >= b && cPrev < 2) || (c > 0 && (aPrev == 2 || bPrev == 2))) {
                ans = ans + 'c';
                cPrev++;
                aPrev = 0;
                bPrev = 0;
                c--;
            }
            else
                return ans;
        }
        return ans;
    }
}