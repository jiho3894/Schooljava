package testjava01;

import java.util.Scanner;

public class Submit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y ,sum;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		sum = x + y;
		System.out.println("ù��° ��: " + x);
		System.out.println("�ι�° ��: " + y);
		System.out.println("�հ�:" + sum);
		scanner.close();
	}

}