/*

*/

public class Rational implements Comparable{

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

    //Previous HW (WOrking Code)
    public int getDenominator(){
        /* return denominator */
      return denominator;
    }

    public int getNumerator(){
        /* return numerator */
        return numerator;
    }
    
    public String toString(){
      /* returns string representation */
      String result = "";
      result += "Numerator: " + Integer.toString(numerator);
      result += "\nDenominator: " + Integer.toString(denominator);
      result += "\n";
      return result;
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

    public int compareTo(Object other){
    	if ( !(other instanceof Rational) ){
		throw new ClassCastException("/n give a rational u noob/n");
	}

	Rational comparant = (Rational) other;

	if (comparant.floatValue() == this.floatValue()){
            return 0;
        }
        else if( comparant.floatValue() > this.floatValue()){
            return -1;
        }
        return 1;
    }

    public void add(Rational addend){
        this.numerator = (this.numerator * addend.denominator) + (addend.numerator * this.denominator);
        this.denominator *= addend.denominator; 
    }
    
    public void subtract(Rational subtractant){
        this.numerator = (this.numerator * subtractant.denominator) - (subtractant.numerator * this.denominator);
        this.denominator *= subtractant.denominator; 
    }
    
    //Static
    public static int gcd(int a, int b){
        int counter;
        if(a>=b){
            counter = b;
        }
        else{
            counter = a;
        }
        while(counter>0){
            if(a%counter==0 && b%counter==0){
                return counter;
            }
            counter--;
        }
        return 0;
    }

    //Instance
    public int gcd(){
        return gcd(numerator, denominator);
    }

    public void reduce(){

        int gcd = this.gcd();
        numerator /= gcd;
        denominator /= gcd;

    }

    public boolean equals( Object other ){
	    if ( !(other instanceof Rational) ){
		    System.out.println("Wrong input type!");
		    return false;
	    }
	    return this.compareTo( (Rational) other ) == 0;
    }
  } //end of class

      
