import java.util.Scanner;

public class Patterns2 {
    public static void main(String[] args) {
        
        /*                                  DAY - 06
         * Q1: Given N, print the following patterns
         *  N = 5                           N = 3
         *      **********                      ******
         *      ****  ****                      **  **
         *      ***    ***                      *    *
         *      **      **          
         *      *        *
        */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        /*We can divide the pattern into 3 triangles: Left star, Right star & middle space triangles
         * N = 5
         *  row     star1   spaces  star2 [right]
         *  1       5       0       5
         *  2       4       2       4
         *  3       3       4       3
         *  4       2       6       2
         *  5       1       8       1
         *       =(N+1)-i   =2(i-1i)   = (N+1)-i
         */
        for (int i=1; i <= N; i++) {
            for (int lStar=1; lStar <= (N+1)-i; lStar++) {
                System.out.print("*");
            }
            for (int spaces=1; spaces <= 2*i-2; spaces++) {
                System.out.print(" ");
            }
            for (int rStar=1; rStar <= (N+1)-i; rStar++) {
                System.out.print("*");
            }

            System.out.println();
        }

        /*
         * Q2: Given N, print the following patterns
         *  N = 5                       N = 3
         *      *        *                  *    *
         *      **      **                  **  **
         *      ***    ***                  ******
         *      ****  ****
         *      **********
        */

        /*We can divide the pattern into 3 triangles: Left star, Right star & middle space triangles
         *  N = 5
         *  row     star1   spaces  star2 [right]
         *  1       1       8       1
         *  2       2       6       2
         *  3       3       4       3
         *  4       4       2       4
         *  5       5       0       5
         *          =i      =2(N-i) =i
         */
        for (int i=1; i<=N; i++) {
            for (int lStar=1; lStar<=i; lStar++) {
                System.out.print("*");
            }
            for (int spaces=1; spaces<=2*(N-i); spaces++) {
                System.out.print(" ");
            }
            for (int rStar=1; rStar<=i; rStar++) {
                System.out.print("*");
            }

            System.out.println();
        }

        /*
         * Q3: Given N, print the following patterns
         *  N = 5               N = 3
         *      *****               ***
         *       ****                **
         *        ***                 *
         *         **
         *          *
        */

        for (int i=1; i<=N; i++) {
            for (int spaces=1; spaces<=i-1; spaces++) {
                System.out.print(" ");
            }
            for (int stars=1; stars<=(N+1)-i; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }

        /*
         * Q4: Given N, print the following patterns
         *  N = 5           N = 3
         *          *             *
         *         **            **
         *        ***           ***
         *       ****
         *      *****
        */

        for (int i=1; i<=N; i++) {
            for (int spaces=1; spaces<=N-i; spaces++) {
                System.out.print(" ");
            }
            for (int stars=1; stars<=i; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }

        /*
         * Q5: Given N, print the following patterns
         *  N = 5               N = 3
         *          *                 *  
         *         ***               ***
         *        *****             *****
         *       *******        
         *      ********* 
        */

        /*  N = 5                         [This RSpaces can be ignored, as there will be empty spaces]
         *  Row    LSpaces     Stars       RSpaces  
         *  1       4           1           4
         *  2       3           3           3
         *  3       2           5           2
         *  4       1           7           1
         *  5       0           9           0
         *          =N-i        =2i-1       =N-i
        */
        for (int i=1; i<=N; i++) {
            for (int lSpaces=1; lSpaces<=N-i; lSpaces++) {
                System.out.print(" ");
            }
            for (int stars=1; stars<=2*i-1; stars++) {
                System.out.print("*");
            }
            //We can omit this for-loop, as there will always be spaces 
            //[This is required when Compiler specificlly asks]
            for (int rSpaces=1; rSpaces<=N-i; rSpaces++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        /*
         * Q6: Given N, print the following pattern
         *  N = 5               N = 3
         *          1                 1
         *         212               212    
         *        34543             34543
         *       4567654
         *      567898765
        */

        /*
         * Ans:
         * We will consider the whole pattern into 3 parts [without the right spaces]
         * ________
         *  |{1} /1|\           {1} -> 1st part => spaces
         *  |   /23|2\          {2} -> 2nd part => 1st /\le [increasing values]
         *  |  /345|43\         {3} -> 3rd part => 2nd /\le [decreasing values]
         *  | /4567|654\        i.e., why we made this into 3 parts, as we have 3 diff patterns
         *  |546789|8765\
         *    {2}    {3}
         *                 N = 5
         *  Row     Spaces      1st /\le [s,e]    2nd /\le [s,e]
         *  1       4           1,  1           -,      -   =>[No value]      
         *  2       3           2,  3           2,      2
         *  3       2           3,  5           4,      3
         *  4       1           4,  7           6,      4
         *  5       0           5,  9           8,      5
         *          =N-i        =i, =2i-1     =2(i-1),  = i
         */
        for (int i=1; i<=N; i++) {
            //To print the spaces [1 -> N-i]
            for (int spaces=1; spaces<=N-i; spaces++ ) {
                System.out.print(" ");
            }
            //To print the "increasing" values of left triangle pattern [i -> 2*i-1]
            for (int leftTri=i; leftTri<=2*i-1; leftTri++) {
                System.out.print(leftTri);
            }
            //To print the "decreasing" values of 2nd Trinagle pattern [2*(i-1) -> i]
            for (int rightTri=2*(i-1); rightTri>=i; rightTri--) {
                System.out.print(rightTri);
            }

            System.out.println();
        }
    }
}
