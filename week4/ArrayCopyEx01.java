package testJava04;

public class ArrayCopyEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
//		for(int i=0; i<oldIntArray.length; i++) {
//			newIntArray[i] = oldIntArray[i];
//		}
		
		//arraycopy �Լ� oldIntArray 0 ��°���� length���� �����Ͽ�
		// newIntArray 0��°�� �������� ������ �ٿ��ֱ�
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ".");
		}
	}

}
