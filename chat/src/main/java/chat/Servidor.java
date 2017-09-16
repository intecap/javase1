package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Thread{
	@Override
	public void run() {
		try {
			ServerSocket server = new ServerSocket(9000);
			
			while(true) {
				Socket cliente = server.accept();
				
				InputStreamReader isr = new InputStreamReader(cliente.getInputStream());
				BufferedReader reader = new BufferedReader(isr);
				
				System.out.println(reader.readLine());
				
				reader.close();
				cliente.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
