public class TC_1 {
    public static void main(String[] args) {
        /*
         *                              Intermediate - 02
        */

        /*
         *  Maths Basics:
         * 
         * Q1.) Sum of 1st N natural numbers..?
         *      ANs = (N * (N+1))/2
         * 
         * Q2.) How many integers are there in the following range
         *          [3, 10]     [4, 8]      [a, b]
         *      Ans:
         *      [3, 10] -> As the braces are square, that means both the numbers are included.
         *                  Hence, 3, 4, 5, 6, 7, 8, 9, 10 -> total = 8
         *      [4, 8] -> 4, 5, 6, 7, 8 -> Total = 5
         * 
         * NOTE: So, # of integers in the range [a, b] = ( b-a+1 )
         * 
         *  Geometric Progression: When we divide any 2 consequtive numbers, result must be same.
         *  - So, to get the general terms of G.P, we take 1st term as "a",
         *  - As the common ratio is same for each term, we multiply 1st term with common ratio "r" & so on..
         *      -G.P series -> [ a, ar, ar^2, ar^3 .... ar^(n-3), ar^(n-2), ar^(n-1) ]
         *          - 1st term = a
         *          - common ratio = r
         *          - nth term = ar^(n-1)
         * 
         *  - Sum of 1st N terms of G.P..?
         *  - Let the Sum be "S"
         *          S = a + ar + ar^2 + ar^3 .... ar^(n-3) + ar^(n-2) + ar^(n-1)
         *  - multiply with "r" on both sides
         *          r*S = ar + ar^2 + ar^3 .... ar^(n-2) + ar^(n-1) + ar^(n)
         *  - Now subtract both:
         *          r*S = ar + ar^2 + ar^3 .... ar^(n-2) + ar^(n-1) + ar^(n)
         *          - S = a + ar + ar^2 + ar^3 .... ar^(n-3) + ar^(n-2) + ar^(n-1)
         *          --------------------------------------------------------------
         *          r*S - S = ar^(n) - a
         *          => S(r-1) = a(r^n - 1)
         *          => S = a(r^n - 1)/(r-1)
         * 
         *  - Therfore, Sum of 1st N terms of G.P = a(r^n - 1)/(r-1)
        */
    }

    /*
     * Calculate how many iterations will be performed in each of the following functions..?
    */
    void func1 (int N) {
        int S = 0;
        for (int i=0; i<=100; i++) {
            S = S + i;
        }
    }
    // # of iterations for the above function will be [100 -0 + 1] = "101"


    void func2 (int N) {
        int S = 0;
        for (int i=35; i<=87; i++) {
            S = S + i;
        }
    }
    // # of iterations = [87 - 35 + 1] = 53


    void func3 (int N) {
        int S = 0;
        for (int i=1; i<=N; i++) {
            S = S + i;
        }
    }
    // # of iterations = [N - 1 + 1] = N


    void func4 (int N, int M) {
        int S = 0;
        for (int i=1; i<=N; i++) {
            if (i%2 == 0){
                S = S + i;
            }
        }

        for (int i=1; i<=M; i++) {
            if (i%2 == 1){
                S = S + i;
            }
        }
    }
    /*
     * # of iterations for 1st loop = [N - 1 + 1] = N
     * # of iterations for 2nd loop = [M - 1 + 1] = M
     * Total # of iterations = N + M
    */


    void func5 (int N) {
        int S = 0;
        for (int i=1; i*i<=N; i++) {
            S = S + i;
        }
    }
    /*
     * the condition here is 
     *          i*i <= N
     *          i^2 <= N
     *          i <= sqrt(N)
     * 
     * Now, the problem becomes " for (int i=1; i <= sqrt(N); i++) "
     * So, # of iterations = [sqrt(N) -1 + 1] 
     *                     = sqrt(N) iterations
    */


