package renderer;

import java.util.ArrayList;

public class Renderer {
	
	public void render(String input) {
		ArrayList<Character> list = new ArrayList<Character>(input.length());
		CharacterFactory cf = new CharacterFactory();
		
		for (char c: input.toCharArray())
			list.add(cf.getCharacter(String.valueOf(c)));
		
		for (Character c: list)
			c.draw(2);
	}
}
