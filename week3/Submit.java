package testjava03;

import java.util.Scanner;

public class Submit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.����  |   2.���  |  3.�ܰ�  |  4.����");
			System.out.println("---------------------------------------");
			/*nextLine()�� ������ enter�� �������� �ʾ� �� ����
			 * �Է�ó���� ������ �߻��� �� �־� int �� ���·� ��ȯ���ִ°���
			 * ������ ���*/
			int inputData = Integer.parseInt(scanner.nextLine());
			
			if(inputData == 1) {
				System.out.println("���� > " + inputData + "��");
				System.out.println("���ݾ��� �Է����ּ���.");
				balance += Integer.parseInt(scanner.nextLine());
				System.out.println("���ݾ�: " + balance);
			}
			
			if(inputData == 2) {
				System.out.println("���� > " + inputData + "��");
				System.out.println("��ݾ��� �Է����ּ���.");
				balance -= Integer.parseInt(scanner.nextLine());
				System.out.println("��ݾ�: " + balance);
			}
			
			if(inputData == 3) {
				System.out.println("���� > " + inputData + "��");
				System.out.println(balance);
			}
			
			if(inputData == 4) {
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}