    void funct6 (int N) {
        int i = N;
        while (i > 1) {
            i = i/2;
        }
    }
    /*
     *  Here, for each iteration i becomes i/2, So let's dry run
     *      N       i
     *      10      10 -> 5 -> 2 -> 1 [Breaks]
     *      19      19 -> 9 -> 4 -> 2 -> 1 [Breaks]
     * - That means, when i == 1, loop breaks. Let's generalize this
     *      iterations      i              Observation
     *          1           N/2             = N/(2^1)       [Here, Value of i is not the start of every iteration]  
     *          2           (N/2)/2 = N/4   = N/(2^2)       [But value at the end of each iteration]
     *          3           (N/4)/2 = N/8   = N/(2^3)
     *          4           (N/8)/2 = N/16  = N/(2^4)
     *          .           .
     *          .           .   
     *          k           N/(2^k)     => i = N/(2^k)
     * 
     * - That means, for "k" iterations, i = N/(2^k)
     * - WKT, At i == 1, loop breaks && let's say it happens after y iterations
     *          => i = N/(2^k)
     *          => 1 = N/(2^y)
     *          => 2^y = N
     *          => y = log(N) [base 2]
     * 
     * - That means, after log(N) iterations loop breaks
     * - Therefore # of iteartions = log(N) [base2]
     * 
     * NOTE: if i = i/3 => # of iterations - log(N) [base3]
    */


    void funct7 (int N) {
        int i = N;
        while (i > 0) {
            i = i/2;
        }
    }
    /*
     * It is similar to above Q, but now condition changed from i>1 to i>0
     * WKT, for i = i/2, it will run another one more iteration, which is very less compared to log terminology
     * So, Ans is still = log(N) [base2] iterations
    */


    void func8 (int N) {
        int S = 0;
        for (int i=0; i<=N; i=i*2) {
            S = S + i;
        }
    }
    /*
     * Here, for each iteration i becomes i*2, but there is a catch here So, let's DRY run
     *      iterations      N       i
     *          1           10      0
     *          2           10      0*2 = 0
     *          3           10      0*2 = 0
     *          4           10      0
     * 
     * - That means 0 <= N && the loop never breaks, it will run infinitely
     * - So, when loop runs infinitely, JVM will throw TEE [Time Exceeding Error]
     *      - To keep the computer resources under check & optimal purpose
     *      - JVM will give only give some allocated time for program to run, if the program still takes more time
     *      - JVM will stop the program abruptly & throw TEE
     *      - So that the resource uasge by program will be stopped & is used by other programs or applications
    */


    void func9 (int N) {
        int S = 0;
        for (int i=1; i<=N; i=i*2) {
            S = S + i;
        }
    }
    /*
     *      Iteration       i       observation
     *          1           2           2^1         [Here, Value of i is not the start of every iteration]
     *          2           4           2^2         [But value at the end of each iteration]
     *          3           8           2^3
     *          4           16          2^4
     *          5           32          2^5
     *          .           .
     *          .           .
     *          k           2^k     => i = 2^k
     * 
     * - Let's say after "k" iteartions, value of i will be i >= N.
     * - That means, it will break the loop. i.e., after "k" iterations loop breaks
     *              i > N      && WKT i = 2^k at kth iteration
     *              2^k > N
     *              k > log(N) [base2]
     * 
     * - i.e., it will take log(N)+1 iterations to break the loop
     * - Ans = log(N)+1 [base2] ~ log(N) [As N is V.V.V.Large Number]
     * 
     * - NOTE: if i = i*3 => # of iterations - log(N) [base3]
    */


    void func10 (int N) {
        for (int i=1; i<=4; i=i+1) {
            for (int j=1; j<=3; j++) {
                System.out.println("Hello World");
            }
        }
    }
    /*
     *      i       j       Total iterations
     *      1    [1 -> 3]       3
     *      2       3          [3+3] = 6
     *      3       3          [6+3] = 9
     *      4       3          [9+3] = 12
     *      5 [breaks]   
     *    
     * - Ans = 12 iterations
     * - Observation: for each iteartion of "i", j will run 3 times.
     *                As i itself will run for 4 times, So 4*3 = 12
    */


