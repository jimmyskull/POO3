package relogio;

import java.util.Date;

public class Relogio  {
	private static Relogio instance = new Relogio();

	public Integer getTime() {
		Date now = new Date();  	
		Long longTime = new Long(now.getTime() / 1000);
		return longTime.intValue();
	}

	public static Relogio getInstance() {
		return instance;
	}

}
