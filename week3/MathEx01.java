package testjava03;

import java.util.Scanner;

public class MathEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է��Ͻÿ�.");
		int i = keyboard.nextInt();
		int j = keyboard.nextInt();
		System.out.println("�� ���� ����: " + (i * j));
		
		System.out.println("�� ���� �Ǽ��� �Է��Ͻÿ�.");
		double x = keyboard.nextDouble();
		double y = keyboard.nextDouble();
		System.out.println("�� ���� ����: " + (x + y));
		
		System.out.println("�� ���� �ܾ �Է��Ͻÿ�.");
		String str1 = keyboard.next();
		String str2 = keyboard.next();
		System.out.println(str1 + " ���� " + str2);
		
	}

}
