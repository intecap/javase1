package chat;

import java.io.PrintWriter;
import java.net.Socket;

public class ChatCliente extends Thread {

	private String ip;
	private String message;
	private static final int PORT = 9900;

	public ChatCliente(String ip, String message) {
		this.ip = ip;
		this.message = message;
	}

	@Override
	public void run() {
		try {
			Thread.currentThread().setName("MyChatCliente");
			Socket cliente = new Socket(ip, PORT);
			PrintWriter out = new PrintWriter(cliente.getOutputStream());
			out.println(message);
			out.flush();
			out.close();
			cliente.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
