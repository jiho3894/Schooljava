package testJava04;

import java.util.Scanner;

public class Submit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int member = 0; // �ο��� ����
		int[] scores = null; // ���� ����
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------------------");
			System.out.print("����>");
			// ���� ���� print���� string���� �����Ͽ� nextLine�� parseInt �����ִ°� ����
			int selectNum = Integer.parseInt(scanner.nextLine());
			
			// �л����� ���ϴ� selectNum 1��
			if(selectNum == 1) {
				System.out.print("�л���>");
				member = Integer.parseInt(scanner.nextLine());
				// member int���� �迭�� ��� ���� �Է� ���·� ����
				scores = new int[member];
				System.out.println("���� �л����� " + member + "�Դϴ�");
			}
			
			// �л��� ������ �Է��ϴ� selectNum 2��
			if(selectNum == 2) {
				for(int i=0; i<scores.length; i++) {
					// 0���� �����Ͽ� i+1�� �Ͽ� 1��° �л����� �߰� ����
					System.out.println( i+1 +"��°�л� ����");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}
			
			// �л��� ������ Ȯ���ϴ� selectNum 3��
			if(selectNum == 3) {
				for(int i=0; i<scores.length; i++) {
					// 0���� �����Ͽ� i+1�� �Ͽ� 1��° �л����� �߰� ����
					System.out.println(i+1 + "�� �л� ����:" + scores[i]);
				}
			}
			// ������ ���� �������� ��հ��� �˷��ִ� selectNum 4��
			if(selectNum == 4) {
				int max = 0; // �ִ밪 ����
				int sum = 0; // ���� ����
				double avg = 0; // ��� ����
				for(int i=0; i<scores.length; i++) {
					// ���׿����ڸ� �̿��� �������� �ִ밪���� ���� scores�� �ɷ����� �۾�
					max = (max > scores[i]) ? max : scores[i];
					// �������ջ� sum�� ���
					sum += scores[i];
					// sum���� ����� ���� ��հ� ���ϱ�
					avg = (double) sum / member;
				}
				System.out.println("�ְ�����: " + max);
				System.out.println("�������:"+ avg);
			}
			// ���α׷��� �����Ű�� selectNum 5��
			if(selectNum == 5) {
				// break������ �����Ű��
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
		}
	}

}
