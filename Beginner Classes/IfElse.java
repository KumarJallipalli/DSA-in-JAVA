import java.util.Scanner;

public class IfElse {
    public static void main (String[] args) {

        //                          DAY - 02

        Scanner scan = new Scanner(System.in);        

        /*
         * Integer Overflow:
         *      when the container/bucket is filled with data which is more than the actual container can hold, then overflow happens
         *      In this overflow case, java will give some random value instead of actual values.
         *      We need to understand how this overflow is happening so that we never lose our Imp data when it happens.
        */
        long l = 10000000000l;
        System.out.println((int)l);

        /*
         * Typecasting:
         *      It is the process of converting one data type to other data type.
         *      Ex:It can be seen in line 17 -> where long is converted to int type
        */

        /*
         * Boolean Expression:
         *      The expression which results a boolean value is called Boolean Expression.
        */

        /*
         * Modulus Operator ( % ) -> It is a mathematical operator which gives remainder
         *      a%b -> gives the remiander when a is divided by b.
         *      ex1: 35 % 8 = 3
         *      ex2: -4 % 7 = 0
         * 
         *  Dividend = Divisor * Quotient + Remiander
         *      35 = 8 * (35/8) + (35%8)
         *         = 8 * (4) + (3)
         *         = 32 + 3 = 35
         * 
         *      -4 = 7 * (-4/7) + (-4%7)
         *         = 7 * (0) + (-4)
         *         = 0 + (-4) = -4
         * 
         * NOTE: But remainder is not less than '0', So technically 3 should be ans
         *      but java is not like this & is explained in intermediate module
        */

        //Guess the Output
        String a = scan.next();
        String b = scan.nextLine();

        //Now give input as 
            //Hello
            //Who are u..?
        System.out.println(b);

        /*
         * The above sop statement gives an empty output
         * Why..?
         *      As theere are 2 lines of input, 
         *          1st line has only 1 word which was read by scan.next()
         *          But there is nothing present for nextLine() fn so it takes up the empty string
         *      i.e., why empty output is displayed
         *      If there is " " after Hello word, then that will be printed as output
        */

        /*
         * Int -> primitive data type
         * Integer -> Class [Wrapper Class]
        */

        //How to print a float upto 2 decimal points..?
        System.out.printf("%.2f", 54.36987);

        /*
         * Conditional statements:
         * Conditional statements are used to make decisions based on certain conditions.
         * Most common conditional statements -> if-else statements, switch cases & ternary operator.
         * 
         * if-else condition:
         *      if -> if statement executes it's block of code, when condition is true 
         *      else -> else satement executes it's block of code, when if cond is false or all the previous conditions are false.
         *      else-if -> this statement executes it's block of code, when previous/1st cond is false & it's own cond is true
         *  Note: In if-else-if ladder, if any one condition is met, it will exit the ladder from there itself.
        */

        //Q1: Check if person is eligible to Vote
        System.out.print("Enter your age : ");
        int age = scan.nextInt();

        if(age >= 18) {
            System.out.println("Eligible to Vote");
        }
        else {
            System.out.println("NOT Eligible to Vote");
        }


        //Q2:Given Two numbers, Find the max of them
        System.out.println("Enter your 1st Number : ");
        int x = scan.nextInt();
        System.out.println("Enter your 2nd Number : ");
        int y = scan.nextInt();

        if( x > y) {
            System.out.println(x + " is the maximum of both");
        }
        else if (y > x) {
            System.out.println(y + " is the maximum of the both");
        }
        else {
            System.out.println("Both are equal");
        }


        /* Q3:
         * Read the temp of a person & print if he has fever or not
         *      optimal temp -> [98.2, 98.9] -> Person doesn't have fever
         *      ex1: 105.9 -> person has fever
         *      ex2: 94.2 -> person has a low temp
        */
        System.out.println("Enter your Temperature : ");
        float temp = scan.nextFloat();

        if (temp > 98.9) {
            System.out.println("Person has FEVER");
        }
        else if (temp < 98.2) {
            System.out.println("Person has Low Temp");
        }
        else {
            System.out.println("Person has NO Fever");
        }


        /* Q5:
         * Read the spO2 levels of a person & print if the person's oxygen levels is
         *      Normal - [96 - 100]
         *      Slightly below normal - [90 - 95]
         *      Alarmingly below Normal - [ < 90 ]
        */
        System.out.println("Enter your spO2 number : ");
        int spO2 = scan.nextInt();

        if ( spO2 <= 90) {
            System.out.println("Alarmingly below Normal");
        }
        else if (spO2 <= 95) {
            System.out.println("Slightly below normal");
        }
        else if (spO2 <= 100) {
            System.out.println("Normal");
        }
        else {
            System.out.println("Invalid Number..!, Please enter a number less than 101");
        }


        //Q6: Given a Number, check whether it is Even or Odd
        System.out.println("Enter your integer number : ");
        int z = scan.nextInt();

        if (z%2 == 0) {
            System.out.println(z + " is a EVEN number");
        }
        else {
            System.out.println(z + " is an ODD number");
        }


        /*Q7: [AMAZON]
         * Given a Number, print 
         *      "Fizz" if it is divisible by 3
         *      "Buzz" if it is divisible by 5
         *      "FizzBuzz" if it is divisible by both 3 & 5
        */
        System.out.println("Enetr your Number : ");
        int num = scan.nextInt();

        if (num%15 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (num%5 == 0) {
            System.out.println("Buzz");
        }
        else if (num%3 == 0) {
            System.out.println("Fizz");
        }
        else {
            System.out.println(num);
        }
        
    }
}
