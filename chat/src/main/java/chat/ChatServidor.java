package chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServidor extends Thread {
	private ServerSocket server;
	private MyChat chat;

	public ChatServidor(MyChat chat) {
		this.chat = chat;
	}

	@Override
	public void run() {
		Thread.currentThread().setName("MyChatServer");
		try {
			this.server = new ServerSocket(9900);

			while (true) {
				Socket client = server.accept();

				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

				chat.getTextArea().append(client.getInetAddress().getHostName() + ":" + br.readLine() + "\n");

				br.close();
				client.close();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