    void func11 (int N) {
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=N; j++) {
                System.out.println("Hello World");
            }
        }
    }
    /*
     * - It is similar to above Question,
     * - for each iteartion of "i", j will run N times.
     * - As "i" will run for 10 times, So Ans = 10*N = 10N iterations
    */


    void func12 (int N) {
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                System.out.println("Hello World");
            }
        }
    }
    /*
     *      i       j       Total iterations    observation
     *      1    [1 -> N]       N                   N
     *      2       N          [N+N] = 2N           N+N [2 times]
     *      3       N          [2N+N] = 3N          N+N+N   [3 times]
     *      4       N          [3N+N] = 4N          N+N+N+N [4 times]
     *      .       .           .
     *      .       .           .
     *      N       N           N+N+N ... [N times] = N*N
     * 
     * - It is similar to above,
     * - for each iteartion of "i", j will run N times.
     * - As "i" will run for N times, So Ans = N*N = N^2 iterations
    */


    void func13 (int N) {
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=i; j++) {
                System.out.println("Hello World");
            }
        }
    }
    /*
     *      i       j       Total iterations    observation
     *      1       1           1                   1
     *      2       2          [1+2] = 3            1+2
     *      3       3          [3+3] = 6            1+2+3
     *      4       3          [6+4] = 10           1+2+3+4
     *      .       .           .
     *      .       .           .
     *      N       N           1+2+3 ... + N = [N*(N+1)]/2
     *
     * - # of iteartions =  [N*(N+1)]/2
    */


    void func14 (int N) {
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N; j=j*2) {
                System.out.println("Hello World");
            }
        }
    }
    /*
     *      i       j       j's Iterations      Total Iterations
     *      1    [1 -> N]        log(N)             log(N)
     *      2    [1 -> N]        log(N)             2log(N)
     *      3    [1 -> N]        log(N)             3log(N)
     *      4    [1 -> N]        log(N)             4log(N)   
     *      .       .               .                   .
     *      .       .               .                   .
     *      N    [1 -> N]        log(N)             Nlog(N)
     * 
     * - # of iteartions =  Nlog(N)
    */


    void func15 (int N) {
        for (int i=1; i<=(2^N); i++) {
            System.out.println("Hello");
        }
    }
    /*
     * - # of iterations = [1, 2^N] == (2^N)-1+1 == 2^N iterations 
    */


    void func16 (int N) {
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=(2^i); j++) {
                System.out.println("Hello World");
            }
        }
    }
    /*
     *      i       j       j's Iterations  Total-Iterations    Observation
     *      1    [1 -> 2]       2               2               2^1
     *      2    [1 -> 4]       4               2+4             2^1 + 2^2
     *      3    [1 -> 8]       8               2+4+8           2^1 + 2^2 + 2^3
     *      .       .           .               .
     *      .       .           .               .
     *      N    [1 -> 2^N]     2^N             2+4+8 ... 2^N [in G.P.]
     *  
     *  - Sum of 1st N-terms of G.P = a(r^n - 1)/(r-1)
     *                              = 2(2^N - 1)/(2-1)
     *                              = 2(2^N - 1) iterations 
    */


    void func17 (int N) {
        for (int i=N; i>0; i=i/2) {
            for (int j=1; j<=i); j++) {
                System.out.println("Hello World");
            }
        }
    }
    /*
     *      i       j       j's Iterations      Total-Iterations
     *      N     [1 -> N]      N                   N
     *      N/2   [1 -> N/2]    N/2                 N+(N/2)
     *      N/4   [1 -> N/4]    N/4                 N+(N/2)+(N/4)
     *      N/8   [1 -> N/8]    N/8                 N+(N/2)+(N/4)+(N/8)
     *      .       .           .                   .
     *      .       .           .                   .
     *    1og(N) [1 -> log(N)]  log(N)              N+(N/2^1)+(N/2^2)+(N/2^3) ... [log(N) times/terms] 
     * 
     *  - Sum of 1st N-terms of G.P = a(r^n - 1)/(r-1)
     *                              = N(2^log(N) - 1)/(2-1)
     *                              = 2(2^N - 1) iterations     
     */


    void func111 (int N) {
        for (int i=1; i<=N; i=i*2) {
            for (int j=1; j<=3; j++) {
                System.out.println("Hello World");
            }
        }
    }
    /*
     * for each iteration of "i" Inner loop [i.e., j] will run 3 times
     * And i will run for log(N) [base2] times
     * So, Total iterations = log(N)*3 = 3log(N) 
    */
}
