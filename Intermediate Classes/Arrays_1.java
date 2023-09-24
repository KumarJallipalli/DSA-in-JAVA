public class Arrays_1 {
    public static void main(String[] args) {
        /*
         *                              Intermediate - 04
        */

        /*
         * Question_1:
         * Given N array elements, Count # of elements having 1 element greater than itself
         * ex:  arr = {-3, -2, 6, 8, 4, 8, 5 }      ->  5
         *      arr = { 2, 3, 10, 7, 3, 2, 10, 8 }  ->  6
         *      arr = { 8, 8, 8, 8 }                ->  0 
        */

        /*
         * Observations:
         *      - Largest element in the array won't have any elemnt greater than it
         *      - Except largest element, remaining all elements wull have atleast 1 element greater than it
         * - So, Iterate and Find the greatest element & it's count
         * - Ans = arr.length - count
        */
        int arr[] = {-3, -2, 6, 8, 4, 8, 5 };
        System.out.println(question_1(arr));
        

        /*
         * Question_2:
         * Given N array elements, return true if there exists a pair (i, j) such that
         * arr[i] + arr[j] == k && i != j. if No such pair exists, return false.
         * ex:  arr =  { 3, -2, 1, 4, 3, 6, 8 }     k = 10      ->  (3, 5)
         *      arr =  { 2, 4, -3, 7 }              k = 5       ->  false
         *      rr =  { 2, 4, -3, 7 }               k = 8       ->  false
        */
        System.out.println(question_2(arr, 10));
        System.out.println(question_2_Optimised(arr, 10));


        /*
         * Question_3:
         * Given an Array, Reverse the entire array
         *      - Original array itself should change
         *      - SC should be constant [No creating a new temp array]
         *  ex: arr = { -9, 8, -6, 52, 4, 0, 12 }
         *      ans = { 12, 0, 4, 52, -6, 8, -9 }
        */

        /*
         * Observations:
         *      - As we shouldn't create a new temp array, we need to operate on the existing array
         *      - So, we will go with "2-pointer" approach.
         *      - we will use 2-pointers [p1, & p2],
         *      - iterate p1 from left/start side & p2 from right/end side
         *      - p1++ && p2-- Now, they will meet at one point then break loop
         *      - if # of elements are Odd, p1 & p2 will meet ant n/2 then break
         *      - if # of elements are Even, p1 & p2 will be side by side then break
         * ex:
         *         -9, 8, -6, 52, 4, 0, 12
         *          p1                   p2
         * - Now swap elements & P1++ & p2--
         * 
         *          12, 8, -6, 52, 4, 0, -9
         *              p1            p2 
         * - Now swap elements & P1++ & p2--
         * 
         *          12, 0, -6, 52, 4, 8, -9
         *                  p1     p2
         * - Now swap elements & P1++ & p2--
         *  
         *          12, 0, 4, 52, -6, 8, -9
         *                    p1     
         *                    p2
         * - Now Break
         * 
         * similarly for even elements
         *         -9, 8, -6, 4, 0, 12
         *          p1              p2
         * - Now swap elements & P1++ & p2--
         * 
         *          12, 8, -6, 4, 0, -9
         *              p1        p2 
         * - Now swap elements & P1++ & p2--
         * 
         *          12, 0, -6, 4, 8, -9
         *                  p1 p2
         * - Now Break
         * - That means, when p1 >= p2 loop should break
        */
        question_3(arr);


        /*
         * Question_4:
         * Given N array Elements && s & e indices. Reverse the array from only [Si, Ei]
         *      - Si <= Ei [Always]
         * ex:  arr = { -3, 4, 2, 8, 7, 9, 6, 2, 10 }   &&  s=3 & e=7
         *      ans = { -3, 4, 2, "2, 6, 9, 7, 8", 10 }
        */

        /*
         * Ans:
         *      - it is same as Question_3,
         *      - only change p1 = s & p2 = e
        */


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

        /*
         * Observations:
         *      - Last k elemenst will be the 1st k elements
         * 
         * - Let's see we can get the ans by reversing the array elements..?
         *          arr = { a0, a1, a2, a3, a4, a5, a6, a7, a8, a9 }    -> 10 elements   k = 4
         *          rev = { a9, a8, a7, a6, a5, a4, a3, a2, a1, a0 }    -> reversed whole array
         *              = { a6, a7, a8, a9, a5, a4, a3, a2, a1, a0 }    -> reversed only 1st k-elements
         *              = { a6, a7, a8, a9, a0, a1, a2, a3, a4, a5 }    -> reversed last n-k elements
         *              = ans
         * 
         * ----------------------- Written the code question_5 --------------------------------
         * 
         * Observations:
         *      - This won't work for k > n condition. [like n = 6 && k = 8]
         *      - We will get index out of bound error for the above code
         * 
         * Let,s analyse the code again,
         *          arr = { a0, a1, a2, a3, a4, a5 }    k = 0 [=> not rotated at all]
         *      k = 1   => 1 rotation of each element   arr = { a5, a0, a1, a2, a3, a4 }
         *      k = 2   => 2 rotations                  arr = { a4, a5, a0, a1, a2, a3 }
         *      k = 3                                   arr = { a3, a4, a5, a0, a1, a2 }
         *      k = 4                                   arr = { a2, a3, a4, a5, a0, a1 }
         *      k = 5                                   arr = { a1, a2, a3, a4, a5, a0 }
         *      k = 6                                   arr = { a0, a1, a2, a3, a4, a5 } => original array
         * 
         *      k = 7                                   arr = { a5, a0, a1, a2, a3, a4 } => same as k=1
         *      k = 8                                   arr = { a4, a5, a0, a1, a2, a3 } => same as k=2
         * 
         *      k                       arr
         *      1   7   13              { a5, a0, a1, a2, a3, a4 }
         *      2   8   14              { a4, a5, a0, a1, a2, a3 }
         *      3   9   15              { a3, a4, a5, a0, a1, a2 }
         *      4   10  16              { a2, a3, a4, a5, a0, a1 }
         *      5   11  17              { a1, a2, a3, a4, a5, a0 }
         *      6   12  18              { a0, a1, a2, a3, a4, a5 }  -> Original array
         * 
         * Observations:
         *      - after k = n rotations, we are getting the same original array
         *      - Before n rotations, each rotation is givin us an unique array
         *      - But after n rotations, those unique arraya repeats just like the tables
         *      - So, there is some repetion occuring
         *      - So, make k = k%n
        */
        question_5_Mod(arr, 9);
        question_5_Mine(arr, 9);

    }

    void func (int arr[]) {
        int n= arr.length;
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    /*
     * TC = O(N)
     * Sc = O(1) [As, only n & i variables are declared => 8 bytes]
    */

    
    public static int question_1 (int arr[]) {
        int n = arr.length;
        int max = arr[0];

        //Finding the max element
        for (int i=1; i<n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //Finding the frequency of max element
        int freq = 1;
        for (int i=0; i<n; i++) {
            if (arr[i] == max) {
                freq++;
            }
        }

        return n - freq;
    }
    /*
     * Total Ierations = (N-1) + N = 2N-1
     *      TC = O(N)
     *      SC = O(1)
     * 
     * TO-DO: Try to Solve the above sol using only 1 for-loop
    */


    public static boolean question_2 (int arr[], int k) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] + arr[j] == k && (i != j))
                    return true;
            }
        }
        return false;
    }
    /*
     * if   N = 4, then the pairs formed will be (i, j)
     *              (0, 0)  (0, 1)  (0, 2)  (0, 3)
     *              (1, 0)  (1, 1)  (1, 2)  (1, 3)
     *              (2, 0)  (2, 1)  (2, 2)  (2, 3)
     *              (3, 0)  (3, 1)  (3, 2)  (3, 3)
     * TC = O(N^2)
     * Sc = O(1)
     * 
     * Observations:
     *      - All the diagonal pairs are to be ignored
     *      - upper & lower triangle mirror pairs are exactly same [in case of pIr elements]
     *      - So, either one of them can be ignored [so, no. of iterations reduces]
     *      - Let's take upper trainagle pairs
     *              i       j
     *              0       [1 -> 3]
     *              1       [2 -> 3]
     *              2       [3 -> 3]
     *      - That means, if i starts at x, j starts at (x+1)
     *      - i runs from [0 - (n-1)] && j runs from (i+1 -> n)
     * 
     * So, Let's optimise according to the observations
    */

    public static boolean question_2_Optimised (int arr[], int k) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] + arr[j] == k)
                    return true;
            }
        }
        return false;
    }
    /*
     *      i       j           iterations
     *      0       [1 -> n-1]      n-1
     *      1       [2 -> n-1]      n-2
     *      2       [3 -> n-1]      n-3
     *      .           .           .
     *      .           .           .
     *      n-2     [n-1 -> n-1]    1
     *      n-1 [breaks]            == 1 + 2 + 3 .. n-3 + n-2 + n-1
     * 
     * - Sum of 1st (n-1) natural numbers   = n*(n+1)/2
     *                                      = (n-1)(n-1+1)/2
     *                                      = (n^2 - n)/2
     *  TC = O(N^2) [i.e., why If we have same Big(O), we need to consider lower & constants too]
     *  SC = O(1)
    */


    public static void question_3 (int[] arr) {
        int n = arr.length;
        int p1 = 0, p2 = n-1;
        while (p1 < p2) {
            // swap(p1, p2, arr);
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }

        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    /*
     * TC = O(N/2) == O(N)
     * SC = O(1)
    */
    public static void swap (int p1, int p2, int[] arr) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }


    public static void question_4 (int[] arr, int s, int e) {
        int n = arr.length;
        int p1 = s, p2 = e;
        while (p1 < p2) {
            // swap(p1, p2, arr);
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }

        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
    /*
     * TC = O(N)
     * SC = O(1)
    */


    public static void question_5 (int[] arr, int k) {
        int n = arr.length;
        // int s = 0, e = n-1;

        //Step-1: Reverse whole array
        question_4(arr, 0, n-1);
        // while (s<e) {
        //     int temp = arr[s];
        //     arr[s] = arr[e];
        //     arr[e] = temp;
        //     s++;
        //     e--;
        // }

        //Step-2: Reverse 1st k elements
        question_4(arr, 0, k-1);
        // s = 0; e = k-1;
        // while (s<e) {
        //     int temp = arr[s];
        //     arr[s] = arr[e];
        //     arr[e] = temp;
        //     s++;
        //     e--;
        // }
        
        //Step-1: Reverse rest of the (n-k) elements
        question_4(arr, k, n-1);
        // s = k; e = n-1;
        // while (s<e) {
        //     int temp = arr[s];
        //     arr[s] = arr[e];
        //     arr[e] = temp;
        //     s++;
        //     e--;
        // }
    }
    /*
     * TC = (N/2) + (K/2) + (N-K)/2 = N == O(N)
     * SC = O(1)
    */

    public static void question_5_Mod (int arr[], int k) {
        int n = arr.length;
        k = k%n;

        question_4(arr, 0, n-1);
        question_4(arr, 0, k-1);
        question_4(arr, k, n-1);
    }


    //My Ans for question_5 [Not the best one]
    public static void question_5_Mine (int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n];

        for (int i=0; i<n; i++) {
            //This formula is the key
            int j = (k+i)%n;
            ans[j] = arr[i];
        }

        for (int i=0; i<n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
    /*
     * - TC = O(N)
     * - SC = O(N) [For extra temp array]
     * 
     * Explanation:
     *      - All the elements will be shifted to k places towards right
     *      - j = i+k
     *      - but this makes index out of bound error && all these error making elements shifts to start
     *      - i.e., after (n-1)th place, it is coming to 0th place
     *      - By observing we can use, modulo operator
     *      - That means a paatern is being followed by all the elements
     *      - That pattern is (i+k)%n 
    */

}
