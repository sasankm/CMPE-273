
public class Array {
	public int[] addonetoarray(int [] num) {
		int len = num.length;
		int output[]=new int[len];
		for(int i=0;i<len;i++) {
			output[i]=num[i]+1;
		}
		return output;
	}
	public int[] mulbytwo(int [] ele) {
		int out[] = new int[ele.length];
		for(int i=0;i<ele.length;i++) {
			out[i] = ele[i] * 2;
		}
		return out;
	}
}
