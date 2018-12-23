import java.util.Scanner;

public class Objective4Lab3 {
    public static void main (String[] args ) {
          Scanner scanner = new Scanner(System.in);
          int userNum;

          System.out.println("Please enter a number: ");
          userNum = scanner.nextInt();
        //  System.out.println();

          if ( userNum < 0 ) {
              System.out.println("The number is negative ");
          }
          if ( userNum == 0 ) {
              System.out.println("The number has no value ");
          }
          if ( userNum > 0 ) {
              System.out.println("The number is positive");
          }

          scanner.close();
    }
}
