import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        
        /*                              DAY - 010
         * 2D Arrays:
         *      - 2D arrays are the matrices, which consists of 1D array clubbed together'
         *      - ex: Chess, Sudoku, Digital Images, Theatre seating etc...
         *      - 2D array (or) matrix = Rows of Rows
         *      - A[rows][cols] = [row[0], row[1], row[2], ... row[n-1]]; => length = # of rows
         *      - row[0] = [A[0][0], A[0][1], A[0][2] ... A[0][n-1]]; -> 1st row => # of columns
         *          - i.e., why
         *          - A.length = # of Rows
         *          - A[0].length = # 0f Columns
        */

        /*
         * Q: Why can’t we able to read 2 user inputs using 2 different scanner objects..?
        */

        Scanner sc = new Scanner(System.in);

        /*
         * Q1: Write the code to print elements in 1st "row" of matrix
        */
        int n = sc.nextInt();
        int m = sc.nextInt();

        //Defining & initializing a 2D array
        int[][] arr = new int[n][m];
        //Taking user input for 2D array
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //printing the 1st row of 2D array 
        System.out.println("1st Row Elements of 2D Array");
        for (int j=0; j<m; j++) {
            System.out.print(arr[0][j] + " ");
        }
        System.out.println();

        /*
         * Q2: Write the code to print elements in 1st "column" of matrix
        */

        //printing the 1st column of 2D array 
        System.out.println("1st Column Elements of 2D Array");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i][0] + " ");
        }
        System.out.println();

        /*
         * Q3: Write the code to print elements in entire matrix
        */
        System.out.println("Row-Row-vise Elements of 2D Array");
        int sum = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        //Sum of the elements of the matrix
        System.out.println("Sum of the elements of a matrix is : " + sum);

        /*
         * Q4: Write the code to print elements in entire matrix column-wise [V.Imp]
        */
        System.out.println("Column-Column-vise Elements of 2D Array");
        sum = 0; //initializing to "0", since it is already calculated.
        for (int j=0; j<m; j++) {
            for (int i=0; i<n; i++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of the elements of a matrix is : " + sum);

        /*
         * Q5: Write a function to take 2 matrices A & B as input and return a matrix C.
         * Where C = A + B [All 3 matriices will have same rows & columns] 
        */
        System.out.println("Enter the # of ROws : ");
        int N = sc.nextInt();
        System.out.println("Enter the # of Columns : ");
        int M = sc.nextInt();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        System.out.println("Enter the Elements for Matrix A : ");
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the Elements for Matrix B :");
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        int[][] C = matrixSum(A, B);
        for (int i=0; i<C.length; i++) {
            for (int j=0; j<C[0].length; j++) {
                System.out.println(C[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * Q6: Write a function which returns 2nd largest element from 1D array
        */
        n = sc.nextInt();
        int[] P = new int[n];
        for (int i=0; i<n; i++) {
            P[i] = sc.nextInt();
        }
        System.out.println(secondLargestElement(P));

    }

    //Function to take 2 matrices A & B as input and return a matrix C
    public static int[][] matrixSum (int[][] A, int[][] B) {
        int C[][] = new int[A.length][A[0].length];
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    //Function to returns 2nd largest element from 1D array
    public static int secondLargestElement (int[] arr) {
        int max = arr[0];
        for (int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int ans = arr[0];
        for (int i=0; i<arr.length; i++) {
            if(arr[i] > ans && arr[i] != max) {
                ans = arr[i];
            }
        }
        return ans;
    }
}

