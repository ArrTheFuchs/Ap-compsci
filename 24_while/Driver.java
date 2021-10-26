/*
Home-coming -- Ariel Fuchs / Lindsay Phung
APCS
HW 24 -- Get It While You Can
2021-10-26
time spent:

DISCO
- this() is in red
QCC
-
*/

public class Driver {
 /* public String getflipCtr() {
    return Coin.flipCtr;
  }

  public String headsCtr() {
    return headsCtr;
  }

  public String gettailsCtr() {
    return tailsCtr;
  }*/

  public static void main( String[] args ) {
    Coin hello = new Coin (); //This is to start the counter
    while (hello.flipCtr < 66165) {
      hello.flip();
      System.out.println(hello.outflip());
    }
  } //end main()

} //end class
