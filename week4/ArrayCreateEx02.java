package testJava04;

import java.util.Scanner;

public class ArrayCreateEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		// new �����ڸ� �̿��� ���ο� int�� �迭 ���� ���� Ȯ��
		scores = new int[3];
		Scanner scanner = new Scanner(System.in);
		int num;
		double avg;
		
		System.out.println("���� 3���� �Է��ϼ���");
		int sum1 = 0;
		for(int i=0; i<scores.length; i++) {
			// int������ scanner �Ѱ��� num���� ����
			num = scanner.nextInt();
			// for������ scores �迭 length���� �Էµ� �迭�� ����
			scores[i] = num;
			// ������ ���ڵ��� ���Ͽ� sum1�� ����
			sum1 += scores[i];
		}
		// scores length�� �������� avg ��հ����� ����
		avg = sum1 / scores.length;
		System.out.println("����:" + sum1);
		System.out.println("���:" + avg );
		
		
		
		int sum2 = add(new int[] {83,90,87});
		System.out.println("����:" + sum2);
		System.out.println();
	}

		public static int add(int[] scores) {
			int sum = 0;
			for(int i=0; i<3; i++) {
				sum += scores[i];
			}
			return sum;
		}
}
