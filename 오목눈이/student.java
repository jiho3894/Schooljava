import java.util.Scanner;

public class student {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      while(true) {
         System.out.println("������ ���ڷ� �Է��Ͻÿ�: ");
         
         char grade = input.next().charAt(0);
         double gPoints = 0;
         
         switch(grade) {												//������ ���� ����//
               case 'A': case 'a':
                  gPoints = 4.0;
                  break;
               case 'B': case 'b':
                  gPoints = 3.0;
                  break;
               case 'C': case 'c':
                  gPoints = 2.0;
                  break;
               case 'D': case 'd':
                  gPoints = 1.0;
                  break;
               case 'F': case 'f':
                  gPoints = 0.0;
                  break;
               default:
                  System.out.println("������ �ٽ� �Է��Ͻÿ�.");				
         }
         System.out.println("���� = " + gPoints);			
         System.out.println("���α׷� ���(y), ����(q �Է�)");					
         Scanner inputStop = new Scanner(System.in);
         char stop = inputStop.next().charAt(0);
         if(stop == 'q') {
            System.out.println("���α׷� �����Դϴ�.");
            break;
         }
      }
   }
}