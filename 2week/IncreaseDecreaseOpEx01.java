package testhava02;

public class IncreaseDecreaseOpEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------------");
		x++; // 1����
		++x; // 1����
		System.out.println("x: " + x );           // x = 12 
		
		System.out.println("----------------------");
		y--; // 1����
		--y; // 1����
		System.out.println("y: " + y );           // y = 8
		
		System.out.println("----------------------");
		z=x++;  // ���� ���� �� z = 12
		System.out.println("z:" + z);      // z = 12
		System.out.println("x:" + x);      // x�� ���� ���� x = 13
		
		System.out.println("----------------------");
		z=++x; // ���� ���� �� z = 14
		System.out.println("z:" + z);  // z = 14
		System.out.println("x:" + x);   // x�� ���� ���� x = 14
		
		System.out.println("----------------------");
		z= ++x + y++;
		// x�� ���� �� ���� x = 15 , y�� ���� �� ���� y = 8
		// z = 23
		System.out.println("z:" + z);   // z = 23
		System.out.println("x:" + x);  // �̹� ���� x =15
		System.out.println("y:" + x);  // ���� ���� y = 9
	}

}
