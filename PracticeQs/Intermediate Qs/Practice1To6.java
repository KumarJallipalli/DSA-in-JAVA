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
                // System.out.println("No. of Factors = " + countFactorsBrute());
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
                // System.out.println("No. of Factors = " + countFactorsOptimised());



        /*
         * Question_2:
         * a.) Give N a Perfect Square, Cal square root of N
         * b.) Give N a Non-Perfect Square, Cal square root of N
        */
                // System.out.println("Square Root of N = " + perfSqrtN());
                // System.out.println("Floor value of the Square Root of N = " + nonPerfSqrtN());



        /*
         *                              Intermediate - 02
        */

        /*
         * For V.V.larger values of N:
         *          log(N) < sqrt(N) < N < Nlog(N) < Nsqrt(N) < (N^2) < (N^3) < (2^N) 
         * 
         * Cal how many iterations in the following code
        */               // V.V.VImp
    
                // for (int i=sc.nextInt(); i>0; i=i/2) {
                //     for (int j=1; j<=i; j++) {
                //         System.out.println("Hello World");
                //     }
                // }

       

        /*
         *                              Intermediate - 03
         * It is all about Theory, So Questions to solve
        */



        /*
         *                              Intermediate - 04
        */

        /*
         * Question_1:
         * Given N array elements, Count # of elements having 1 element greater than itself
        */
                // System.out.println("# of elements greater than itself = " + countElementsGreater());  
                
        
    
        /*
         * Question_2:
         * Given N array elements, return true if there exists a pair (i, j) such that
         *      arr[i] + arr[j] == k && i != j. if No such pair exists, return false.
        */
                // System.out.println("Pair elements Exists or Not : " + pairElementsOptimised());



        /*
         * Question_3:
         * * Given an Array, Reverse the entire array
         *      - Original array itself should change
         *      - SC should be constant [No creating a new temp array]
        */
                // arrayReverse();



        /*
         * Question_4:
         * Given N array Elements && s & e indices. Reverse the array from only [Si, Ei]
         *      - Si <= Ei [Always]
         * ex:  arr = { -3, 4, 2, 8, 7, 9, 6, 2, 10 }   &&  s=3 & e=7
         *      ans = { -3, 4, 2, "2, 6, 9, 7, 8", 10 }
        */
                // arrayReverseStoE();



        /*
         * Question_5:
         * Given N array Elements, Rotate array from last to first by k times [Asked in G & Am]
         * ex:      k = 3         0  1 2 3 4 5 6 
         *          arr     =   [ 3 -2 1 4 6 9 8 ] 
         * 
         *          k = 1   =   [ 8 3 -2 1 4 6 9 ]
         *          k = 2   =   [ 9 8 3 -2 1 4 6 ]
         *          k = 3   =   [ 6 9 8 3 -2 1 4 ]
         * 
         *                    0 1 2 3 4 5  6 7 8
         *      arr     =   [ 4 1 6 9 2 14 7 8 3]    && k=4
         *      ans     =   [ 14 7 8 3 4 1 6 9 2]
        */
                // rotateKtimes_FormulaMethod();
                // rotateKtimes_Optimised();



        /*
         *                                  Intermediate - 05
        */

        /*
         * Question_1:
         * Given an Array of size N & Q queries of format s & e. Return sum of elements from index s to e
         *                         0 1 2 3 4 5 6  7 8 9 
         * ex:      arr     =   { -3 6 2 4 5 2 8 -9 3 1 }
         *          Q = 4       s   e   sum
         *                      1   3   12
         *                      2   7   12
         *                      4   8   9
         *                      0   2   5    
        */
                // sumElementsQTimes();
                // sumElementsQTimes_Optimised();



        /*
         * Question_2:
         * Given an array of size N, Find equillibrium index.
         * Equillibrium index - sum of all elements to it's left == sum of all elements to it's right
         * ex:              0   1   2   3   4   5
         *          arr =   1   2   3   4   8   10
         *                                  ^
         * 
         *          arr =  -7  1   5   2   -4  3   0
         *                             ^           ^
        */
                // equillibriumIndex();
                // equillibriumIndex_Optimised();



        /*
         * Question_3:
         * Given an array of size N, asked Q queries,
         * each Query is of 2 types:
         *      Type - 1: Sum of all even indices from s -> e
         *      Type - 2: Sum of all Odd indices from s -> e
         * ex:          0   1   2   3   4   5   6   7
         *      arr =   2   3   1   -1  0   8   5   4
         *      s       e       Type    Sum
         *      3       6       1       5   [0 + 5]
         *      1       5       2       10  [3 + -1 +8]
        */
                // queryType();



        /*
         * Question_4:
         * Given an array of size N, Count # of special index
         * Special Index - If we delete this index, then sum of even index = sum of odd index
         * ex:              0   1   2   3   4   5
         *          arr =   4   3   2   7   6   -2
         *      Sp.Ind      arr                         S-odd   S-even      Ans     
         *      i = 0       3   2   7   6   -2          8       8           Yes
         *      i = 1       4   2   7   6   -2          8       9           
         *      i = 2       4   3   7   6   -2          9       9           Yes
         *      i = 3       4   3   2   6   -2          9       4
         *      i = 4       4   3   2   7   -2          10      4
         *      i = 5       4   3   2   7   6           10      12           
         * 
         *              0       (i-1)   (i+1)   (n-1)  
         *              ------------> i <----------
        */
                // countSpecialInd();



        /*
         *                              Intermediate - 06
        */

        /*
         * Question_1: Count the # of piars "ag"
         * Given a char[], Calculate # of pairs i,j such that i<j && s[i]=='a' && s[j]==g
         * NOTE: ALl charatcers are lower case
         * ex:      0   1   2   3   4   5   6   7
         *          b   a   a   g   d   c   a   g
         *          Ans = (1,3), (1,7), (2,3), (2,7) & (6,7)
         *          
         *          a   c   g   d   g   a   g
         *          ans = (0,2), (0,4), (0,6) & (5,6)
        */
                // countPairsAG();
                // countPairsAG_Optimised();



        /*
         * Question_2: Leaders in an Array
         * Given an array of size N, find the count of leaders in array
         * An elements is a leader, if it is strictly greater than max element in it's right
         * ex:      0   1   2   3   4   5   6   7
         *          15  -1  7   2   5   4   2   3
         *              i       max in right    leader
         *              0           7           15 > 7  Yes
         *              1           7           -1 > 7  No
         *              2           5           7 > 5   Yes
         *              3           5           2 > 7   No
         *              4           4           5 > 4   Yes
         *              5           3           4 > 3   Yes
         *              6           3           2 > 3   No
         *              7           -           -       Yes [default]
         *      Ans = 5
         * 
         *          10  7   9   3   2   4       Ans = 3
        */
        
    }

    //Function to find Leaders in Array
    public static void leadersInArray () {
        int[] arr = arrayInput();
        int n = arr.length;

        int maxElement = arr[n-1];
        int leaders = 1;
        for (int i=n-2; i>=0; i--) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                leaders++;
            }
        }
        System.out.println("# of leaders = " + leaders);
    }
    /*
     * TC = O(N)
     * SC = O(1)
    */

    //Function to count # of pairs "ag"
    public static void countPairsAG () {
        int n = sc.nextInt();
        char[] arr = new char[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.next().charAt(0);
        }

        int count = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] == 'a') {
                for (int j=i+1; j<n; j++) {
                    if (arr[j] == 'g')
                        count++;
                }
            }
        }

        System.out.println("# of 'ag' pairs = " + count );
    }
    /*
     * TC = O(N)
     * SC = O(1)    //if we already have an array
    */

    //Optimal version of above code
    public static void countPairsAG_Optimised () {
        int n = sc.nextInt();
        char[] arr = new char[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.next().charAt(0);
        }

        int pairs = 0;
        int countGs = 0;
        for (int i=n-1; i>=0; i--) {
            if (arr[i] == 'g') {
                countGs++;
            }
            if (arr[i] == 'a') {
                pairs = pairs + countGs;
            }
        }

        System.out.println("# of 'ag' pairs = " + pairs);
    }
    /*
     * TC = O(N)
     * SC = O(1)        //Since we will already have an array instead of taking it as input
    */

    //----------------------------------    Intermediate - 05   -------------------------------------------

    //Function to count # of special indices
    public static void countSpecialInd () {
        int[] arr = arrayInput();
        int n = arr.length;

        int[] evenPrefix = new int[n];
        int[] oddPrefix = new int[n];
        for (int i=0; i<n; i++) {
            if (i == 0) {
                evenPrefix[i] = arr[i];
                oddPrefix[i] = 0;
            }
            else if (i%2 == 0) {
                evenPrefix[i] = evenPrefix[i-1] + arr[i];
                oddPrefix[i] = oddPrefix[i-1];
            }
            else {
                evenPrefix[i] = evenPrefix[i-1];
                oddPrefix[i] = oddPrefix[i-1] + arr[i];
            }
        }

        //Actual logic
        int count = 0;
        for (int i=0; i<n; i++) {
            int evenSum;
            int oddSum;
            if (i == 0) {
                evenSum = oddPrefix[n-1]-oddPrefix[i];
                oddSum = evenPrefix[n-1]-evenPrefix[i];
            }
            else {
                evenSum = evenPrefix[i-1] + oddPrefix[n-1]-oddPrefix[i];
                oddSum = oddPrefix[i-1] + evenPrefix[n-1]-evenPrefix[i];
            }

            if (evenSum == oddSum)
                count++;
        }
        System.out.println("Special Indices = " + count);
    }
    /*
     * TC = O(N)
     * SC = O(N)
    */




    //Function to cal Query Types
    public static void queryType () {
        int[] arr = arrayInput();
        int n = arr.length;

        int evenPrefix[] = new int[n];
        int oddPrefix[] = new int[n];
        for (int i=0; i<n; i++) {
            if (i == 0) {
                evenPrefix[i] = arr[i];
                oddPrefix[i] = 0;
            }
            else if (i%2 == 0) {
                evenPrefix[i] = evenPrefix[i-1] + arr[i];
                oddPrefix[i] = oddPrefix[i-1];
            }
            else {
                evenPrefix[i] = evenPrefix[i-1];
                oddPrefix[i] = oddPrefix[i-1] + arr[i];
            }
        }

        //Actual logic
        int Q = sc.nextInt();

        for (int i=1; i<=Q; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int type = sc.nextInt();

            int sum;
            if (type == 1) {
                if (s == 0)
                    sum = evenPrefix[e];
                else 
                    sum = evenPrefix[e]-evenPrefix[s-1];
            }
            else {
                if (s == 0)
                    sum = oddPrefix[e];
                else
                    sum = oddPrefix[e] - oddPrefix[s-1];
            }

            System.out.println("Sum = " + sum);
        }
    }
    /*
     * TC = O(N+Q)
     * SC = O(N)
    */


    

    //Function to find Equilibriium Index [using prefix & postfix arrays]
    public static void equillibriumIndex () {
        int arr[] = arrayInput();
        int n = arr.length;

        int prefix[] = new int[n];
        for (int i=0; i<n; i++) {
            if (i == 0)
                prefix[i] = arr[i];
            else 
                prefix[i] = prefix[i-1] + arr[i];
        }

        int postfix[] = new int[n];
        for (int i=n-1; i>=0; i--) {
            if (i == n-1)
                postfix[i] = arr[i];
            else 
                postfix[i] = postfix[i+1] + arr[i];
        }

        for (int i=0; i<n; i++) {
            int leftSum;
            int rightSum;

            if (i == 0) {
                leftSum = 0;
                rightSum = postfix[i+1];
            }
            else if (i == n-1){
                leftSum = prefix[i-1];
                rightSum = 0;
            }
            else {
                leftSum = prefix[i-1];
                rightSum = postfix[i+1];
            }   
            
            if (leftSum == rightSum)
                System.out.println("Equilibrium Index : " + i);
        }
    }
    /*
     * TC = O(N)
     * SC = O(N)
    */

    //Optimised version of above code
    public static void equillibriumIndex_Optimised () {
        int arr[] = arrayInput();
        int n = arr.length;

        int prefix[] = new int[n];
        for (int i=0; i<n; i++) {
            if (i == 0)
                prefix[i] = arr[i];
            else 
                prefix[i] = prefix[i-1] + arr[i];
        }

        
        for (int i=0; i<n; i++) {
            int leftSum;
            int rightSum;

            if (i == 0) {
                leftSum = 0;
                rightSum = prefix[n-1]-prefix[i];
            }    
            else {
                leftSum = prefix[i-1];
                rightSum = prefix[n-1] - prefix[i];
            }

            if (leftSum ==  rightSum)
                System.out.println("Equilibrium Index : " + i);
        }
    }
    /*
     * TC = O(N)
     * SC = O(N)
    */



    //Function to Return sum of elements from index s to e [for Q times]
    public static void sumElementsQTimes () {
        int[] arr = arrayInput();
        int n = arr.length;

        int Q = sc.nextInt();
        for (int i=1; i<=Q; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            int sum = 0;
            for (int j=s; j<=e; j++) {
                sum += arr[j];
            }

            System.out.println("Sum = "+ sum);
        }
    }
    /*
     * TC = O(N^2)
     * SC = O(1)
    */

    //Optimised version of above code
    public static void sumElementsQTimes_Optimised () {
        int[] arr = arrayInput();
        int n = arr.length;

        int[] prefix = new int[n];
        for (int i=0; i<n; i++) {
            if (i == 0)
                prefix[i] = arr[i];
            else
                prefix[i] = prefix[i-1] + arr[i];
        }

        int Q = sc.nextInt();
        for (int i=0; i<Q; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            int sum = 0;
            if (s == 0) {
                sum = prefix[e];
            }
            else {
                sum = prefix[e] - prefix[s-1];
            }

            System.out.println("Sum = " + sum);
        }
    }
    /*
     * TC = O(N+Q)
     * SC = O(N)
    */


    //------------------------------------  Intermediate - 04   ------------------------------------------

    //function to rotate array by k times [Formula method]
    public static void rotateKtimes_FormulaMethod () {
        int[] arr = arrayInput();
        int k = sc.nextInt();
        int n = arr.length;

        int[] ans = new int[n];
        for (int i=0; i<n; i++) {
            int temp = (i+k)%n;
            ans[temp] = arr[i];
        }

        //printing the Ans array
        for (int i=0; i<n; i++)
            System.out.print(ans[i] + " ");
        System.out.println();
    }
    /*
     * TC = O(N)
     * SC = O(N)        [Since, we are creating ans array]
    */

    //function to rotate array by k times [Optimal method]
    public static void rotateKtimes_Optimised () {
        int[] arr = arrayInput();
        int k = sc.nextInt();
        int n = arr.length;
        k = k%n;                        // To tackle the cases where k > n 

        //1st reverse the whole array
        int s=0, e=n-1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }

        //Now, reverse the 1st k elements
        s = 0; e = k-1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }

        //Now, revrse the n-k elements
        s = k; e = n-1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }

        //printing the Ans array
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    /*
     * TC = O(N)
     * SC = O(1)
    */

    

    //function to Reverse the array from only [Si, Ei]
    public static void arrayReverseStoE () {
        int arr[] = arrayInput();
        int s = sc.nextInt();
        int e = sc.nextInt();
        int n= arr.length;

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }

        //printing the Reversed array
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    /*
     * TC = O(N/2)
     * SC = O(1)
    */



    
    //Function to reverse an Array with SC = O(1)
    public static void arrayReverse () {
        int arr[] = arrayInput();
        int n = arr.length;

        // //printing the original array
        // for (int i=0; i<n; i++)
        //     System.out.print(arr[i] + " ");
        // System.out.println();

        //reversing the Array
        int s = 0, e = n-1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }

        //printing the Reversed array
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    /*
     * TC = O(N/2)
     * SC = O(1)
    */




    //Brute force method for pair (i, j) elements where arr[i] + arr[j] == k && i != j
    public static boolean pairElements () {
        int[] arr = arrayInput();
        int k = sc.nextInt();
        int n = arr.length;

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (arr[i]+arr[j] == k && i!=j)
                    return true;
            }
        }

        return false;
    }
    /*
     * TC = O(N^2)
     * SC = O(1)
    */

    /*
     * Optimised method of above problem:
     * if   N = 4, then the pairs formed will be (i, j)
     *              (0, 0)  (0, 1)  (0, 2)  (0, 3)
     *              (1, 0)  (1, 1)  (1, 2)  (1, 3)
     *              (2, 0)  (2, 1)  (2, 2)  (2, 3)
     *              (3, 0)  (3, 1)  (3, 2)  (3, 3)
     * - Neglecting the any one triangle && diagonal pairs
     * - Hence taking upper triangle
    */
    public static boolean pairElementsOptimised () {
        int arr[] = arrayInput();
        int k = sc.nextInt();
        int n = arr.length;

        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i]+arr[j] == k)
                    return true;
            }
        }

        return false;
    }
    /*
     * TC = O(N^2)          Actually, O((N^2-N)/2)
     * SC = O(1)
    */



    //function to Count # of elements having 1 element greater than itself
    public static int countElementsGreater () {
        int[] arr = arrayInput();
        // int count = 0;

        //Finding the max element
        int maxElement = arr[0];
        for ( int i=0; i<arr.length; i++) {
            if (arr[i] > maxElement)
                maxElement = arr[i];
        }

        //Counting # of elements having 1 element greater than itself
                // for (int i=0; i<arr.length; i++) {
                //     if (arr[i] < maxElement)
                //         count++;
                // }
                // return count;

        //                      (or)
        int freq = 0;
        for ( int i=0; i<arr.length; i++) {
            if (arr[i] == maxElement)
                freq++;
        }

        return arr.length-freq;
    }
    /*
     * TC = O(N)
     * SC = O(1)
    */

    //function to craete an array & return it
    public static int[] arrayInput () {
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        return arr;
    }
    /*
     * TC = O(N)
     * SC = O(N)    //As a new array is being created
     */

    //--------------------------------------    Intermediate - 01   -----------------------------------

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
    /*
     * TC = O(sqrt(N))
     * SC = O(1)
    */



    //If N is a Perfect Square
    public static int perfSqrtN () {
        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {
            if (i*i == N)
                return i;
        }

        return 0;
    }
    /*
     * TC = O(sqrt(N))      //[ Since N is perfect square, It will never go beyond sqrt(N) ]
     * SC = O(1)
    */

    //If N is Not a Perfect Square
    public static int nonPerfSqrtN () {
        int N = sc.nextInt();
        int ans = 0;
        int i = 1;

        while (i*i <= N) {
            ans = i;
            i++;
        }
        // for (int j=1; j*j<=N; j++) {
        //     ans = j;
        // }

        return ans;
    }
    /*
     * TC = O(sqrt(N))
     * SC = O(1)
     * 
     *      - This is not the optiumal code too
     *      - Optimal TC = logN 
     *      - Will be Taught in Advanced Classes
    */

}
