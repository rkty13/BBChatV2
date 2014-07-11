import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	@SuppressWarnings("resource")
	public Server() {
		ServerSocket connectUser;
		try {
			connectUser = new ServerSocket(Integer.valueOf(System
					.getenv("PORT")));

			while (true) {
				Socket connection = null;
				try {
					connection = connectUser.accept();
				} catch(IOException e) {
					
				}
			}
		} catch (IOException e) {

		}
	}

	public static void main(String[] args) {
		new Server();
	}

}
