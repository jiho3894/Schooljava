package testjava03;

import java.util.Scanner;

public class LoginEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("���̵�: ");
		String name = scanner.nextLine();
		
		System.out.println("��й�ȣ: ");
		String strPassword = scanner.nextLine();
		
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("kimjiho")) {
			if(password == 41730015) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����: �н����尡 Ʋ��");
			}
		} else {
			System.out.println("�α��� ����: ���̵� �������� ����");
		}
		
	}

}
