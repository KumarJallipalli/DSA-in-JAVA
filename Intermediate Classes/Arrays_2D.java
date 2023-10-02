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
         *  - All the diagonals start from oth row (or) (n-1)th column
         *          - Total No. of diagonals = m + n [but 1 block is repeating twice in both]
         *                                   = m + n - 1
        */

    }
}
