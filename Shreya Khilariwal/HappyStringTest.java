
public class HappyStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyString happyString = new HappyString();
		int a = 1, b = 1, c = 7;
		String ans = happyString.longestDiverseString(a, b, c);
		System.out.println("ans : "+ans);

	}

}
class HappyString {
    public String longestDiverseString(int a, int b, int c) {
        int[] numbers = new int[]{a, b, c, 0};
        char[] chars = new char[]{'a', 'b', 'c', 'd'};
        StringBuilder sbr = new StringBuilder();
        int times = 2;
        int prev = 3;
        while(true) {
            int idx = 3;
            for(int i=0; i<3; i++)
                if(numbers[i]>numbers[idx] && i != prev) idx = i;
            if(numbers[idx] == 0) break;
            if(numbers[idx] >= numbers[prev]) times =2;
            else times = 1;
            int loop_count = Math.min(times, numbers[idx]);
            prev = idx;
            while(loop_count > 0) {
                sbr.append(chars[idx]);
                numbers[idx]--;
                loop_count--;
            }
        }
        return sbr.toString();
    }
}