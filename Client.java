import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String name = args[0];
		Socket socket = new Socket("localhost",108);
		PrintWriter PW = new PrintWriter(socket.getOutputStream(),true);
		BufferedReader BR = new java.io.BufferedReader(new InputStreamReader(System.in));
		while(true){
			String in = BR.readLine();
			PW.println(name + " : " + in);
		}

	}

}