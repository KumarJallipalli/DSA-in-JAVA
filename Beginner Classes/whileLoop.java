import java.util.Scanner;

public class whileLoop {
    
    public static void main(String[] args) {

        /*                              DAY - 03
         *--QUESTION--
         * Given an integer A denoting the amount of units of electricity consumed, you have to calculate the electricity bill (in Rs.) with the help of below charge rates
            For first 50 units Rs. 0.50/unit 
            For next 100 units Rs. 0.75/unit
            For next 100 units Rs. 1.20/unit
            For unit above 250 Rs. 1.50/unit
            An additional surcharge of 20% is added to the bill.

        NOTE: As the electricity bill can have any real value (floating point), you have to tell/print the floor value of the bill.

        Floor value of a floating point is the closest integer less than or equal to that value. For eg, Floor value of 2.91 is 2.

        Problem Constraints
        1 <= A <= 500
        */

        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        float cal = 0;

        if (A <= 50) {
            cal = A*0.5f;
        }
        else if (A <= 150) {
            cal = 50*0.5f + (A-50)*0.75f;
        }
        else if (A <= 250) {
            cal = 50*0.5f + 100*0.75f + (A-150)*1.2f;
        }
        else {
            cal = 50*0.5f + 100*0.75f + 100*1.2f + (A-250)*1.5f;
        }

        //To get the floor value, type casted float to int [we can also use floor method]
        int bill = (int)(1.2f*cal);
        System.out.println(bill);
        // System.out.println((int)1.2f*cal);

        /*
         * Modulus Operator ( % ) → Gives the Reminder
         * Division Operator ( / ) → Gives the Quotient
         * Assignment Operator ( = ) → assigns the RHV to LHV
         * Comparator Operators ( == | != ) → Used to compare LHS & RHS & returns a boolean value
        */

        /*
         * LOOPS: are some statements, used to control the flow of program and to do some repetitive tasks.
         * We have 3 types of loops -> while, for & do-while loops
         * 
         * while loop:
         * - It evaluates the expression inside the parenthesis [which we call it as condition]
         * - If the exp is true, then it goes inside the loop & executes the block of code. And again goes back to the exp to check whether it is true or false.
         * - In this way it will execute the block of code & evaluates the condition/expression.
         * - It goes out of the loop only when the condition fails.
         * - So, to fail the condition & exit the loop, we need an expression which leads to failing the condition inside the while block. We call that exp as incremental/decremental exp.
        */

        /*
         * Steps for while loop:
         *      1.) Initialization -> initialize condition variable [ int i=0]
         *      2.) while loop condition -> write the loop condition [ while (cond) {}]
         *      3.) code block -> write the block of code to be looped [ {write code here}]
         *      4.) incremental/decremental -> Update the condition variable to get out of loop eventually. [ i = i+1 ]
        */

        //Q1: Print 1st n ODD natural numbers
        int n = scan.nextInt();

        //initializing the condition variable
        int i = 1;

        //while condition 
        while (i <= n) {

            //block of code to be looped
            if (i%2 == 1)
                System.out.print(i + " ");;
            i = i+1; //updation of condition variable
        }

        //Q2: print all multiples of 4 less than 50
        i = 4;
        while (i <= 50) {
            System.out.print(i + " ");
            i = i+4;
        }

        //Print all perfect square from 1 -> N
        int N = scan.nextInt();
        i = 1;

        while (i*i <= N) {
            System.out.print(i*i + " ");
            i = i+1;
        }
    }
}
