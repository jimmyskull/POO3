package server;


public class ProxyServer implements Server {
	private static final Integer CACHE_SIZE = 5;
	private Server server;
	private Cache cache;
	
	public ProxyServer() {
		server = new RealServer();
		cache = new Cache(CACHE_SIZE);
	}

	@Override
	public String getURI(String uri, Boolean acceptCached) {
		if (acceptCached && cache.isCached(uri))
			return cache.get(uri) + " (cached)";
		String content = server.getURI(uri, acceptCached);
		cache.updateCache(uri, content);
		return content;
	}

}
