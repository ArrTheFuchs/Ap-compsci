/* Ariel Fuchs David Chen Jaclyn Chen*/
//APCS
//HW 14f
//10-7-21
/* Discoveries:
You can create a constructor which does not have to be explicitly called.
It automatically works when an object is created.
We used this instead of calling explicilty calling sethelloMsg
Static variables have been removed because they constantly overwritten by the last executed constructor*/

/* unresolved questions: 
None this was a very productive homework */
public class BigSib{
   String helloMsg;

   public BigSib () { 
	helloMsg =""; //this is the constructor
   }


   public BigSib (String b) {
        helloMsg = b; //this is the constructor
   }



   public String greet(String name) {
        String s;

        s = helloMsg + name;
        //+ "\nSalutations Dr. Spaceman"
        //+ "\nHey ya Kong Fooey"
        //s+ "\nSup mom";

        return s;
    } //end of greeting method



 }
