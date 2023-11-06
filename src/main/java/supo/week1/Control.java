package supo.week1;

import java.util.Arrays;

public class Control {
	static int sum(int[] a) {
		int total = 0;
		int index = 0;
		
		while (index < a.length) {
			total += a[index];
			index++;
		}

		return total;
	}
	
	static int[] cumsum(int[] a) {
		int cumulativeValue = 0;
		int[] out = a.clone();
		
		for (int index = 0; index < out.length; index++) {
			cumulativeValue += out[index];
			out[index] = cumulativeValue;
		}
		return out;
	}
	
	static int[] positives(int[] a) {
		int[] out = new int[a.length];
		int count = 0;
		for (int i : a) {
			if (i > 0) {
				out[count] = i;
				count++;
			}
		}
		// remove the excess slots
		int[] result = new int[count];
		java.lang.System.arraycopy(out, 0, result, 0, count);
		return result;
	}
	
	public static void test() {
		int[] array = {1, 2, 3, 4, 5};
		System.out.println(sum(array));
		System.out.println(Arrays.toString(cumsum(array)));

		int[] array2 = {1, -2, 3, -4, 5};
		System.out.println(Arrays.toString(positives(array2)));
	}
	
}
