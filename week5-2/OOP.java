/*  �迭�� �����͸� �߰� �����ϴ� ���α׷� �ϼ� -- �迭�� ��� ����   */ 

import java.util.Scanner;

/*  ������ ���� ���α׷� 
 * 1. �迭�� �̿� --> 1���� �迭 
 * 2. ���� ������ �Է� --> Ű���� �Է� 
 * 3. �Է� �޾Ƽ� ����� ������� ��� 
 * 4. ���ο� ���� �߰� ���� (������ ����) */ 

public class OOP {    /*  �߰� �����͸� �����ϴ� �޼��� ����  */ 
	static void aryIns(int[] a, int idx, int x) {

	}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�迭�� ��� ���� �Է��ϼ���:");
		int num = stdIn.nextInt(); 
		int[] a = new int[num]; /* ������ �ڷ����� ������ �迭�� �ϳ� 
		 ���� �� �迭�� a �迭�� ����  */

		for(int i=0; i<num; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = stdIn.nextInt(); 
		}
		System.out.print("������ �迭 ����� �ε����� �Է��ϼ���");
		int idx = stdIn.nextInt(); 
		System.out.print("������ �����͸� �Է��ϼ���");
		int n = stdIn.nextInt(); 

		aryIns(a, idx, n);  /* �迭 a���� a[idx]�� n�� ����  */ 
              /*  �߰��� ���� �� ������ ��� ���� �ϼ�  */
		System.out.println("a["+idx+"] : " + n );
	}
}

