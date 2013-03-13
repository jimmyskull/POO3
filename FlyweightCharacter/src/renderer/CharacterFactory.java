package renderer;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
	private Map<String, Character> table = new HashMap<String, Character>();
	
	private Character makeCharacter(String key) {
		return new ConcreteCharacter("Glyph: " + key);
	}
	
	public Character getCharacter(String key) {
		if (table.containsKey(key)) 
			return table.get(key);
		Character character = makeCharacter(key);
		table.put(key, character);
		return character; 
	}
	
}
