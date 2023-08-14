//importing the Scanner class
import java.util.Scanner;

public class Day005Beginner1 {
    public static void main (String[] args) {

        /*
         * Flowcharts -> Diagramatic representation of sequence of logical steps of a program.
         *      This helps to visualize & draw solutions for a given problem
        */

        /*
         * How to take input in JAVA..?
         *      We use Scanner class to take input in java, but it follows some steps:
         *          1.) Import the scanner Class
         *          2.) build the scanner class
         *          3.) Use the scanner class 
        */

        /*
         * building the scanner class
         *      Scanner -> Class name
         *      sc -> Object name
         *      new -> is a keyword, whihc allocates memory in RAM
         *      Scanner() -> Constructor 
         *      System.in -> Signifies the input source [i.e., from the keyboard events]
        */
        Scanner sc = new Scanner(System.in);

        //using the scanner class
        String firstWord = sc.next();
        String firstLine = sc.nextLine();

        //If you observe carefully, "2nd statement starts with a space"
        System.out.println(firstWord);
        System.out.print(firstLine);

        //WAP for Adding 3 numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = (a+b+c);

        System.out.println("The Addition of "+ a +" + " + b + " + " + c + " is: "+ sum);
    }
}