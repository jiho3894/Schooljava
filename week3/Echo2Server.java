package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


/*  Chatting Programming   */ 
/* server - side program  */ 

public class Echo2Server {
	/* �ʵ� ���� */ 

  protected static boolean cont = true; 
  protected Socket connection = null; 

	/* ������ */ 
	/* �޼��� ���� */ 
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ServerSocket server = null; 
		server = new ServerSocket(5000); 
		System.out.println("���� ���� ����--");

		while(cont) {
			System.out.println("���� ���� ��� ��-----");
			new Echo2Server(server.accept()); 
		}
		server.close();
	}

	private Echo2Server(Socket clientSocket) {
		connection = clientSocket; 
		run(); 
	}

	public void run() {
		BufferedReader in; 
		System.out.println("Ŭ���̾�Ʈ�� ����� ���� ���ο� ������ ����");
		try {
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String msg; 
			while((msg = in.readLine()) !=null ) {
				System.out.println("���� �޽���:" + msg);
			}
			in.close();
			connection.close();
		} catch(IOException e) {
		}
	}
}