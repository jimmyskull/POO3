package relogio;

public abstract class Display {
	
	public static Relogio getRelogio() {
		return Relogio.getInstance();
	}
	
	public abstract void updateRelogio();

}
