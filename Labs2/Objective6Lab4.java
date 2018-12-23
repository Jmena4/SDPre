public class Objective6Lab4 {

    public static void main( String [] args) {

        int sum = 2;
        int count = 1;

        //sum++ == sum + count++;

        do {

            sum += count++;
            System.out.println( sum++ );

        } while ( count < 20 );
          count++ ;
    }
}
