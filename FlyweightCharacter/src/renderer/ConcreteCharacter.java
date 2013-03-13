package renderer;

public class ConcreteCharacter implements Character {
	private String value;
	
	ConcreteCharacter(String glyph) {
		value = glyph;
	}

	@Override
	public void draw(Integer scale) {
		System.out.println(value + " (scale: " + scale + ")");
	}
	
	public String toString() {
		return value;
	}

}
