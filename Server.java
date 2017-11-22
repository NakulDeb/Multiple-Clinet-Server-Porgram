import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static final int port = 108;
	public static void main(String[] args) throws IOException {
		new Server().runServer();

	}

	private void runServer() throws IOException {
		ServerSocket s_socket = new ServerSocket(port);
		System.out.println("conections");
		while(true){
			Socket socket = s_socket.accept();
			new ServerThread(socket).start();
		}
		
		
	}

}
