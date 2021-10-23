package week7;

abstract class Shape {
	public abstract void draw();
	public abstract void delete();
}

class Circle extends Shape {
	public void draw() {
		System.out.println("���� �׸��ϴ�.");
	}
	public void delete() {
		System.out.println("���� �����մϴ�.");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("�ﰢ���� �ϳ�,��,�� �׸��ϴ�.");
	}
	public void delete() {
		System.out.println("�ﰢ���� �����մϴ�.");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("�簢���� �ϳ�,��,��,�� �׸��ϴ�.");
	}
	public void delete() {
		System.out.println("�簢���� �����մϴ�.");
	}
}