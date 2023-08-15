import java.util.Scanner;

public class FizzBuzzChallenge {
    /*
     * WAP to take a number as input & print the numbers upto that input taken number in such a way that
     *      multiples of 3 should print "Fizz" instead of that num
     *      multiples of 5 should print "Buzz" instead of that num
     *      multiples of both 3 & 5 should print "FizzBuzz" instead of that num
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {
            if( i%3 == 0 && i%5 == 0) { // ( i%15 == 0 ) -> also works
                System.out.print("FizzBuzz ");
            }
            else if (i%3 == 0) {
                System.out.print("Fizz ");
            }
            else if (i%5 == 0) {
                System.out.print("Buzz ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }

    /*
     * SUMMARY:
     *      Order of the conditional Statements is also V.IMP
     *      If we put the qst stement at last position, then it will fail for N=15
    */
}
