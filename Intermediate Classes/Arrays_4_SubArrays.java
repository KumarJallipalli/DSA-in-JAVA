import java.util.Scanner;

public class Arrays_4_SubArrays {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        /*
         *                              Intermediate - 07
        */

        /*
         * Sub-Arrays:
         *      - Contunuous part of an array
         *      - Ex:
         *              - Single element is a sub-array
         *              - full array is a sub-array
         *              - Empty array is Not considered as sub-array 
         *              - [as it is ambiguous even though it is there in official article]
        */

        //How to print a sub-array from ind s -> e of an array
                // int[] tempArray = arrayInput();
                // int s = 3, e = 7;
                // for (int i=s; i<=e; i++) {
                //     System.out.print(tempArray[i] + " ");
                // }
                // System.out.println();


        /*
         * Quiz:
         *  - How many sub-arrays can be formed in the following array
         *          arr = { -1, 2, 3, 2 }
         * 
         * Ans:
         *  [0, 0]  -1              [1, 1]  2               [2, 2]  3  
         *  [0, 1]  -1 2            [1, 2]  2 3             [2, 3]  3 2
         *  [0, 2]  -1 2 3          [1, 3]  2 3 2
         *  [0, 3]  -1 2 3 2                                [3, 3]  2
         *  Total = 4                       3                       2+1     => 10 [sub-arrays]
        */

        /*
         * Quiz: 
         *  Given N elements, Then How many total # of sub-arrays can be formed..?
         *                  0  1  2  3     n-4  n-3  n-2     n-1 
         *          arr = { 1, 2, 3, 4 ... N-3, N-2, N-1, N}
         * 
         * Ans:
         *  - No. of sub-arrays for each starting index is
         *      S = 0           s = 1       s = 2           s = n-2         s = n-1
         *      [0, 0]          [1, 1]      [2, 2]          [n-2, n-2]      [n-1, n-1]
         *      [0, 1]          [1, 2]      [2, 3]          [n-2, n-1]
         *      [0, 2]          [1, 3]      [2, 4]
         *      .               .           .
         *      .               .           .
         *      [0, n-2]        [1, n-2]    [2, n-2]
         *      [0, n-1]        [1, n-1]    [2, n-1]
         *  Total = N               N-1         n-2             2           1
         * 
         *  - Total # of sub-arrays = N + N-1 + N-2 ... 2 + 1
         *                          = N*(N-1)/2
         * 
         * 
         * Formula:
         *      - No. of Sub-arrays in a given array = N*(N-1)/2
        */


        /*
         * Question-1:
         *  Print all the possible sub-arrays in a given array
        */

        /*
         * Ans:
         *      - To print 1 sub-arrays, we need to 1st have the start & end indices of that sub-array
         *      - But the start & end indices of each sub-array are changing
         *      - So, we need to fix the start & end indices of all possible sub-arrays
         *      - WKT, if s = 0, then 'e' will be from 0 -> n-1
         *             if s = k, then 'e' will be from k -> n-1
         *      - that means, 'e' will be from 's' -> n-1
         *      - & 's' will be from 0 -> n-1
         *      - That means, we will be having 3 loops
         *              1 -> for start index [ s=0 -> s=n-1]
         *              2 -> for end index [ e=s -> e=n-1]
         *              3 -> for printing actual sub-array using start & end index 
        */
                // printSubArrays();



        /*
         * Question-2:
         *  MAx Sub-Arrays SUM
         *              arr = { 8, 2, -9, 10 }
         *      indices         Sub-Arrays          Sum
         *      [0, 0]          8                   8
         *      [0, 1]          8 2                 10
         *      [0, 2]          8 2 -9              1
         *      [0, 3]          8 2 -9 10           11
         *      [1, 1]          2                   2
         *      [1, 2]          2 -9                -7
         *      [1, 3]          2 -9 10             3
         *      [2, 2]          -9                  -9
         *      [2, 3]          -9 10               1
         *      [3, 3]          10                  10
         *                              Max Sum =   11
        */
                // subArraySum_Brute();
                // subArraySum_optimal();
        
                
        
            
        /*
         * Question-3:
         * Print sum of each sub-array starting at index i [i = 2]
         *          arr = { 7, 3, 2, -1, 6, 8, 2, 3 }
         *      Indices     Sum
         *      [2, 2]      2
         *      [2, 3]      1
         *      [2, 4]      7
         *      [2, 5]      15
         *      [2, 6]      17
         *      [2, 7]      20
        */
                // int[] temp_arr = { 7, 3, 2, -1, 6, 8, 2, 3 };
                // int n = temp_arr.length;

