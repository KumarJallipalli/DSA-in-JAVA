import java.util.Scanner;

public class Practice1To6 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         *              Practice of all lectures from Intermediate Classes 01 to 06
        */


        /*
         * Question-1:
         * Count No. of factors for a number 'N'
         *      - Factor: A number 'x' is said to be factor of 'N', when x divides N 
        */
        System.out.println("No. of Factors = " + countFactorsBrute());
        /*
         * There is an optimal way for finding number of factors
         *  - If " i * j = N ",
         *  - that means, both 'i' & 'j' divides N => both i & j are factors of N
         *      - (j = N/i) & 'i' are both factors
         *      - That means with only N & i we can find both factors of N in one go.
         *  ex:     N = 24      i       (N/i)
         *                      1       24
         *                      2       12
         *                      3       8
         *                      4       6 <--   [Factors started repeating after this point]
         *                      6       4
         *                      8       3
         *                      12      2
         *                      24      1
         *      - If we observe the factors above that mentioned point, 
         *                  i   <= (N/i)
         *                  i^2 <= N
         *                  i   <= sqrt(N)
         *      - That means, if we iterate until sqrt(N), it will give us all the factors of N
         *      - But we need to increase the count by 2 & with some edge cases
         */
    }

    //Brute Force method
    public static int countFactorsBrute () {
        int N = sc.nextInt();
        int count = 0;

        for (int i=1; i<=N; i++) {
            if (N%i == 0)
                count++;
        }

        return count;
    }
    /*
     * TC = O(N)
     * SC = O(1)
    */

    //Optimised code
    public static int countFactorsOptimised () {
        int N = sc.nextInt();
        int count = 0;

        for (int i=1; i<= Math.sqrt(N); i++) {
            if (N%i == 0) {
                if (i == N/i)
                    count++;
                else
                    count += 2;
            }
        }

        return count;
    }
}
