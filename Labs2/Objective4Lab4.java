import java.util.Scanner;

public class Objective4Lab4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = 6;
        int userNum;

        System.out.println("Please enter a number: ");
        userNum = keyboard.nextInt();

        userNum = userNum % 2;

        //System.out.println("");
        if ( userNum % 2 == 0 ){
            System.out.println("The number is even ");
        }
        if ( userNum % 2 > 0 ){
            System.out.println("The number is odd ");
        }
        if ( userNum % 2 < 0 ) {
            System.out.println("The number is odd and negative ");
        }
        /*System.out.println("The remaider is equal to: ");
        System.out.println(userNum % 2);*/

        keyboard.close();
    }
}