                // int sum = 0;
                // int index = 2;
                // for (int i=index; i<n; i++) {
                //     sum = sum + temp_arr[i];
                //     System.out.println("Sum = " + sum);
                // }
        /*
         * TC = O(N)
         * SC = O(1)
         *      - If we use prefix array, it will have SC = O(N) too along with TC = O(N)
         * 
         *  - If we change i = 0, it will give all the sub arrays sum starting with start index 0 right..!
         *  - Similarly, if i = 1, it will give all the sub-arrays sum with start index 1.
         *  - and the same goes on till n-1
         *  - So, if we iterate the above code with an extra for-loop from i = 1 -> n-1
         *      - It will give us the sum of all the sub-arrays 
         *  - And if we calculate the max of those in each step, it will give us the max of all sub-arrays
         *  - Which means, it will make the SC = O(1) too [whic is more optimal code than Question-2]
         *      - This is happeninig only that indices are not varying randomly
         *      - If Indices are random instead of sequence, then prefix is more preferable/usable
        */
                // sumAllSubArrays();



        /*
         * Question-4:
         * Find the sum of all the individual sub-arrays sum
         *              arr = { 8, 2, -9, 10 }
         *      indices         Sub-Arrays          Sum
         *      [0, 0]          8                   8
         *      [0, 1]          8 2                 10
         *      [0, 2]          8 2 -9              1
         *      [0, 3]          8 2 -9 10           11
         *      [1, 1]          2                   2
         *      [1, 2]          2 -9                -7
         *      [1, 3]          2 -9 10             3
         *      [2, 2]          -9                  -9
         *      [2, 3]          -9 10               1
         *      [3, 3]          10                  10
         *                              ----------------
         *                              Total Sum = 138
        */
        allSubArraysSum();



        /*
         * In how many sub-arrays, index - 3 is present
         *                  0   1  2   3  4  6
         *          arr = { 3, -2, 4, -1, 2, 6 }
         *  All the possible Start index which may include ind-3 - 0   1   2   3
         *  All the possible End index which may include ind-3 -   3   4   6
         *  If we pick any 2 indices from above [i.e., 1 from each], it will definitely have ind-3
         *  
         * Similarly, In how many sub-arrays, 
         *  index-1 is present [for same array]             Index-0 is present
         *          s       e                                   s       e
         *          0       1                                   0       0
         *          1       2                                           1
         *                  3                                           2
         *                  4                                           3
         *                  5                                           4
         *              Total = 10 sub-arrays                           5
         *                                                          Total = 6 subarray
         * 
         * Generalize:
         *          arr = { 1, 2, 3 ... i ... N-2,N-1, N }
         * In how many sub-arrays, index-i will be present..?
         *          s       e
         *          0       i
         *          1       i+1
         *          2       i+2
         *          .       .
         *          .       .
         *          i       n-1
         *      -------------------
         *         i+1      n-i
         * 
         *      - Total sub-arrays in which ith index would be present is (i+1)*(n-i)
        */  
        
