import java.util.*;
public class Account {
		Scanner sc = new Scanner(System.in);
		String accountNo = sc.next();
		String ownerName = sc.next();
		int balance = sc.nextInt();

		// �Ա�
		void deposit(int amount) { /* return ���� ������ ǥ��: void*/
			balance = balance + amount; /*"�����Ѵ�" ����� �����ϴ� �޼��� ����*/
		}
		// ���
		int withdraw(int amount) {
			if(balance < amount) {
				return 0;
			}
			balance = balance - amount;
			return amount;
		}
}
