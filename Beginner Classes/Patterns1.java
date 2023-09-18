import java.util.Scanner;

public class Patterns1 {
    public static void main(String[] args) {
        
        /*                              DAY - 05                           
         * Q1: Given T testcases, each testcase contains an integer in the input
         *      For each test case print 1st & last digits
         * 
         *  T testcases: Run the code which works for 1 testcase T times
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your Testcases number");
        int T = scan.nextInt();

        for (int i=0; i<T; i++) {
            int num = scan.nextInt();
            int firstDigit = 0, lastDigit;

            lastDigit = num%10; 

            while (num != 0) {
                firstDigit = num%10;
                num = num/10;
            }

            System.out.println("First & Last Digit's are : " + firstDigit + " & " + lastDigit);
        }

        /*
         * RANGE:
         * Range    [1, N] =>   N   -   i = 1; i <= N
         * Range    [1, N-1] => N-1 -   1 = 1; i < N
         * Range    [0, N-1] => N   -   i = 0; i < N
         * 
         * 
         * Nested Loop -> Loop inside/within another Loop.
        */

        //Q2: Given N, print a square of * of size N [N*N]
        System.out.println("Please Enter a 'Number' to print squared stars");
        int N = scan.nextInt();

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Q3: Given N,M print a rectangle of size N*M
        System.out.println("Please Enter a 'rows' for Q-3 : ");
        N = scan.nextInt();
        System.out.println("Please Enter a 'columns' for Q-3 : ");
        int M = scan.nextInt();

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         * Q4: Given N, print the following pattern
         * N = 3    *               N = 5   *
         *          * *                     * *
         *          * * *                   * * *
         *                                  * * * *
         *                                  * * * * *
        */
        System.out.println("Please Enter a value for 'N' for Q-4 : ");
        N = scan.nextInt();

        for (int i=1; i<=N; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
		 * Q5: reverse of above pattern
		 * N = 3	* * *			N = 5	* * * * *
		 * 			* *						* * * *
		 * 			*						* * *
		 * 									* *
		 * 									*
		*/

        /*
         * ANS:
         *  row col Total   row col Total           ans = Total-row = col [stars]
         *  1   3   4       1   5   6               6 - 1 = 5
         *  2   2   4       2   4   6               6 - 2 = 2
         *  3   1   4       3   3   6               = (N+1) - i
         *          = N+1   4   2   6
         *                  5   1   6
         *                          = N+1
        */
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=(N+1)-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         * Q6: Given N, print the following pattern
         * N = 4    *               N = 6   *
         *          * 2                     * 2
         *          * 2 *                   * 2 *
         *          * 2 * 4                 * 2 * 4
         *                                  * 2 * 4 *
         *                                  * 2 * 4 * 6
        */
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=i; j++) {
                if(j%2 == 1)
                    System.out.print("* ");
                else 
                    System.out.print(j +" ");
            }
            System.out.println();
        }

        //Pattern with "SPACES"

        /*
         * Q7: Given N, print the following pattern [- == 1 space]
         *  N = 3               N = 5
         *      * - - *           * - - - - *
         *      * - - *           * - - - - *
         *      * - - *           * - - - - *
         *                        * - - - - *
         *                        * - - - - *
        */
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N+1; j++) {
                if(j==1 || j==N+1)
                    System.out.print("* ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }
        //Another approach & Optimal one
        for (int i=1; i<=N; i++) {
            System.out.print("* ");
            for (int j=1; j<=N-1; j++) {
                System.out.print("- ");
            }
            System.out.print("* ");

            System.out.println();
        }

        /*
         * Q7: Given N, print the following pattern ['-' == 1 space]
         *  N = 3               N = 5
         *      * - - *           * - - - - *
         *      * - *             * - - - *
         *      * *               * - - *
         *                        * - *
         *                        * *
        */

        //Ans: the only diff between Q7 & Q6 are spaces are decreasing in a pattern [N-i]
        for (int i=1; i<=N; i++) {
            System.out.print("* ");
            for (int j=1; j<=(N-i); j++) {
                System.out.print("- ");
            }
            System.out.print("* ");

            System.out.println();
        }

        /*
         * Q8: Given N, print the following pattern ['-' == 1 space]
         *  N = 3               N = 5
         *      - - *               - - - - *
         *      - * *               - - - * *
         *      * * *               - - * * *
         *                          - * * * *
         *                          * * * * *
        */

        /*
         * N = 5
         *  row     spaces      star
         *  1       4           1
         *  2       3           2
         *  3       2           3
         *  4       1           4
         *  5       0           5
         *          =N-i        =i
         */
        for (int i=1; i<=N; i++) {
            //To print spaces
            for (int j = 1; j<=(N-i); j++) {
                System.out.print("- ");
            }
            //To print stars
            //for (int j=(N-i)+1; j<=N; j++) -> My approach before evaluation of pattern
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
