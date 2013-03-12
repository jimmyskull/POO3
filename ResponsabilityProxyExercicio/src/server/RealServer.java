package server;

public class RealServer implements Server {

	@Override
	public String getURI(String uri, Boolean acceptCached) {
		return "OK: " + uri;
	}

}
