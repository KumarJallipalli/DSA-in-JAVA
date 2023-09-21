public class IntroToProblemSolving {
    public static void main(String[] args) {
        
        /*
         *                              Intermediate-01
        */

        /*
         * Let’s say if    “ i * j = N “
         * - Then we can say that “ i “ & “ j “ are factors of “ N “.
         *          =>   i * j = N
         *               j = N / i
         *             ~ i * N/i = N
         * 
         * - That means, both " i " & ( N / i) are factors of " N "
         * - ex:    N = 24                          N = 100
         *          i       N/i                     i       N/i
         *          1       24                      1       100
         *          2       12                      2       50
         *          3       8                       5       20
         *          4       6  <--                  10      10  <--
         *          6       4                       20      5
         *          8       3                       50      2
         *          12      2                       100     1
         *          24      1
         * 
         * - If we closely observe above, the factors are repeating themselves after the pointed arrow.
         * - So, At what point the factors are repeating themselves..?
         *          - if we closely observe the factors again, Before repeatition,
         *          -                   i <= N/i    [ i<N/i for N=24 && i==N/i for N=100 ]
         *          -                   i*i <= N
         *          -                   i^2 <= N
         *          -                   i <= sq.rt(N)
         *          - From this point the factors are repeating themselves
         * 
         * - So, that means we don't need to calculatate all the factors of N, but only until i <= sqrt(N)
         * - ex:    N = 36 [ i <= sqrt(36) => i <= 6 ]
         *          i       N/i
         *          1       36
         *          2       18
         *          3       12
         *          4       9
         *          6       6   [ stop here, cuz after this factors repeats ]
         * 
         * - Now # of factors = 5*2 = 10
         *          - i.e., when i divides N, we increase the count by 2 [Since i & N/i both are factors].
         *          - But this is also wrong, as 6 is counted 2 times.
         *          - i.e., when i == N/i also we are increasing by 2, But we should only increase by 1.
         * 
         * - Let's write code for this
        */

        System.out.println(countFactors(12));

        /*
         * Q. Cal sum of numbers from 1 to 100 without calculator
         * Ans: Let the sum be S
         *      s = 1 + 2 + 3 + 4 ...... 98 + 99 + 100
         *      s = 100 + 99 + 98 ..........3 + 2 + 1
         *      --------------------------------------
         *      2s = 101 + 101 + 101 ...... 101 + 101
         *         = 101 * 100
         *      s  = (100 * 101)/2
         *         = (N * N+1) / 2
         * 
         * Similarly, sum of 1st N naural numbers will be
         *      S = 1 + 2 + 3 ..... N-2 + N-1 + N
         *      S = N + N-1 + N-2 .... 3 + 2 + 1
         *      ---------------------------------
         *      2S = N+1 + N+1 + N+1 .... N+1 + N+1
         *         = (N+1) * N 
         *      S = (N * (N+1))/2
        */

        //Q. Give N a Perfect Square, Cal square root of N

        /*
         * Q. Cal the sqrt(N), but now N may not be a Perfect Square.
         *      - If N is not a perfect square, then return floor of sqrt(N)
         *      - N = 49 -> Ans = 7
         *      - N = 60 -> Ans = 7
         *      - N = 31 -> Ans = 5
         *      - N = 37 -> Ans = 5
         * 
         * NOTE: floor of a number will always return/give integer part of the number
         *      - ex:   8.678 -> 8
         *      -       6.000 -> 6
         *      -       5.123 -> 5
         *      -       7     -> 7  
        */

    }

    static int countFactors (int N) {
        int count = 0;
        for (int i=1; i<=N; i++) {
            if (N%i == 0) {
                count++;
            }
        }

        return count;
    }

    /*
     * STANDARD -> Any computer performs 10^8 iterations per second
     * 
     * - Then the above function block will perform 
     *          Input       Iterations
     *          12          12
     *          100         100
     *          N           N
     * 
     * - Then the execution time according to set standard will be
     *          Input       Iterations      Execution-Time [sec]
     *          10^8        10^8            1           [So, if website uses this logic, user needs to wait for 1 sec]
     *          10^9        10^9            10          [That means, it will takes 10 sec to give the ans by website]
     *          10^18       10^18           10^10       [ ~ 317 years, user needs to wait for 317 years to get sol ]
    */

    public static int countFactorsOptimised (int N) {
        int count = 0;
        for (int i=1; i<=Math.sqrt(N); i++) {
            if (i == N/i)
                count++;
            else    
                count += 2;
        }

        return count;
    }

    /*
     * Let's calculate the execution time for this optimised code as per standard
     *          Input       Iterations          Execution-Time
     *          16          4               
     *          100         10                  1/(10^7)
     *          10^18       sqrt(10^18) = 10^9  10 sec      => V.V.V.Less time considering 317 years
    */

    //Function to cal sqrt of N
    public static int sqrtN (int N) {
        for (int i=1; i<=N; i++) {
            if (i*i == N)
                return i;
        }
        return -1;
    }

    /*
     * What will ne the number of iterations for the above code
     *      a.) N           b.) N/2
     *      c.) logN        d.)sqrt(N)
     * 
     * Ans: N = 36  || i = 1, 2, 3, 4, 5, 6 [returns] => 6 iterations
     *      N = 81  || i = 1, 2, 3, 4, 5, 6, 7, 8, 9 [returns] => 9 iterations
     *      N = 25  || i = 1, 2, 3, 4, 5 [returns] => 5 iterations
     * 
     * - If we closely observe above, 6, 9 & 5 are sqrt of 36, 81 & 25 respectively.
     * - So, No matters what, if a number is perfect sqaure then the loop runs for sqrt(N) iterations only.
     * - So, Ans = d
    */


    /*
     * Q. Cal the sqrt(N), but now N may not be a Perfect Square.
     *      - If N is not a perfect square, then return floor of sqrt(N)
     *      - N = 49 -> Ans = 7
     *      - N = 60 -> Ans = 7
     *      - N = 31 -> Ans = 5
     *      - N = 37 -> Ans = 5
     * 
     * NOTE: floor of a number will always return/give integer part of the number
     *      - ex:   8.678 -> 8
     *      -       6.000 -> 6
     *      -       5.123 -> 5
     *      -       7     -> 7  
    */

    /*
     * Ans:
     * - We need to find the sqrt(N), If it not a perfect sq then return the floor value
     * - ex: N = 60 -> Ans = 7.74596669241 => floor (7.74596669241) = 7
     *       N = 35 -> Ans = 5.9160797831  => floor (5.9160797831) = 5
     * 
     * Let's take both numbers and evaluate
     *          N = 60
     *      i   i*i     ans
     *      1   1       1   [Let's consider 1 as ans, as we don't know that next iteration will be > 60]
     *      2   4       2   [now, update the ans = 2, since i*i < 60. And there could be better ans than 2]
     *      3   9       3   [update the ans = 3]
     *      4   16      4
     *      5   25      5
     *      6   36      6
     *      7   49      7   [update ans = 7]
     *      8   64    break   [as i*i > 60, So there won't be a better ans than 7 & we will break loop here]
     * - In this way we will get the floor of value at the same time
    */
    //using for-loop
    public static int floorSqrtN (int N) {
        int ans = 1;
        for (int i=1; i<=N; i++) {
            if (i*i <= N)
                ans = i;
            else
                break;
        }
        return ans;
    }

    //same fn using while-loop
    public static int floorSqrtn (int N) {
        int i = 1, ans = 1;
        while (i*i <= N) {
            ans = i;
            i++;
        }
        return ans;
    }
    
    //optimised for-loop code after observing while-loop
    public static int floorSqrtNOptimised (int N) {
        int ans = 1;
        for (int i=1; i*i <= N; i++) {
            ans = i;
        }
        return ans;
    }

    /*
     * - Number of iterations for the above code will be = sqrt (N)
     * - But this is not the optimal one
     * - The optimal one is # of iterations = logN
     * - This will be taught in Advanced Classes
     */
}