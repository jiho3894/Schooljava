

import java.util.Scanner;

public class score {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int member = 0;
      int[] scores = null;
      
      Scanner scanner = new Scanner(System.in);
      
      while(true) {
         System.out.println("--------------------------------------------------------");
         System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
         System.out.println("--------------------------------------------------------");
         System.out.print("����>");
         int selectNum = Integer.parseInt(scanner.nextLine());
         
         if(selectNum == 1) {
            System.out.print("�л���>");
            member = Integer.parseInt(scanner.nextLine());
            scores = new int[member];
         }
         
         if(selectNum == 2) {
            for(int i=0; i<scores.length; i++) {
               System.out.println("scores[" + i + "] >" );
               scores[i] = Integer.parseInt(scanner.nextLine());
            }
         }
         
         if(selectNum == 3) {
            for(int i=0; i<scores.length; i++) {
               System.out.println("scores[" + i + "] >" + scores[i]);
            }
         }

         if(selectNum == 4) {
            int max = 0; 
            int sum = 0;
            double avg = 0;
            for(int i=0; i<scores.length; i++) {
               max = (max > scores[i]) ? max : scores[i];
               sum += scores[i];
               avg = (double) sum / member;
            }
            System.out.println("�ְ�����: " + max);
            System.out.println("�������:"+ avg);
         }
         
         if(selectNum == 5) {
            System.out.println("���α׷��� �����մϴ�");
            break;
         }
      }
   }

}