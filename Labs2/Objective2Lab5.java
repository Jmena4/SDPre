public class Objective2Lab5 {
  public static void main( String[] args ) {

    //Scanner keyboard = new Scanner(System.in);

    double side1 = Math.sqrt(8 * 8);  //side1 = 8
    double side2 = Math.sqrt(10 * 10); //side2 = 10
    double hypotenuse = Math.sqrt( (side1 * side1) + (side2 *side2)); 

    System.out.print("The hypotenuse of a triangle with ");
    System.out.print("sides " + side1 + " " );
    System.out.print(" and " + side2 + " is " + hypotenuse + " ");
  }
}
