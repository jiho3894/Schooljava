package testjava01;

import java.util.Scanner;

public class Submit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, num, tel;
		Scanner scanner = new Scanner(System.in);
		name = scanner.next();
		num = scanner.next();
		tel = scanner.next();
		
		System.out.println("[�ʼ� ���� �Է�]");
		System.out.println("�̸�: " + name);
		System.out.println("�ֹι�ȣ 6�ڸ� :" + num);
		System.out.println("��ȭ��ȣ :" + tel);
		
		scanner.close();
		
	}

}