        /*
         *  - So, let's go back to Question-4
         * Find the sum of all the individual sub-arrays sum
         *              arr = { 8, 2, -9, 10 }
         *      indices         Sub-Arrays          Sum
         *      [0, 0]          8                   8
         *      [0, 1]          8 2                 10
         *      [0, 2]          8 2 -9              1
         *      [0, 3]          8 2 -9 10           11
         *      [1, 1]          2                   2
         *      [1, 2]          2 -9                -7
         *      [1, 3]          2 -9 10             3
         *      [2, 2]          -9                  -9
         *      [2, 3]          -9 10               1
         *      [3, 3]          10                  10
         *                    -----------       -----------
         *                 Total sum = 138      Total Sum = 138
         * 
         *  - var sum, cal the sum of each sub-array && total sum = sum of all sum's
         *  - The same total sum can also be achieved by addings all the individual elements of each sub-array
         *          - [8]+[8+2]+[8+2-9]...[-9+10]+[10]
         *          - (4*8)+(6*2)+(6*(-9))+(4*10)
         *          - i.e., each elements is being multiplied by it's frequency
         *  - Luckily, we have the formula for freq of an element = (i+1)*(n-i)  [Gives, freq of index]
        */
        
        
    }

    //------------------------------    Question - 4    -------------------------------------------
    public static void allSubArraysSum () {
        int[] arr = arrayInput();
        int n = arr.length;

        int totalSum = 0;
        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=i; j<n; j++) {
                sum = sum + arr[j];             //To cal, each sub-array sum
                totalSum = totalSum + sum;      //To cal, sum of each sub-array sum
            }
        }

        System.out.println("Total sum of all individual sub-arrays is: " + totalSum);
    }
    /*
     * TC = O(N^2)
     * SC = O(1)
    */


    //More optimal of above code using the newly calculated freq formula
    public static void allSubArraysSum_freq () {
        int[] arr = arrayInput();
        int n = arr.length;

        int sum = 0;
        for (int i=0; i<n; i++) {
            int freq = (i+1)*(n-i);
            sum = sum + freq*arr[i];
        }

        System.out.println("Total sum of all individual sub-arrays is: " + sum);
    }
    /*
     * TC = O(N)
     * SC = O(1)
    */

    //------------------------------    Question - 3    -------------------------------------------
    public static void sumAllSubArrays () {
        int[] arr = arrayInput();
        int n = arr.length;

        int maxSum = arr[0];

        //This is to iterate on each index, so that to cal sum of all sub-arrays of that index
        for (int i=0; i<n; i++) {
            int sum = 0;

            //All the sub-arrays sum of that indext
            for (int j=i; j<n; j++) {
                sum = sum + arr[j];

                if (sum > maxSum)
                maxSum = sum;
            }     
        }
        
        System.out.println("Max sum of all sub-arrays = " + maxSum);
    }
    /*
     * TC = O(N^2)
     * SC = O(1)
     *      - If you observe, this is more optimla code than the Question-2's optimal code
     *      - this is only due to that, indicesa are sequencial
     *      - If not then the prefix methos is more optimal.
     *      - But still, "Kadane's Algorithm" is more optimal than any of the above 2
    */

    //------------------------------    Question - 2    -------------------------------------------
    public static void subArraySum_Brute () {
        int[] arr = arrayInput();
        int n = arr.length;

        int maxSum = arr[0];
        for (int s=0; s<n; s++) {
            for (int e=s; e<n; e++) {
                int sum = 0;
                for (int i=s; i<=e; i++) {
                    sum = sum + arr[i];
                }
                if (sum > maxSum)
                    maxSum = sum;
            }
        }
        System.out.println("Max sum of the sub-array = " + maxSum);
    }
    /*
     * TC = O(N^3)
     * SC = O(1)
    */

    /*
     * OPTIMIZATION:
     *      - If you claerly observe the inner loop, it just calculating the sum of elements from s -> e
     *      - We already know a way to calculate the sum without for loop
     *      - i.e., using the prefix array
     *      - So, implement that
    */
    public static void subArraySum_optimal () {
        int[] arr = arrayInput();
        int n = arr.length;

        int[] prefix = new int[n];
        for (int i=0; i<n; i++) {
            if (i == 0)
                prefix[i] = arr[i];
            else 
                prefix[i] = prefix[i-1] + arr[i];
        }

        int maxSum = arr[0];
        for (int s=0; s<n; s++) {
            for (int e=s; e<n; e++) {
                int sum = 0;

                if (e == 0)
                    sum = prefix[n-1];
                else 
                    sum = prefix[n-1] - prefix[e-1];

                if (sum > maxSum)
                    maxSum = sum;
            }
        }  
        System.out.println("Max sum of the sub-array = " + maxSum);
    }
    /*
     * TC = O(N^2)
     * SC = O(N)
    */

    //-------------------------------   Question - 1    --------------------------------------------

    //Function to print all possible sub-arrays
    public static void printSubArrays () {
        int[] arr = arrayInput();
        int n = arr.length;

        //This is to fix the starting index of a sub-array
        for (int s = 0; s<n; s++) {
            //This is to fix the ending index of a sub-array
            for (int e=s; e<n; e++) {
                //This is to print the actual sub-aaray for the given s & e
                for (int i=s; i<=e; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
    /*
     * TC = O(N^3)
     * SC = O(1)
     * 
     *      - But the more optimal code is "Kadane's Algoritm"
     *      - Which takes TC = O(N)
     *      - And will be in discussed in Advanced Classes
    */

    //-----------------------------------------------------------------------------------------------

    //Function to take an array from user input & return the same array
    public static int[] arrayInput () {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }
    /*
     * TC = O(N)
     * SC = O(N)
    */

}
