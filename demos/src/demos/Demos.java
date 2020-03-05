package demos;

import java.util.Arrays;

public class Demos {

	public static void main(String[] args) {
		int x[] = {3,8,2,01,2984};
		int y[] = new int[x.length];
		int c = 0;
		for(int i = x.length-1;i>=0;--i)
		{
			y[c] = x[i];
			c++;
		}
			System.out.println(Arrays.toString(y));
	}

}
