import java.io.IOException;
import java.net.ServerSocket;

public class Server {

	public Server() {
		ServerSocket connectUser;
		try {
			connectUser = new ServerSocket(Integer.valueOf(System
					.getenv("PORT")));
		} catch (IOException e) {

		}
	}

	public static void main(String[] args) {
		new Server();
	}

}
