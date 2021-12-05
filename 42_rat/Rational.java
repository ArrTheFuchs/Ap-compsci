public class Rational{

    ///Instance Variables
    private int numerator;
    private int denominator;

    ///Constructors
    //Default
    public Rational(){
      numerator = 0;
      denominator = 1;
    }

    //Overloaded
    public Rational(int num, int denom){
      //if 0 is inputted as denom
      if(denom == 0){
        System.out.println("ERROR: INVALID INPUT FOR DENOMINATOR");
        numerator = 0;
        denominator = 1;
      }
      //if not proceed as normal
      else{
          numerator = num;
          denominator = denom;
      }
    }

    ///Methods
    //Accessor Methods

    public int getDenominator(){
      /* return denominator */
      return denominator;
    }

    public int getNumerator(){
      /* return numerator */
      return numerator;
    }

    //Functional Methods
    public String simplify(int num1, int num2){
      int factor = gcd(num1, num2);
      numerator /= factor;
      denominator /= factor;
      return toString();
    }

    //Iterative GCD
   public int gcd( int denominator1, int denominator2) {
       int counter;
       if (denominator1 == denominator2) {
           return denominator2;
       }
       while (denominator1 % denominator2 != 0 || denominator2 % denominator1 != 0) {

           if (denominator1 == denominator2) {
               return denominator2;
           }

           if (denominator1 > denominator2) {
               denominator1 = denominator1 - denominator2;
           } else {
               denominator2 = denominator2 - denominator1;
           }

       }
       return Math.min(denominator1, denominator2);

   }

    public double floatValue(){
      /* return floating point approx. using double */
      return numerator/(double)denominator; //will this do integer division?
    }

    public void multiply(Rational multiple){
      /* multiplies object by the inputted object */
          numerator *= multiple.getNumerator();
      denominator *= multiple.getDenominator();
    }

    public void divide(Rational divisor){
      /* divides this object by the other object */
      //KEEP CHANGE FLIP
      numerator *= divisor.getDenominator();
          denominator *= divisor.getNumerator();
    }

    public void add(Rational sum){

    }


    public String toString(){
      /* returns string representation */
      String result = "";
      result += "Numerator: " + Integer.toString(numerator);
      result += "\nDenominator: " + Integer.toString(denominator);
      result += "\nValue: " + Double.toString( floatValue() );
      return result;
    }
    public static void main(String[] args){
			//TESTS TAKEN FROM PIAZZA (WITH MODIFICATOINS)
			//CREDIT TO TGT, TRL, TLL

			//Test1
      
      Rational r0 = new Rational(10, 0);
			System.out.println("\n" + r0);
			System.out.println("=============");

			Rational r1 = new Rational(10, 5);
			Rational r2 = new Rational(3, 6);

			//Test2
			
      System.out.println("\nR1:");
            System.out.println(r1);
			System.out.println("\nR2:");
            System.out.println(r2);
			System.out.println("\nMultiplying r1 by r2 gets you...");
			r1.multiply(r2);
			System.out.println(r1);
			System.out.println("\nDividing that product with r2 gets you...");
			r1.divide(r2);
			System.out.println(r1);
      
			//Test3
			System.out.println("=============");
			Rational r3 = new Rational(2, 3);
			Rational r4 = new Rational();

			System.out.println("\nR3:");
			System.out.println(r3);
			System.out.println("\nR4:");
			System.out.println(r4);
			System.out.println("\nMultiplying r3 by r4 gets you...");
			r3.multiply(r4);
			System.out.println(r3);
			System.out.println("\nDividing that product with r4 gets you...");
			r3.divide(r4);
			System.out.println(r3);
      } //end of main
  } //end of class

      
