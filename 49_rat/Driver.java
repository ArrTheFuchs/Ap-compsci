public class Driver{
 public static void main(String[] args){
		//TESTS TAKEN FROM PIAZZA (WITH MODIFICATOINS)
		//CREDIT TO TGT, TRL, TLL
		//Test1
        //Rational r0 = new Rational(10, 0);
		//System.out.println("\n" + r0);
		//Rational r1 = new Rational(10, 5);
		//Rational r2 = new Rational(3, 6);
		////Test2
        //System.out.println("\nR1:");
        //System.out.println(r1);
		//System.out.println("\nR2:");
        //System.out.println(r2);
		//System.out.println("\nMultiplying r1 by r2 gets you...");
		//r1.multiply(r2);
		//System.out.println(r1);
		//System.out.println("\nDividing that product with r2 gets you...");
		//r1.divide(r2);
		//System.out.println(r1);
		////Test3
		//Rational r3 = new Rational(2, 3);
		//Rational r4 = new Rational();
		//System.out.println("\nR3:");
		//System.out.println(r3);
		//System.out.println("\nR4:");
		//System.out.println(r4);
		//System.out.println("\nMultiplying r3 by r4 gets you...");
		//r3.multiply(r4);
		//System.out.println(r3);
		//System.out.println("\nDividing that product with r4 gets you...");
		//r3.divide(r4);
		//System.out.println(r3);

        //Test 4
        Rational r5 = new Rational(1, 2);
        Rational r6 = new Rational(1, 2);
        System.out.println("R5:\n" + r5);
        System.out.println("R6:\n" + r6);
        r5.add(r6);
        System.out.println(r5);
        r5.subtract(r6);
        System.out.println(r5);

        //Test 5
        Rational r7 = new Rational(3, 6);
        Rational r8 = new Rational(6, 3);
        System.out.println(r7 + "\n"+ r8);
        r7.reduce();
        r8.reduce();
        System.out.println(r7 + "\n"+ r8);

        //Test 6
        System.out.println( r5.compareTo(r6) );
        System.out.println( r7.compareTo(r8) );
        System.out.println( r8.compareTo(r7) );

      } //end of main
}
