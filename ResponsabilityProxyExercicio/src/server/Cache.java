package server;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Cache extends HashMap<String, String> {
	private static final long serialVersionUID = 6818341117806226190L;
	private Integer size;
	private Queue<String> cached_uris;
	
	Cache(Integer size) {
		setSize(size);
		cached_uris = new LinkedList<String>();
	}
	
	private void setSize(Integer size) {
		this.size = size;
	}
	
	private Integer getSize() {
		return size;
	}
	
	public Boolean isCached(String uri) {
		return cached_uris.contains(uri);
	}
	
	public void updateCache(String uri, String content) {
		if (!isCached(uri) && getSize() == cached_uris.size()) {
			remove(cached_uris.peek());
			cached_uris.remove();
		} else {
			cached_uris.remove(uri);
		}
		cached_uris.add(uri);
		put(uri, content);
	}

}
