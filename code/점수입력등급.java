package testhava02;
import java.util.Scanner;

public class Submit {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); // new Scanner
      System.out.println("������ �Է��ϼ���:");
      // while���� �̿��� ���� ���� Ȯ��
      while(true) {
         String finish = input.nextLine();
         if(finish.equals("q")) {
            System.out.println("����");
            break;
      } 
      // string to int parse
      int score = Integer.parseInt(finish);
      // ���׿����ڷ� ������ ��� ǥ��
      char grade = (score >= 90) ? 'A' : 
         ((score >= 80) ? 'B' : 
            ((score >= 70) ? 'C' : 
               ((score >= 60) ? 'D' : 
                  'F')));
      System.out.println(score + "����" + grade + "����Դϴ�."); 
      System.out.println("����� q�� �Է����ּ���");
      System.out.println("���� �Է� : "); 
      } 
   }
}