package fancytext;

public class FancyText {
	public static String toFancyText(String s) {
		String tmp = s;
		
		tmp = Lower.apply(tmp);
		tmp = UpperNCase.apply(tmp);
		tmp = SpaceInserter.apply(tmp);
		
		return tmp;
	}
}
