package testhava02;

import java.util.Scanner;

public class ConditionOperationEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if(score > 90) {
			System.out.println(score + "����" + "A����Դϴ�.");
		} else if(score > 80) {
			System.out.println(score + "����" + "B����Դϴ�.");
		} else {
			System.out.println(score + "����" + "C����Դϴ�.");
		}
	}
}