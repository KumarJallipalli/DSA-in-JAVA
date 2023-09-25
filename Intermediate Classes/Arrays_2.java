import java.util.Scanner;

public class Arrays_2 {
    public static void main(String[] args) {
        /*
         *                              Intermediate - 05
        */

        /*
         * Given an Array of size N & Q queries of format s & e. Return sum of elements from index s to e
         *                         0 1 2 3 4 5 6  7 8 9 
         * ex:      arr     =   { -3 6 2 4 5 2 8 -9 3 1 }
         *          Q = 4       s   e   sum
         *                      1   3   12
         *                      2   7   12
         *                      4   8   9
         *                      0   2   5    
        */
        Scanner sc = new Scanner(System.in);
        // int[] arr = { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        // int Q = sc.nextInt();
        // for (int i=1; i<=Q; i++) {
        //     int s = sc.nextInt();
        //     int e = sc.nextInt();
        //     int sum = 0;
        //     for (int j=s; j<=e; j++) {
        //         sum += arr[j];
        //     }
        //     System.out.println(sum);
        // }
        /*
         * - In the worst case s = 0 && e = n-1 => (e-s+1) = n
         * - Q may be any number & it doesn't dependent on n [i.e., if n = 100, q may have 10000]
         * - So, TC = O(Q*(e-s+1)) == O(Q*N)
         * -     SC = O(1)
        */

        /*
         * Have you ever observed a cricket match..?
         *      - Each over will have it's own runs scored
         *      - But the score board will have the total runs scored until that over
         * ex:  overs   -   41      42      43      44      45      46      47      48      49      50
         *      Runs    -   288     312     330     349     360     383     394     406     436     439
         *      - What are the runs scored in 50th Over..?
         *              - 439 - 436 => Runs[50] - Runs[49] = 3
         *      - Similarly, what are the runs scored in 49th Over..?
         *              - Runs[49] - Runs[48] = 436 - 406 = 30 Runs
         *      - What are Runs scored in last 5 overs..?
         *              - last 5 overs means from 46 - 50 [both including]
         *              - So, Runs[50] - Runs[45] = 439 - 360 = 79
         *      - what are the runs from 42nd to 45th over..?
         *              - Runs[45] - Runs[41] = 360 - 288 = 72
         * - We are able to calculate all the runs only due to the cumulative runs from each over
         *      -Otherwise, we need to cal each run from each ball of over & then sum all the runs
         *      - just like we did in our array Question
         * - If we have the same type of cumulative data in our array's Question too, we can eliminate the sum loop
         * - This cumulative data in Arrays is called "Prefix Sum"     
        */

        /*
         * Prefix Sum: Sum of all the elements from 0 to ith index
         * ex:                 0  1  2  3  4  5  6   7  8  9 
         *          arr =   { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 }
         *       Prefix =   { -3, 3, 5, 9, 14, 16, 24, 15, 18, 19 }
         * 
         *  prefix[4] = arr[0] + arr[1] + arr[2] + arr[3] + arr[4]
         *            = -3 + 6 + 2 + 4 + 5
         *            = 14
         *  prefix[5] = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5]
         *            = prefix[4] + arr[5] 
         * 
         *  -> prefix[i] = prefix[i-1] + arr[i]
         *      { => sum of [0 - i] elements = sum of [0 -> i-1] elements + ith element }
         * 
         * - If i == 0
         *      prefix[0] = prefix[-1] + arr[0]
         *      - This will throw Index out of bound error
         *      - But by observation, prefix[0] = arr[0]
         * 
         * So,
         *      if (i == 0)
         *          prefix[i] = arr[i];
         *      else
         *          prefix[i] = prefix[i-1] + arr[i]
        */
        //Code for calculating prefix array
        // int n = sc.nextInt();
        // int[] pf = new int[n];

        // for (int i=0; i<n; i++) {
        //     if (i == 0) {
        //         pf[i] = arr[i];
        //     }
        //     else {
        //         pf[i] = pf[i-1] + arr[i];
        //     }
        // }
        /*
         * - For creating a prefix-array
         *      TC = O(N)
         *      SC = O(N) [for creating an array]
        */
        
        /*
         * Coming to the array question
         *                     0  1  2  3  4   5   6    7  8  9 
         *          arr =   { -3, 6, 2, 4, 5,  2,  8,  -9, 3, 1 }
         *       Prefix =   { -3, 3, 5, 9, 14, 16, 24, 15, 18, 19 }
         *      s   e       sum
         *      1   3       pf[3]-pf[0] = 9 - (-3) = 12
         *      2   7       pf[7] - pf[1] = 15 - 3 = 12
         *      4   8       pf[8] - pf[3] = 18 - 9 = 9
         *      0   2       pf[2] = 5
         * 
         * So,
         *      if (s == 0)
         *          sum = pf[e];
         *      else
         *          sum = pf[e] - pf[s-1];
        */
        int[] arr1 = { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        int n = arr1.length;
        int[] prefix = new int[arr1.length];
        for (int i=0; i<arr1.length; i++) {
            if (i == 0)
                prefix[i] = arr1[i];
            else
                prefix[i] = prefix[i-1] + arr1[i];
        }

        int q = sc.nextInt();
        for (int i=1; i<=q; i++) {
            int sum = 0;
            int s = sc.nextInt();
            int e = sc.nextInt();

            if (s == 0)
                sum = prefix[e];
            else    
                sum = prefix[e] - prefix[s-1];

            System.out.println(sum);
        }
        /*
         * - TC = O(N+Q)
         * - SC = O(N)
        */



        /*
         * Question_2
         * Given an array of size N, Find equillibrium index.
         * Equillibrium index - sum of all elements to it's left == sum of all elements to it's right
         * ex:              0   1   2   3   4   5
         *          arr =   1   2   3   4   8   10
         *                                  ^
         * 
         *          arr =  -7  1   5   2   -4  3   0
         *                             ^           ^
         * - For any random index "i", we need to check
         *      sum of elements from (0 -> i-1) == sum of elements from (i-1 -> n-1)
         *      prefix[i-1]     ==      prefix[n-1] - prefix[i]
        */
        int[] arr_2 = {1, 2, 3, 4, 8, 10};
        n = arr_2.length;

        int[] prefix_2 = new int[n];
        for (int i=0; i<n; i++) {
            if (i == 0) {
                prefix_2[i] = arr_2[i];
            } 
            else {
                prefix_2[i] = prefix_2[i-1] + arr_2[i];
            }
        }

        for (int i=0; i<arr_2.length; i++) {
            int leftSum;
            int rightSum;
            if (i == 0) {
                leftSum = 0;
                rightSum = prefix_2[n-1] - prefix_2[i];
            }
            else {
                leftSum = prefix_2[i-1];
                rightSum = prefix_2[n-1] - prefix_2[i];
            }

            if (leftSum == rightSum) {
                System.out.println(i);
            }
        }
        /*
         * - TC = O(N)
         * - SC = O(N)
        */



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

        /*
         * Consider creating the prefix sum for only even & odd indices
         * ex:          0   1   2   3   4   5   6   7
         *      arr =   2   3   1   -1  0   8   5   4
         * 
         *   pfEven =   2   2   3   3   3   3   8   8
         *   pfOdd  =   0   3   3   2   2   10  10  14
         *      s       e       Type    sum
         *      3       6       1       pfEven[6]-pfEven[2] = 5
         *      1       5       2       pfOdd[5]-pfOdd[0] = 10
        */
        int[] arr_3 = { 2, 3, 1, -1, 0, 8, 5, 4 };
        n = arr_3.length;

        int[] pfEven = new int[n];
        int[] pfOdd = new int[n];
        for (int i=0; i<n; i++) {
            if (i == 0) {
                pfEven[i] = arr_3[i];
                pfOdd[i] = 0;
            }
            else if (i%2 == 0) {
                pfEven[i] = pfEven[i-1] + arr_3[i];
                pfOdd[i] = pfOdd[i-1];
            }
            else {
                pfEven[i] = pfEven[i-1];
                pfOdd[i] = pfOdd[i-1] + arr_3[i];
            }
        }

        int Q_3 = sc.nextInt();
        for (int i=1; i<=Q_3; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int type = sc.nextInt();

            if (type == 1) {
                int sum = pfEven[e] - pfEven[s-1];
                System.out.println(sum);
            }
            else {
                int sum = pfOdd[e] - pfOdd[s-1];
                System.out.println(sum);
            }

        }



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
         * Onservation:
         *      - Whatever the elements before i, will remain same as it is [i.e., from 0 -> i-1]
         *      - Whatever the elements after i, will become vicevers. i.e., odd becomes even & even becomes odd
         *  Before Deletion:
         *      - sum of all even elements to left of i = pfEven[i-1]               =   x
         *      - sum of all odd elements to left of i = pfOdd[i-1]                 =   y
         *      - sum of all even elements to right of i = pfEven[n-1]-pfEven[i]    =   z
         *      - sum of all odd elements to right of i = pfOdd[n-1]-pfOdd[i]       =   w
         *  After Deletion i:   
         *      - sum of all even elements = (sum of all even elements to left of i) + (sum of all odd elements to right of i)
         *                                  = fEven[i-1] + pfOdd[n-1]-pfOdd[i]
         *                                  = x + w
         *      - sum of all Odd elements = (sum of all odd elements to left of i) + (sum of all even elements to right of i)
         *                                = pfOdd[i-1] + pfEven[n-1]-pfEven[i]
         *                                = y + z
         *  - At ith Index
         *          if (x+w == y+z)
         *              count++;
        */
        int[] arr_4 =  { 4, 3, 2, 7, 6, -2 };
        n = arr_4.length;

        int[] pfEven_4 = new int[n];
        int[] pfOdd_4 = new int[n];
        for (int i=0; i<n; i++) {
            if (i ==0 ) {
                pfEven_4[i] = arr_4[i];
                pfOdd_4[i] = 0;
            }
            else if (i%2 == 0) {
                pfEven_4[i] = pfEven_4[i-1] + arr_4[i];
                pfOdd_4[i] = pfOdd_4[i-1];
            }
            else {
                pfEven_4[i] = pfEven_4[i-1];
                pfOdd_4[i] = pfOdd_4[i-1] + arr_4[i];
            }
        }

        int count = 0;
        for (int i=0; i<n; i++) {
            int evenSum;
            int oddSum;
            if (i == 0) {
                oddSum = pfEven_4[n-1] - pfEven_4[i];
                evenSum = pfOdd_4[n-1] - pfOdd_4[i];
            }
            else {
                oddSum = pfOdd_4[i-1] + pfEven_4[n-1] - pfEven_4[i];
                evenSum = pfEven_4[i-1] + pfOdd_4[n-1] - pfOdd_4[i];
            }

            if( evenSum == oddSum) {
                count++;
            }
        }
        System.out.println(count);

    }
}
