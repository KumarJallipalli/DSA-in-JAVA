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
        
                
        
        
    }

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
