package testJava04;

public class ArrayCreateEx01 {

	public static void main(String[] args) {
		// int[]  score�� score�ȿ� int�� �迭�� ��� ���� ���� ����
		// int score[5]�� int������ ������� score �迭����
		// index�� 5�� ��ġ�� ã���ִ� ����
		int[] score = {1,2,3,4,5,6};
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += score[i];
		}
		System.out.println(sum);
		System.out.println(score[5]);
	}
		
}
