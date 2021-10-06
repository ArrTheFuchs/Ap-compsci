/* Ariel Fuchs */
//Hw #12 
/* Discoveries: 
System.out.println() serves as a display function to create dots
printing nothing in the main() method will print nothing
A java file does not need a main methiod */

/*unresolved questions
How is it possible to call a class/method from a different file */
public class Greet {
    public static void main( String[] args ) {
      String greeting;
  
      BigSib richard = new BigSib();
      richard.setHelloMsg("Word up ");
  
      greeting = richard.greet("freshman");
      System.out.println(greeting);
    } //end main()
  } //end Greet
