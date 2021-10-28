/*
Triumphant Triumvirate: Salaj Rijal, Ariel Fuchs, Ben Belotser
APCS
HW 26 -- GCD Three Ways -- Creating a gcd method using 3 different approache (brute force, iterative and recursive)
2021-10-27
time spent: .8 hours
DISCO:
-We can use the rule we learned in class to help us on our recursive solution
-We can use a return statement inside a while loop
QCC:
-Is there a better way to find which value is greater?
-Should this work for negative numbers as well? If so, how would we implement that?
-How can we tell java that we are expecting certain preconditions?
-What is the differnce between brute force and iterative? Wouldnt brute force be finding the factors
for each input and putting them in a list, and then searching the array for the largest common value?
ALGO:
*/

public class Stats {
    public static void main(String[] args) { //Tests for Brute Force Method
        System.out.println("Brute Force Tests:");
        System.out.println(gcd(48, 18) + "...expecting 6");
        System.out.println(gcd(48, 48) + "...expecting 48");
        System.out.println(gcd(18, 18) + "...expecting 18");
        System.out.println(gcd(18, 48) + "...expecting 6");

        //Tests for Recursive
        System.out.println("Recursive Tests:");
        System.out.println(gcdER(48, 18) + "...expecting 6");
        System.out.println(gcdER(48, 48) + "...expecting 48");
        System.out.println(gcdER(18, 18) + "...expecting 18");
        System.out.println(gcdER(18, 48) + "...expecting 6");

        //Tests for Iterative
        System.out.println("Iterative Tests");
        System.out.println( gcdEW( 48, 18) + "...expecting 6");
        System.out.println( gcdEW( 48, 48) + "...expecting 48");
        System.out.println( gcdEW( 18, 18) + "...expecting 18");
        System.out.println( gcdEW( 18, 48) + "...expecting 6");
    }

    //Brute Force
    public static int gcd(int a, int b) {
        int result = 0;
        int divider = Math.min(a, b);

        if (a == b) {
            return b;
        } else {
            while (a % divider != 0 || b % divider != 0) {
                divider--;
            }
            return divider;
        }


    }

    //Recursive
    public static int gcdER(int a, int b) {
        if (a == b) {
            return b;
        }
        if (a > b) {
            return gcdER(a - b, b);
        }

        return gcd(a, b - a);

    }

    //Iterative
    public static int gcdEW(int a, int b) {
        int counter;
        if (a == b) {
            return b;
        }
        while (a % b != 0 || b % a != 0) {

            if (a == b) {
                return b;
            }

            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }

        }
        return Math.min(a, b);

    }
}


