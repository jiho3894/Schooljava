package classTest06;

public class MethodOverloadRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pysical obj;
		obj = new Pysical("��ź��",29,178.2f,75.2f,"bts@nate.com");
		printPysical(obj);
	}
	
	static void printPysical(Pysical obj ){
		System.out.println("�̸�=" + obj.name);
		System.out.println("����=" + obj.age);
		System.out.println("����=" + obj.height);
		System.out.println("����=" + obj.weight);
		System.out.println("�̸���=" + obj.email);
	}

}
