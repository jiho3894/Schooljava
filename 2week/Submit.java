package testhava02;

import java.util.Scanner;

public class Submit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �Է��Ͻÿ�:");
		Scanner input = new Scanner(System.in); // new Scanner
		// while���� �̿��� ���� ���� Ȯ��
		while(true) {
			int score = input.nextInt(); 
			// ���� �����ڸ� �̿��� ������ ��� 
			char grade = (score >= 90) ? 'A' : 
				((score >= 80) ? 'B' : 
					((score >= 70) ? 'C' : 
						((score >= 60) ? 'D' : 
							'F')));
			// loop�� �������� Ư�� int �� �Է½� break �ߵ�
			if(score == 0) {
				System.out.println("����");
				break;
			} 
			System.out.println(score + "����" + grade + "����Դϴ�."); 
			System.out.println("������ �Է��Ͻÿ�:");
		}
	} 
}
