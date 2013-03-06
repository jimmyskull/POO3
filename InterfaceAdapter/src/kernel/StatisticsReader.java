package kernel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StatisticsReader {
	private Process getProcess() {
		String[] commands = { "/usr/bin/cat", "/proc/stat" };

		try {
			return Runtime.getRuntime().exec(commands);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private BufferedReader getReader() {
		return new BufferedReader(new InputStreamReader(getProcess()
				.getInputStream()));
	}

	public ArrayList<String> read() {
		BufferedReader stdInput = getReader();
		ArrayList<String> buff = new ArrayList<String>();
		try {
			String s;
			while ((s = stdInput.readLine()) != null)
				buff.add(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return buff;
	}
}
