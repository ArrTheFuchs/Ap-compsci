public class BigSib{
   static String helloMsg;

   public static String greet(String name) {
	String s;

        s = helloMsg + name 
	+ "\nSalutations Dr. Spaceman"
        + "\nHey ya Kong Fooey"
        + "\nSup mom";

	return s;
    } //end of greeting method

    public void setHelloMsg(String s) {
         helloMsg = s;
    }
}
