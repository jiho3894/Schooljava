public class CalculatorRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCal = new Calculator();
		myCal.powerOn();
		int result1 = myCal.plus(1, 2);
		System.out.println("���ϱ�" + result1);
		double result4 = myCal.min(6, 4);
		System.out.println("����" + result4);
		double result3 = myCal.mul(6, 4);
		System.out.println("���ϱ�" + result3);
		double result2 = myCal.div(5, 3);
		System.out.println("������" + result2);
		double result5 = myCal.sel(5, 3);
		System.out.println("������" + result5);
		myCal.powerOff();	
	}
}

class Calculator {
	void powerOn() {
		System.out.println("������ �ѿ�");
	}
	
	//���ϱ�
	int plus (int x, int y) {
		int result = x + y;
		return result;
	}
	
	//����
	int min (int x, int y) {
		int result = x - y;
		return result;
	}
	
	//���ϱ�
	double mul (int x, int y) {
		double result = (double)x * (double)y;
		return result;
	}
	
	//������
	//Math �Լ��� �̿��ؼ� double�� 100.00�� ������ �Ҽ��� 2�ڸ����� ���
	double div (int x, int y) {
			double result = (double)x / (double)y;
			return Math.round(result * 100) / 100.00;
		}
	
	//������
	double sel (int x, int y) {
		double result = (double)x % (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("������ ����");
	}
}
