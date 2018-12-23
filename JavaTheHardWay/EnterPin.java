import java.util.Scanner;

public class EnterPin {
  public static void main( String[] args ){
      Scanner keyboard = new Scanner(System.in);
      int pin, entry;
      String secret = "hunters2", typedPassword;

      pin = 12345;

      System.out.println( "WELCOME TO THE BANK OF JAVA." );
      System.out.println( "ENTER YOUR PASSWORD: ");
      typedPassword = keyboard.next();
      System.out.println( "ENTER YOUR PIN: ");
      entry = keyboard.nextInt();

      while ( ! typedPassword.equals(secret) ) {
          System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
          System.out.println("ENTER YOUR PASSWORD: ");
          typedPassword = keyboard.next();
      }

      while ( entry != pin ){
          System.out.println("\nINCORRECT PIN. TRY AGAIN.");
          System.out.println("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
      }
      System.out.println("\nPASSWORD and PIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
    }
}
