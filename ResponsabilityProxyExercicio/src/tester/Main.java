package tester;

import server.ProxyServer;
import server.Server;

public class Main {

	public static void main(String[] args) {
		Server server = new ProxyServer();
		
		System.out.println( server.getURI("www.google.com", true) );
		System.out.println( server.getURI("www.google.com.br", true) );
		System.out.println( server.getURI("www.google.com", true) );
		System.out.println( server.getURI("www.yahoo.com.br", true) );
		System.out.println( server.getURI("www.google.com.br", true) );
	}

}
