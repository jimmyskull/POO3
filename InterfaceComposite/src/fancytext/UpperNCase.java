package fancytext;

public class UpperNCase {
	private static int N = 3;

	public static String apply(String in) {
		StringBuffer buff = new StringBuffer();
		int i = 0;
		for (char b : in.toCharArray()) {
			if (i++ % N == 0)
				buff.append(Character.toUpperCase(b));
			else
				buff.append(b);
		}
		return buff.toString();
	}
}
