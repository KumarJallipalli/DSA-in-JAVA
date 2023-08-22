
public class Functions {

    /*
     * This following sum() function will give compilation error.
     * It will say line 12 & 13 are unreachable statements since we have added "return" at line 11
     * So, It will throw error saying "Unreachable statements"
    */
    public static int sum (int a, int b) {
        // return a; //[This is part of actual Question, but commented due for execution purpose]
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {

        /*                              DAY - 07
         * Function: A block of re-usable code, which takes some input, performs specified task on it & returns output.
         * 
         * Syntax:
         * return_type function_name (datatype input_parameter) {
         *      Some piece of code;
         *      which performs a specific task;
         *      return output; 
         * }
         * NOTE: -> when execution reaches return [statement], it exits the function block
         * 
         * Parameters -> inputs given to a function during function defining (or) execution
         *      int countDigits (int N) { } 
         *      Here N is the parameter
         * Arguments -> inputs given to a function during function calling.
         *      countDigits(N);
         *      Here N is the argument.
         * [Type casting also works during parameters & argument passing]
        */

        /*
         * Difference between SOP & return..?
         * - System.out.print → It prints the output to the console window
         * - return → It returns the output to the callee.
        */

        /*
         * ANY Variable cannot be used without assigning/initialization in java. compiler will throw error.
        */

        int a = 12;
        int b = 23;
        int c = sum(a, b);
        System.out.println(c);

        System.out.println(isEven(6));

        /*
         * Pattern: Given N, print the following pattern
         * N =  5
         *      0 0 0 0 5 0 0 0 0
         *      0 0 0 4 8 12 0 0 0
         *      0 0 3 6 9 12 15 0 0
         *      0 2 4 6 8 10 12 14 0
         *      1 2 3 4 5 6 7 8 9
        */

        /*
         * ANS:
         *  Row     0's     Numbers     Count   Diff    0's
         *  1       4       [5, 5]      1       5       4
         *  2       3       [4, 12]     3       4       3
         *  3       2       [3, 15]     5       3       2
         *  4       1       [2, 14]     7       2       1
         *  5       0       [1, 9]      9       1       0
         *  =i      =N-i    =N+1-i      =2*i-1  =N+1-i  =N-i
         */
        int N = 5;
        for (int i=1; i<=N; i++) {
            //spaces
            for (int j=1; j<=N-i; j++) {
                System.out.print("0 ");
            }
            //numbers
            for (int j=1; j<=(2*i-1); j++) {
                System.out.print((N+1-i) + (j-1)*(N+1-i) +" ");
                //(N+1-i) + (j-1)*(N+1-i) == Nth term of AP => Tn = a + (n-1)*d [a=d=N+1-d, n=j]
            }
            // //My code for printing numbers
            // int num = N+1-i;
            // for (int j=1; j<=(2*i-1); j++) {
            //     System.out.print(num + " ");
            //     num += N+1-i;
            // }
            for (int j=1; j<=N-i; j++) {
                System.out.print("0 ");
            }

            System.out.println();
        }

        /*
         * Print the following Pattern
         *  N = 5
         *      *****
         *      *  *
         *      * *
         *      **
         *      *
        */

        /*
         * Ans:
         * Divide the whole pattern into 3 parts
         * Part-1: print all stars
         *      *****
         * Part-2: print the stars with spaces [already done in patterns-2 class Q7]
         *      *  *
         *      * *
         *      **
         * Part-3: print a single star
         *      *
        */

        //part-1
        for (int i=1; i<=N; i++) {
            System.out.print("*");
        }
        System.out.println();
        //part-2 -> Since this is middle part => 2 rows[Top & bottom] to be neglected i.e., why i=3 instead of i=1
        for (int i=3; i<=N; i++) {
            System.out.print("*");
            for (int j=1; j<=N-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println();
        }
        //part-3 
        System.out.println("*");
    }

    /*
     * Unlike the sum() function, the following isEven() fn won't throw error.
     * In sum(), statements are unreachable i.e., why it is throwing error.
     * But here, statements are reachable once if condition fails. i.e., why No Error.
     */
    public static boolean isEven (int n) {
        if (n%2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
     * Quiz-1: What will the output, if we have a statement in main()
     *              add1(2, 3);
    */
    public static int add1(int a, int b) {
        System.out.println(a+b);
        return a+b;
    }
    /*
     * Quiz-2: What will the output, if we have a stement in main()
     *              add2(2, 3);
    */
    public static int add2(int a, int b) {
        return (a+b);
    }
    /*
     * Quiz-3: What will the output, if we have a stement in main()
     *              int a = 15, b = 5;             
     *              System.out.print(add3(a, 10));
    */
    public static int add3(int a, int b) {
        return (a+b);
    }

    //Write a function to print primes till N
    public static void printPrimes (int N) {
        for (int i=1; i<=N; i++) {
            int factors = 1;
            for(int j=1; j<=i; j++) {
                if(i%j == 0) {
                    factors++;
                }
                if(factors > 2) {
                    break;
                }
            }
            if(factors == 2) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
