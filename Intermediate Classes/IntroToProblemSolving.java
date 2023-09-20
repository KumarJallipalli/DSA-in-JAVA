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
}