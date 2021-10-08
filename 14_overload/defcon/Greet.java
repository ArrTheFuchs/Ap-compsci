public class Greet {
   public static void main (String [] args ) {
        String greeting;
        BigSib richard = new BigSib();
        BigSib grizz = new BigSib();
        BigSib dotcom = new BigSib();
        BigSib tracy = new BigSib();
        greeting = richard.greet ("freshman ");
        System.out.println(greeting);
        greeting = tracy.greet ("Dr. Spaceman ");
        System.out.println(greeting);
        greeting = grizz.greet("Kong Fooey");
        System.out.println(greeting);
        greeting = dotcom.greet("mom ");
        System.out.println(greeting);

        }
}
