public class Arrays_2D {
    public static void main(String[] args) {
        /*
         *                              Intermediate - 08
        */

        //--------------------------------------------------------------------------------------

        /*
         * Question - 1:
         * Given a matrix mat[N][M], print row-wise
         * ex:      
         *          3   8   9   2           O/P:        3 8 9 2
         *          1   2   3   6                       1 2 3 6
         *          4   10  11  17                      4 10 11 17
        */
        int[][] tempMat1 = { {3, 8, 9, 2}, {1, 2, 3, 6}, {4, 10, 11, 17} };
        int N = tempMat1.length;
        int M = tempMat1[0].length;
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                System.out.print(tempMat1[i][j] + " ");
            }
            System.out.println();
        }

        //------------------------------------------------------------------------------------------

        /*
         * Questin - 2:
         * Given Matrix mat[n][m], find the max column sum
         * ex:      0   1   2   3
         * 
         *     0     3   8   9   2           O/P: 23
         *     1     1   2   3   6                      
         *     2     4   10  11  8     
         *          ---------------
         *           8   20  23  16                 
        */
        int[][] tempMat2 = { {3, 8, 9, 2}, {1, 2, 3, 6}, {4, 10, 11, 8} };
        int n = tempMat2.length;
        int m = tempMat2[0].length;

        int maxSum = 0;
        for (int j=0; j<m; j++) {
            int sum = 0;
            for (int i=0; i<n; i++) {
                System.out.print(tempMat2[i][j] + " ");
                sum += tempMat2[i][j];
            }
            if(sum > maxSum)
                maxSum = sum;
            System.out.println();
        }
        System.out.println("MaxSum Column Sum = " + maxSum);
        /*
         * TC = O(N)
         * SC = O(1)
        */

        //---------------------------------------------------------------------------------------------------

        /*
         * Question - 3:
         * Given a mtarix mat[n][n], print it's diagonals [Both left to right & right to left]
         * ex:      0   1   2   3
         * 
         *   0      1   2   3   4       LR: (0, 0)                          RL:                         (0, 3)
         *   1      5   6   7   8                   (1, 1)                                      (1, 2)
         *   2      9   10  11  12                          (2, 2)                      (2, 1)
         *   3      13  14  15  16                                  (3, 3)       (3, 0)
        */
        int[][] tempMat3 = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} };
        int n3 = tempMat3.length;

        //Brute Force method
        System.out.print("Left to right diagonal Elements are : ");
        for (int i=0; i<n3; i++) {
            for (int j=0; j<n3; j++) {
                if (i == j)
                    System.out.print(tempMat3[i][j] + " ");
            }
        }
        System.out.println();

        System.out.print("right to left diagonal Elements are : ");
        for (int i=0; i<n3; i++) {
            for (int j=0; j<n3; j++) {
                if (i+j == n3-1)
                    System.out.print(tempMat3[i][j] + " ");
            }
        }
        System.out.println();
        /*
         * TC = O(N*N)
         * SC = O(1)
        */

        //Optimal method
        System.out.print("Left to right diagonal Elements are : ");
        for (int i=0; i<n3; i++) {
            System.out.print(tempMat3[i][i] + " ");
        }
        System.out.println();

        System.out.print("right to left diagonal Elements are : ");
        int p=0, q=n3-1;
        while (p<n3 && q>=0) {
            System.out.print(tempMat3[p][q] + " ");
            p++; q--;
        }
        System.out.println();
        /*
         * TC = O(N)
         * SC = O(1)
        */

        //-----------------------------------------------------------------------------------------------

        /*
         * Question - 4:
         * Given mat[n][m], Find all the diagonals going from right to left
         * ex:      mat[4][5]
         *          0 1 2 3 4
         *      0   / / / / /
         *           / / / /     
         *      1   / / / / /
         *           / / / /  
         *      2   / / / / /
         *           / / / /    
         *      3   / / / / /
         * 
         *  - Total 8 diagonals
         *  - All the diagonals start from 0th row (or) (n-1)th column
         *          - Total No. of diagonals = m + n [but 1 block is repeating twice in both i.e., index-4]
         *                                   = m + n - 1
        */

        /*
         * Ex:          0   1   2   3
         *        
         *      0       1   2   3   4
         *      1       5   6   7   8
         *      2       9   10  11  12
         *      3       13  14  15  16  
         *      4       17  18  19  20
         */
        int[][] tempMat4 = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20} };
        int n4 = tempMat4.length;
        int m4 = tempMat4[0].length;

        //To print the row-wise[1s-row] Lef-Right diagonal elements
        for (int j=0; j<m4; j++) {        //This is iterating over each element in row to print i's diagonal elements
            //Actual code to print the diagonal elements
            int x = 0, y = j;
            while (x<n4 && y>=0) {
                System.out.print(tempMat4[x][y] + " ");
                x++; y--;
            }
            System.out.println();
        }

        //To print the column-wise [last-column] Lef-Right diagonal elements
        for (int i=1; i<n4; i++) {
            int x = i, y = m4-1;
            while (x<n4 && y>=0) {
                System.out.print(tempMat4[x][y] + " ");
                x++; y--;
            }
            System.out.println();
        }
        /*
         * TC = O(N*M)
         * SC = O(1)
         *      - The above code is simply prining all the elements, but in diagonal wise
        */

        //----------------------------------------------------------------------------------------------

        /*
         * Question - 5:
         * Given a matrix mat[N][N], Find the Transpose in place. [For, Square Matrix]
         *      - i.e., mat[N][N] itself shoudl change && SC = O(1)
        */
        int[][] tempMat5 = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} };
        int n5 = tempMat5.length;

        for (int i=0; i<n5; i++) {
            for (int j=i+1; j<n5; j++) {
                int temp = tempMat5[i][j];
                tempMat5[i][j] = tempMat5[j][i];
                tempMat5[j][i] = temp;
            }
        }

        System.out.println("Transpose of the matrix is : ");
        for (int i=0; i<n5; i++) {
            for (int j=0; j<n5; j++) {
                System.out.print(tempMat5[i][j] + " ");
            }
            System.out.println();
        }
        /*
         * TC = O(N*N)
         * SC = O(1)
        */

        //-----------------------------------------------------------------------------------------------

        /*
         * Question - 6:
         * Given mat[n][n], Rotate i 90 degree clockwise with SC = O(1)
         * ex:
         *          1   2   3   4   5       ->      21  16  11  6   1      
         *          6   7   8   9   10              22  17  12  7   2
         *          11  12  13  14  15              23  18  13  8   3
         *          16  17  18  19  20              24  19  14  9   4
         *          21  22  23  24  25              25  20  15  10  5
         * 
         * The same marix after ranspose will be 
         *          1   6   11  16  21
         *          2   7   12  17  22
         *          3   8   13  18  23
         *          4   9   14  19  24  
         *          5   10  15  20  25
         * 
         * If you observe the above Transpose matrix, it is reverse of the rotated matrix.
        */
        int[][] tempMat6 = { {1, 2, 3, 4, 5}, 
                             {6, 7, 8, 9, 10}, 
                             {11, 12, 13, 14, 15}, 
                             {16, 17, 18, 19, 20},
                             {21, 22, 23, 24, 25} };
        int n6 = tempMat6.length;

        //Tranpose of the marix
        for (int i=0; i<n6; i++) {
            for (int j=i+1; j<n6; j++) {
                 int temp = tempMat6[i][j];
                 tempMat6[i][j] = tempMat6[j][i];
                 tempMat6[j][i] = temp;
            }
        }

        //Reversing the matrix row-wise to get the roated matrix
        for (int i=0; i<n6; i++) {
            int s = 0, e = n6-1;
            while (s < e) {
                int temp = tempMat6[i][s];
                tempMat6[i][s] = tempMat6[i][e];
                tempMat6[i][e] = temp;
                s++; e--;
            }
        }
        System.out.println("90 degree Roatated matrix is : ");
        for (int i=0; i<n6; i++) {
            for (int j=0; j<n6; j++) {
                System.out.print(tempMat6[i][j] + " ");
            }
            System.out.println();
        }
        /*
         * TC = O(N*N)
         * SC = O(1)
        */

        //------------------------------------------------------------------------------------------------


        /*
         * Quesion - 7:
         * Given mat[n][n], print all the boundaries in clockwise
         * ex:
         *          1   2   3   4   5       ->      1   2   3   4      
         *          6   7   8   9   10              5   10  15  20
         *          11  12  13  14  15              25  24  23  22
         *          16  17  18  19  20              21  16  11  6
         *          21  22  23  24  25 
         * 
         * Ans: 1   2   3   4   5   10  15  20  25  24  23  22  21  16  11  6
         * 
         * Explanation:
         *      - we will print the 1st 4 terms from each side [in general, (n-2) terms]
         *      - i.e., top side -  [0, 0] -> [0, n-2]      -> (n-1) terms
         *      - right side -      [0, n-1] -> [n-2, n-1]  -> (n-1) terms
         *      - bottom side -     [n-1, n-1] -> [n-1, 1]  -> (n-1) terms
         *      - left side -       [n-1, 0] -> [1, 0]      -> (n-1) terms
         *      - That means, we have to loop (n-1) terms in each side with varying indices
        */
        int[][] tempMat7 = { {1, 2, 3, 4, 5}, 
                             {6, 7, 8, 9, 10}, 
                             {11, 12, 13, 14, 15}, 
                             {16, 17, 18, 19, 20},
                             {21, 22, 23, 24, 25} };
        int n7 = tempMat7.length;

        int i = 0, j = 0;
        System.out.println("Boundary Elements are : ");
        //Printing Top-Side (n-1) terms 
        for (int k=1; k<n7; k++) {
            System.out.print(tempMat7[i][j] + " ");
            j++;
        }
        // Now, after (n-1) iterations, i = 0 && j = n-1

        //Printing right-Side (n-1) terms
        for (int k=1; k<n7; k++) {
            System.out.print(tempMat7[i][j] + " ");
            i++;
        }
        // Now, after (n-1) iterations, i = n-1 && j = n-1

        //Printing bottom-Side (n-1) terms
        for (int k=1; k<n7; k++) {
            System.out.print(tempMat7[i][j] + " ");
            j--;
        }
        // Now, after (n-1) iterations, i = n-1 && j = 0

        //Printing left-Side (n-1) terms
        for (int k=1; k<n7; k++) {
            System.out.print(tempMat7[i][j] + " ");
            i--;
        }
        // Now, after (n-1) iterations, i = 0 && j = 0
        /*
         * TC = O(N)
         * SC = O(1)
        */

        //------------------------------------------------------------------------------------------------------

        /*
         * Question - 8:
         * Given mat[n][n], Print Spirally
         * ex:      
         *          1   2   3   4
         *          5   6   7   8
         *          9   10  11  12
         *          13  14  15  16
         * 
         * Ans: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
         *
         * Observations: 
         *  - It is same as printing the boundaries,
         *  - But each time, when we finish with outer boundary, we need to go inside & print the inner one
         *  - Once we move from outer to inner boundary
         *          - i & j will be incremented by 1    &&  N = N-2
         *  - And there will be 1 edge case which will fail is when N is ODD
         *          - it will go inside but won't print anything
        */
        int[][] tempMat8 = { {1, 2, 3, 4, 5}, 
                             {6, 7, 8, 9, 10}, 
                             {11, 12, 13, 14, 15}, 
                             {16, 17, 18, 19, 20},
                             {21, 22, 23, 24, 25} };
        int n8 = tempMat7.length;

        i = 0; j = 0;
        System.out.println("Elements in Spiral way are : ");
        while (n8 > 0) {
            //Printing Top-Side (n-1) terms 
            for (int k=1; k<n8; k++) {
                System.out.print(tempMat7[i][j] + " ");
                j++;
            }
            // Now, after (n-1) iterations, i = 0 && j = n-1

            //Printing right-Side (n-1) terms
            for (int k=1; k<n8; k++) {
                System.out.print(tempMat7[i][j] + " ");
                i++;
            }
            // Now, after (n-1) iterations, i = n-1 && j = n-1

            //Printing bottom-Side (n-1) terms
            for (int k=1; k<n8; k++) {
                System.out.print(tempMat7[i][j] + " ");
                j--;
            }
            // Now, after (n-1) iterations, i = n-1 && j = 0

            //Printing left-Side (n-1) terms
            for (int k=1; k<n8; k++) {
                System.out.print(tempMat7[i][j] + " ");
                i--;
            }
            // Now, after (n-1) iterations, i = 0 && j = 0

            //If the marix is ODD
            if (n8 == 1) {
                System.out.print(tempMat8[i][j] + " ");
            }
            
            //So, need to increament i, j && N
            i++; j++;
            n8 -= 2;
        }
        /*
         * TC = O(N*N)      //Since, we are prining all elements
         * SC = O(1)
        */
    }
}
