import java.util.Scanner;

public class Sequencing {
	public static void main( String[] args ) {
	// FIX IT

	Scanner keyboard = new Scanner(System.in);
	double price, salesTax, total;

	price = 0;
	System.out.print(	"How much is the purchase price? " );
	price = keyboard.nextDouble();

	salesTax = price * 0.0825;
	total = price + salesTax;

	System.out.println( "Sales tax:\t" + salesTax );
	System.out.println( "Total cost:\t" + total );
	System.out.println( "Item price:\t" + price );

	}
}
