public class ForString{

    public static void main(String[] args) {
        //Tests for fenceF
        System.out.println("Tests for fenceF():");
        System.out.println(fenceF(0) + "...expecting ");
        System.out.println(fenceF(1) + "...expecting |");
        System.out.println(fenceF(3) + "...expecting |--|--|");
        System.out.println(fenceF(6) + "...expecting |--|--|--|--|--|\n");
        //Tests for reverseF
        System.out.println( "Tests for reverseF():");
        System.out.println( reverseF("A") + "...expecting A");
        System.out.println( reverseF("Ba") + "...expecting aB");
        System.out.println( reverseF("Apple") + "...expecting elppA");
        System.out.println( reverseF("RACecar") + "...expecting raceCAR");
        System.out.println( reverseF("sHE bELIEveD") + "...expecting DevEILEb EHs\n");
        //Tests for reverseR
        System.out.println( "Tests for reverseR():");
        System.out.println( reverseR("A") + "...expecting A");
        System.out.println( reverseR("hey dawg") + "...expecting gwad yeh");
        System.out.println( reverseR("pepsi") + "...expecting ispep");
        System.out.println( reverseR("wsg") + "...expecting gsw");
        System.out.println( reverseR("mi casa") + "...expecting asac im\n");
    }
        public static String fenceF(int a) {
            String result = "|";
            if (a < 1){
                return "";
            }
            for (int b = 1; b < a; b++ ) {
                result = result + "--|";
            }
            return result;
        }

        public static String reverseF(String s){
            String result = "";
            for(int counter = 0; counter < s.length() ; counter++) {
                result = result + s.substring(s.length() - counter -1 , s.length() - counter );
            }
            return result;
    }
        public static String reverseR(String s) {
            //BC
            if (s.length() == 1){
                return s;
            }
            //RR
            return reverseR( s.substring(1) ) + s.substring(0, 1);
        }
}




