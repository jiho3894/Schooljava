import java.util.Scanner;

public class ProductStock {

		Scanner sc = new Scanner(System.in);	
		String productCode = sc.nextLine();
		int stockNum = sc.nextInt();
		
		// ������ ���� ��Ű�� �ڵ�
		void addStock(int amount) {
			stockNum += amount;
		}
		
		// ������ ���� ��Ű�� �ڵ�
		int substractStock(int amount) {
			// ���ҷ��� ���� �������� ������ 0���� return
			if(stockNum < amount) {
				return 0;
			}
			stockNum -= amount;
			return amount;
		}
	}

