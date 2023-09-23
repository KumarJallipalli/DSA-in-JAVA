public class TC_2 {
    public static void main(String[] args) {
        /*
         *                          Intermediate - 03
        */

        /*
         * What is a psuedo-code..?
         *      - It is not an actual code.
         *      - It's a rough code without any syntax
         *      - It is to validate the logic [before actually writing down the code for execution]
         *              - Like the TC of code, so that it should be optimized or not.
         *      - It is like story board for filming a sequence.
        */

        /*
         * How do we compare 2 algorithms..? [So, that we will get the best Algo to implemnet]
         *      - There are son many factors/parameters which will impact the comparision
         *      - Like the RAM, OS, CPU...
         *      - So, Scientists have concluded that the correct parameter for measuring 2 Algo’s is “Iterations”.
         *      - for ( int i=1; i≤N; i++ ) { print(”Hello”) } → iteration = N
         *      - If we run this code in any computer, any language, any geographic condition, The No. of iterations will be N only.
         *      - Hence, to compare any 2 Algorithms, we 1st find the # of iteartions based on Input & then compare those algorithms.
        */

        /*
         * If we have 1000’s of Algorithms, How do we compare them..?
         *      - We compare using “Assymptotic analysis of Algorithms”
         *      - Assymptotic Analysis means,
         *              - Analyse the performance of algorithms based on "very large inputs"
         *              - use Big( O ) Notation [for comparision]
        */

        /*
         * Why de we need to Analyse only for Very Large Inputs..?
         *      - In real world,
         *              - google search results per day → million of searches
         *              - Ind vs Pak live match viewers → millions of viewers
         *      - That means, in real world scenarios, we will be dealing with millions of data but not just for 3500 0r 10,000
         *      - So, pick the Algorith which works better for very large Inputs.
        */

        /*
         * What is Big(O) Notations..?
         *      - Calculate the # of Iterations
         *      - Ignore the Lower function value
         *              - As Input size increases, contribution of these to the whole functions decreases.
         *      - Ignore the constant co-efficients
         * 
         * Drabacks:
         *      - Big(0) always works for large inputs/data
         *      - If 2 Algo’s have same Big ( O ), we can’t really compare with Big ( O ).
         *                - We need iterations & co-efficients to compare.
        */

        /*
         * Functions: [For V.V.V.Large values of N]
         *      - log(N) < sqrt(N) < N < Nlog(N) < Nsqrt(N) < (N^2) < (N^3) < (2^N)
         */

        /*
         * NOTE: 
         * - While writing Big(O), we will always consider worst iteration.
         * - In searching an element in an array, 
         *              - best is we can find the element in 1 iteration & 
         *              - worst is we will find in last iteration i.e., N
         * - cuz, in best case worst case is not taken care of. But in worst case, best case is taken care of automatically.
        */

        /*
         * SC → It is amount of space additionally [Auxillary Space] used by Algorithm other than input space to perform Necessary Computation.
         * 
         * Simply,
         *      TC → RunTime Execution of an Algorithm   
         *      SC → Auxillary Space used by Algorithm
        */

        /*
         * Which one is better TC (or) SC..?
         *      - Always TC is more prioritized over SC
         *      - cux, SC is more of a hardware issue and we can upgrade it or optimize it later [ if we can’t upgrade it ]
         *      - But TC is all about software code/Algo. If it was not optimised, It will cost us more
         *      - like loading will take forever (or) buffering will happen (or) like the LinkedIn problem from HLD basics class
        */

        /*
         * Online Editors → will have servers to run the code online
         *      - their server will have processor of 1GHz speed
         *      - Generally 1GHz means, it can run 10^9 instructions only
         *      - And online editors will have Time Limit Exceding Error according to language specific
         *          - C++ → 1 sec
         *          - java → 2 sec
         *          - python → 4 sec
         *      - If the code writtrn in above said language exceeds their time limit, it will throw error
         *      - So, in our worst condition we will be having 1 sec for executing the code. If it wxceeds it we will have TLE error
         *      - That means, in worst condition, online editors can only perform 10^9 instructions
        */

        /*
         *
         * NOTE: 
         *      At max, our code can have only 10^9 instructions
         *      Instructions are any operation like
         *              - var declaration (or) initialization
         *              - arithmetic operati
         *              - function declaration (or) call
         *              - break (or) return statement
        */

        /*
         * In General,
         *      - 1 iteration takes around [10 - 100] instructions
         *      - Any code will have only 10^9 instructions
         *      - So, Any Code/Algo will take [ 10^7 - 10^8 ] iteration only
        */

    }
}
