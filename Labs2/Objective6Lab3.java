public class Objective6Lab3 {
    public static void main(String[] args) {
        int counter = 1;

        while ( counter <= 20 ){ //end with entry 21

          //counter = counter++;
          if ( counter % 2 == 0 ) {
              System.out.println( counter++ + " is evan");

          }
          if ( counter % 2 >= 0 ) {
              System.out.println( counter++ + " is odd");
          }

        }
          counter++;
    }
}
