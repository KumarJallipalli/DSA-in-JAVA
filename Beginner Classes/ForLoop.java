import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        /*                              DAY - 04
         * Test Case: Any input given to test the code correctness.
         * DRY Run: Run the code with a test case on/using pen & paper.
         * Infinite loop: A loop which never ends
        */

        Scanner scan = new Scanner(System.in);
        
        //Q1: Given a number, print all the digits
        System.out.println("Enter a number to print it's digits : ");
        int n = scan.nextInt();
        
        //to handle TC, where number = 0
        if (n == 0) {
            System.out.println(0);
        }
        else {
            //to handle -ve numbers
            if (n < 0) {
                n = n*-1;
            }
            //code to print digits
            while (n != 0) {
            System.out.print(n%10 + " ");
            n = n/10;
            }
        }

        //Q2: print sum of the digits of a number
        System.out.println("Enter a number to cal SumOfDigits : ");
        n = scan.nextInt();
        int sum = 0;

        if (n < 0)
            n = n * -1;
        while (n != 0) {
            sum = sum + (n%10);
            n = n/10;
        }
        
        System.out.println(sum);

        /*
         * Q3: Given a number, Reverse it
         * ex:  6123 -> 3216
         *      270 -> 72
         *      100 -> 1
         * Constraints: No -ve numbers
        */
        System.out.println("Enter a number to reverse it : ");
        n = scan.nextInt();
        int reverseNum = 0;

        while (n != 0) {
            reverseNum = reverseNum*10 + n%10;
            n = n/10;
        }

        System.out.println(reverseNum);

        /*
         * Loops -> are the statements used to perform some repetitive tasks by controlling the flow of program.
         * Loops does this repetitive flow control using 3 parameters
            * Initialization -> It is the starting condition of loop
            * Condition -> It is the flow control for repetition of loop
            * Incrementation/Decrementation -> It is for getting out of loop
         * There are 3 types of loops
            * 1. while loop -> Used when we don't know the No. of iterations.
            * 2. for loop -> Used when we know the No. of iterations.
            * 3. do-while loop [Similar to while loop, but executes the code block atleast one time]
        */

        /*
         * FOR Loop:
         * It will have all the 3 exp called initialization, condition & increment/decrement in the same parenthesis.
         * - It will 1st execute the initialization exp, then checks the condition exp, 
         * - if that cond is true then only it will execute the for block of code, 
         * -then it will excute the increment/decrement & then goes to evaluate the condition again. 
         * -This is the flow of for loop
         * - It will exit the loop only when the cond is false.
        */

        /*
         * Fatctors:
         * - A number “ x “ is said to be a factor of N, when x divides N.
         * - ex: N % x == 0
         * - ex: for Number 6, the factors are [ 1, 2, 3, 6 ]
         * - Min factor of N → 1
         * - Max factor of N → N
         * 
         * Prime Numbers:
         * - A number is said to be prime Number, if it has only 2 factors [ 1[min factor] & itself[max factor] ]
         * - ex: 2 → [1, 2] || 3 → [1, 3] || 5 → [1, 5] || 7 → [1, 7] || 23 → [1, 23]
        */

        //Q5: Print all the factors of N that lie in the range [1, N]
        System.out.println("Enter a number to find it's factors : ");
        int N = scan.nextInt();

        for ( int i=1; i<=N; i++) {
            if (N%i == 0) {
                System.out.print(i + " ");
            }
        }

        //Q6: Write code to check if N is prime..?
        System.out.println("Enter a number to check if it's prime..! : ");
        N = scan.nextInt();
        boolean flag = true;

        for (int i=2; i<N; i++) {
            if(N%i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) 
            System.out.println(N + " is a Prime Number");
        else 
            System.out.println(N + " is NOT a Prime Number");
        /*
         * But to execute the above code, we don't know the "break" keyword yet
         * So, We will have to find another way to code
         * As we Know, prime Number has only 2 factors [1 & itself]
         * That means if number of factors == 2 => prime Number
        */

        int factors = 0;
        
        for (int i=1; i<=N; i++) {
            if (N%i == 0) 
                factors++;
        }
        if (factors == 2) 
            System.out.println(N + " is a Prime Number");
        else 
            System.out.println(N + " is NOT a Prime Number");

        // Q7: Will the below code work..?
        // int i = 10;
        // while (i--) {
        //     System.out.print(i + " ");
        // }

        /*
         * Ans:
         *      - No, Java doesn't work like this
         *      - here, java doesn't treats numbers as boolean. 
         *      - It throws error "Tyoe Mismath". So this code doesn't works.
         *      - But the C++ & python works for this code
         */

    }
}
