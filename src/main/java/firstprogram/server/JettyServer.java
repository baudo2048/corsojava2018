package firstprogram.server;

import org.eclipse.jetty.server.Server;

public class JettyServer {

	public static void main(String[] args) throws Exception {
        Server server = new Server(8081);
        server.setHandler(new HelloHandler());
        
        server.start();
        server.join();
	}

}
