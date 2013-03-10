package fancytext;

public class SpaceInserter {
	private static int N = 10;

	public static String apply(String in) {
		StringBuffer buff = new StringBuffer();
		int i = 0;
		for (char b : in.toCharArray()) {
			if (i++ % N == 0)
				buff.append(' ');
			buff.append(b);
		}
		return buff.toString();
	}
}
