package Beginner_Classes;

public class Intro {
    public static void main(String[] args) {
        /*
         * INTRO:
         * Computers are Dumb/stupid, but are very quick.
         * i.e., why we need to elaborate each & every step to it which it needs to be performed, so that it can perform that task in an un-imaginably faster way.
        */

        /*
         * WKT, switches has 2 states, ON & OFF.
         * Computers has billions of those switches called transistors. That means computer can only understand ON & OFF states of these switches. These are called 0 & 1 in simpler binary terms.
         * So, We need to give all the steps [instructions] which the computer needs to be performed in these combination of 1's & 0's.
         * The set of instructions given to a computer to perform a specific task is called "Program"
         * As these set of instructions are given/written in combinations of 1's & 0's, This is termed as Machine language or Binary language
        */

        /*
         * JAVA is a High Level, Object Oriented, Statistically/Loosely typed programming Language
         * Programming language is the language in whihc the programs are written.
         * 
         * Then, How does the computer understand this java language..?
         * Ans -> It doesn't. There will be a software called "Compiler" which translate the Java's HLL to binary language, which is understandable by computer.
         *      Compiler will also check the syntax errors. As these errors are found during compilation, theya re called "compilation errors"
        */

        /*
         * Comments -> are the like rough work in main notes
         *      Comments are ignored by the compiler
         *      Comments are used for documentation, code readability & easy understanding
         *      Comments are sometimes used for debugging the code
        */

        /*
         * HOW to take input in JAVA..?
         * Scanner class is used to take user inputs in JAVA
         * Scanner is used for taking smaller data as input. While BufferReader is used to take larger size data [like 1000's lines of code] as inputs.
         * But to use Scanner class in java, some steps needs to be followed
         *      1.) Import the Scanner class from java.util library
         *      2.) Build the Scanner & define the Scanner object 
         *      3.) Take the user input using Scanner object.
        */

        /*
         * HOW to display the output in JAVA..?
         * System class is used to display the output on the console.
         *      System.out.print() -> prints the o/p & cursor will be positioned at the end of o/p
         *      SYstem.out.println() -> prints the output * cursor will be positioned at the start of new line
        */

        //" + " operator will execute the code from Left to Right
        System.out.println(10 + 20 + "Hello");
        System.out.println("Hello" + 10 + 20); 

    }
}
