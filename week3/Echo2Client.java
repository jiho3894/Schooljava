package networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/* client - side  ���α׷� �ۼ� */ 
public class Echo2Client {
	public static void main(String[] args)  throws IOException  {
		// TODO Auto-generated method stub
		Socket client = null;  
		/*  ������ ������ �߻��ϸ� Ŭ���̾�Ʈ�� ���� ������ �߻� */
		PrintWriter out = null; 
		try {
			client = new Socket(); 
			System.out.println("Echo Server�� ���� �õ�-----");
			client.connect(new InetSocketAddress("localhost", 5000),  3000);
			System.out.println("Echo Server ���� ����-----");
		} catch(Exception e) {

		}
		out = new PrintWriter(client.getOutputStream(), true); 
		Scanner in = new Scanner(System.in); 
		String msg; 
		System.out.println("���� �޽����� �ֳ���?");
		while((msg = in.nextLine()) !=null) {
			if(msg.equals("���־��."))	break;
			out.println(msg);
			System.out.println("���� �޽����� �� �ֳ���?");
		}
		System.out.println("Ŭ���̾�Ʈ ����");
		out.close();
		in.close();
		client.close();
	}
}