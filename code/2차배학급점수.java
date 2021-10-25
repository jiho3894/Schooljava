package ch01data;

import java.util.Scanner;

/* �������� ���α׷� 
 *  -�б޼�, �� �б��� �л� 
 *  -��� �л��� ������ �о �հ�� ��� ���   */
/*  1. �б޼�, �� �б��� �л� �� (�迭-> 2����), ����  --> Ű���� �Է� 
 *  2. �հ� ��� 
 *  3. ��� ��� 
 *  4. �հ�, ��� ���  
 *  �߰�: �հ�� ����� �б� ������ �������� ������� ���� ��� 
 *  
 *  */ 

public class ScoreEx01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);  /* ������  */

		System.out.println("�б� ���� �Է��ϼ���:");

		int classNum = stdIn.nextInt(); 
		int[][] point = new int[classNum][]; 
		int totNumber = 0;  /* ��� �б��� �� �л� ��   */  

		for(int i=0; i < classNum; i++) {
			System.out.printf("\n %d���� �л����� �Է��ϼ���:", i+1);
			int num = stdIn.nextInt(); /*  �л��� �Է� ó��  */
			point[i] = new int[num]; 
			totNumber = totNumber + num; 
			for(int j=0; j < num; j++){
				System.out.printf("%d�� %d ���� ����: ",  i+1, j+1);
				point[i][j] = stdIn.nextInt(); 
			}
		}

		System.out.println("  ��       |   �հ�           |   ���");
		System.out.println("------ | ---------- | --------");

		int total = 0; 
		for(int i=0; i < classNum; i++) {
			int sum=0; 
			for(int j=0; j < point.length; j++) {
				sum = sum + point[i][j];  
			}
			total = total + sum; 
			System.out.printf("%2d��|%7d    |%7.1f\n", i+1, sum, (double)sum/point[i].length);
		}

		System.out.println("------ | ---------- | --------");
		System.out.printf(" ��   | %7d|%7.1f\n", total, (double)total/totNumber);
	}
}

