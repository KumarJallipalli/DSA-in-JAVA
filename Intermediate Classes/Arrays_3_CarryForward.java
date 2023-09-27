public class Arrays_3_CarryForward {
    public static void main(String[] args) {
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

        //Ans_1 - Brute force : cal every possible pair & check
        char[] arr_1 = {'b', 'a', 'a', 'g', 'd', 'c', 'a', 'g'};
        int n = arr_1.length;
        int count_1 = 0;
        
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr_1[i]=='a' && arr_1[i]=='g')
                    count_1++;
            }
        }
        System.out.println(count_1);
        /*
         * TC = O(N^2)
         * SC = O(1)
        */

        //Ans_2 - Brute Force: if 1st char is other than 'i', do i need to check 2nd char..? NO
        char[] arr_1_1 = {'b', 'a', 'a', 'g', 'd', 'c', 'a', 'g'};
        n = arr_1.length;
        count_1 = 0;
        
        for (int i=0; i<n; i++) {
            if (arr_1_1[i] == 'a') {
                for (int j=i+1; j<n; j++) {
                    if (arr_1_1[i]=='g')
                        count_1++;
                }
            }
        }
        System.out.println(count_1);
        /*
         * TC = O(N^2) [for an array like {'a', 'a', 'a', 'a', 'a'}]
         * SC = O(1)
        */

        /*
         * For the solution above,
         *      - if i=='a'
         *      - we are finding how many 'g' are there to the right of 'a'
         * So, to optimise the code further, we will cal # of g's to the right of 'a' in different way
         * 
         * If you are travelling from pint x to home. 
         * At certain point y you were being asked how many trees are there from point y to home..?
         * We can't ans that right, cuzz we haven't seen the trees yet. [We can only ans from X to Y]
         * So, if we want to know the # of trees from y to Home, we need to start from Home Not from X.
         * 
         * Similarly, "to know how many g's to right of a, we need to start from right end"
         * ex:          0       1       2       3       4       5       6       7       8
         *              a       d       g       a       g       a       g       f       g
         *              s=s+c           c++     s=s+c   c++     s=s+c   c++             c++
         *              =9              =4      =5       =3     =2      =2              =1
         * 
         *      - Iterate from right to left [n-1 -> 0]
         *      - cal # of g's encounter. [used c to cal g's]  
         *      - Use sum  variable (s) to cal the total pairs
         *      - if you ever reach 'a', we know how many g's are there to the right of 'a' now
         *      - So, # of pairs = # of g's = c
         *      - but to keep the count updated we use s = s + c [as these g's will also contribute to next 'a']
        */
        char[] arr_1_2 = {'b', 'a', 'a', 'g', 'd', 'c', 'a', 'g'};
        n = arr_1_2.length;
        int ans = 0;
        int c = 0;

        for (int i=n-1; i>=0; i--) {
            if (arr_1_2[i] == 'g')
                c++;
            if (arr_1_2[i] == 'a')
                ans = ans + c;
        }
        System.out.println(ans);
        /*
         * TC = O(N)
         * SC = O(1)
         * 
         * NOTE: [We can do this from left to right]
         *      - If we want to do from left to right iteration
         *      - we need to change the focus from 'g' to 'a'
         *      - cal how many a's are there to the left of 'g'
         *      - whenever you encounter 'a', c++
         *      - whenever you encpunter 'g', ans = ans + c 
        */

        /*
         * This technoque is called "Carry Forward"
         * We are carrying the result of earlier computation with you
        */



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
        int[] arr_2 = {15, -1, 7, 2, 5, 4, 2, 3};
        n = arr_2.length;
        int leaders = 1; //Since last element is always a leader
        int max = arr_2[n-1];

        for (int i=n-2; i>=0; i--) {
            if (arr_2[i] > max) {
                leaders++;
                max = arr_2[i];
            }
        }
        System.out.println(leaders);
        /*
         * TC = O(N)
         * SC = O(1)
        */



        /*
         * Question_3: Closest Min Max
         * Given N array elements, Find the length of smallest subarray which contains both Min & Max of array
         * ex:              0   1   2   3   4   5   6   7   8   9
         *          arr =   1   2   3   1   3   4   6   4   6   3
         *          min =   1
         *          max =   6   Ans = 4
         * 
         *          arr =   2   2   6   4   5   1   5   2   6   4   1
         *          min =   1
         *          max =   6   Ans = 3
         * 
         * Observations:
         *      - We need only 1 Min & 1 Max element
         *      - Min & Max will always be the corner elements of an sub-array
         *          - i.e., either [min ... max] or [max ... min]
         * 
         * Code:
         *      - we will iterate over the entire array
         *      - if we encounter min element, we will loop from there till we find Max element
         *      - if we encounter max element, we will loop from there till we find Min element
        */
        int[] arr_3 = { 2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1 };
        n = arr_3.length;
        int min_Element = arr_3[0];
        int max_Element = arr_3[0];

        //calculating min & max elements
        for (int i=0; i<n; i++) {
            if (arr_3[i] > max_Element)
                max_Element = arr_3[i];
            if (arr_3[i] < min_Element)
                min_Element = arr_3[i];
        }

        int closest = n; //since the worst closest min max is n
        //actual code for closest min max
        if (min_Element == max_Element) { // for case: arr = { 8, 8, 8, 8 }
            closest = 1;
        }
        else {
            for (int i=0; i<n; i++) {
                if (arr_3[i] == min_Element) {
                    for (int j=i+1; j<n; j++) {
                        //if we find max elemnt, it makes a pair so update the ans & break
                        if (arr_3[j] == max_Element) {
                            closest = Math.min(closest, j-i+1);
                            break;
                        }
                    }
                }

                if (arr_3[i] == max_Element) {
                    for (int j=i+1; j<n; j++) {
                        //if we find min elemnt, it makes a pair so update the ans & break
                        if (arr_3[j] == min_Element) {
                            closest = Math.min(closest, j-i+1);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(closest);
        
        /*
         * TC = O(N^2)
         * SC = O(1)
        */

        /*
         * Let's Optimise the code:
         * ex:              0   1   2   3   4   5   6   7   8   9
         *          arr =   1   2   3   1   3   4   6   4   6   3
         * 
         * WKT, we only need, indices of min & max element to cal the min sub-array between those
         * So, we will take 4 variables
         *          minEle          maxEle      MinInd      MaxInd
         * we will iterate from right side
         *      - if we encounter any min  (or) max element in array, we will update minInd (or) maxInd
         *          - Now, if we encounter any max (or) min Element, we will update the ans var using minInd/maxInd
         *          - like, ans =  minInd-i+1
         *      - We do this repeatedly
         * 
         * ex:              0   1   2   3   4   5   6   7   8   9       min = 1
         *          arr =   1   2   3   1   3   4   6   4   6   3       max = 6
         * 
         *      i       minInd      maxInd          Ans
         *      n       -1          -1              n       [Before starting the iteration]
         *      9       -1          -1              n
         *      8       -1          8               n
         *      7       -1          8               n
         *      6       -1          6               n
         *      5       -1          6               n
         *      4       -1          6               n       [ we didn't find any minInd until here. Since only maxInd]
         *      3       3           6               (6-3+1) = 4
         *      2       3           6               4
         *      1       3           6               4
         *      0       0           6               (6-0+1) = 6 && min(4,6) = 4 [Final ans]
        */

        //Optimised Code
        int minInd = -1;
        int maxInd = -1;
        if (min_Element == max_Element) {
            closest = 1;
        }
        else {
            for (int i=n-1; i>=0; i--) {
                if (arr_3[i] == min_Element) {
                    minInd = i;
                    if (maxInd != -1)
                        closest = Math.min(closest, maxInd-i+1);
                }
                if (arr_3[i] == max_Element) {
                    maxInd = i;
                    if (minInd != -1)
                        closest = Math.min(closest, minInd-i+1);
                }
            }
        }
        System.out.println(closest);
        /*
         * TC = O(N)
         * SC = O(1)
        */


    }
}
