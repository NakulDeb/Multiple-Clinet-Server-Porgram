
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread extends Thread {
	Socket socket;
	ServerThread(Socket socket){
		this.socket = socket;
	}
	public void run(){
		try{
			String message = null;
			BufferedReader BR = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while((message = BR.readLine())!=null){
				System.out.println("Incoming Client message : " + message);
			}
			socket.close();
		}
		catch(Exception E){
			E.printStackTrace();
		}
	}
}