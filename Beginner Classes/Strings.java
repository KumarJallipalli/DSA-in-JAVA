import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        /*                          DAY - 012
         * How are the int datatype are stored in char datatype..?
         *  - When we give integers for char datatype, compiler treats those as ASCII values
         *  - So, It converts those ASCII values to the mapped characters & displays those.
        */
        char myChar1 = 92;
        char myChar2 = 63;
        System.out.println(myChar1);
        System.out.println(myChar2);

        /*
         * What is the difference between 123 & “123”..?
         *      - 123 → int ⇒ we can perform mathematical operations
         *      - “123” → String ⇒ we can’t perform the mathematical operations.
        */

        /*
         * String → Sequence of Characters
         *      String values must be surrounded by double quotes
         * 
         * Characters → Characters are any kind of symbols, letters & digits.
         *      - characters in java are stored using “char” data type
         *      - The character must be surrounded by single quotes, like 'A' or 'c’
         *      - Alternatively, you can use ASCII values to display certain characters.
         * 
         * Emoji’s are not characters.
         *      - They are strings mapped to an image in the backend.
        */

        /*
         * Syntax:
         *      - String s = “India” → [’I’, ‘n’, ‘d’, ‘i’, ‘a’]
         *          - Internally, it was stored as an array of characters ⇒ [’I’, ‘n’, ‘d’, ‘i’, ‘a’]
         *      - s.length( ) → gives the size/length of string
         *      - s.charAt( i ) → gives the char at ith index
        */

        /*
         * Q1: Print ASCII values of all characters of a string in different lines
         *  EX: S = "abc"
         *  o/p:    97
         *          98
         *          99 
        */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        for (int i=0; i<s.length(); i++) {
            System.out.println("ASCII value of char '" + s.charAt(i) + "' is : " + (int)s.charAt(i) );
        }

        /*
         * Given a string as input, Count # of Uppercase Char in it.
         * Ex: S = "SkhdaIbdakVS" => 4
        */
        s = sc.next();
        int count = 0;

        for ( int i=0; i<s.length(); i++) {
            // if( s.charAt(i) <= 65 && s.charAt(i) >= 90 )
            if( s.charAt(i) <= 'Z' && s.charAt(i) >= 'A' ) {
                count++;
            }
        }
        System.out.println("# of UpperCase characters in " + s + " are : " + count);

        /*
         * Function to find count of characters in string which are not [A,Z][a,z][0.9]
        */
        System.out.println(countSpecialChars(s));

        /*
         * Function to print STring in reverse.
        */
        System.out.println(s);
        
    }

    public static int countSpecialChars (String s) {
        int count = 0;

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (    !(ch >= 'a' && ch <= 'z') && 
                    !(ch >= 'A' && ch <= 'Z') && 
                    !(ch >= '0' && ch <= '9') 
                ) {
                count++;
            }
        }
        return count;
    }

    //Function to reverse a string
    public static void stringReverse (String s) {
        String ans = "";

        for (int i=0; i<s.length(); i++) {
            ans = s.charAt(i) + ans;
        }
        System.out.println(ans);
        /*
         *                  OR
        */
        for (int i=s.length()-1; i>=0; i--) {
            ans = ans + s.charAt(i);
        }
        System.out.println(ans);
    }
}
