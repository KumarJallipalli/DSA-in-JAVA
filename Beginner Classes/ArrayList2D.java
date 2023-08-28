import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {

    public static void main(String[] args) {

        /*                              DAY - 011
        * 2D-ArrayList:
        * - WKT, 2D-Arrays => Array of Arrays
        * - similarly, 2D-ArrayList => ArrayList of ArrayLists
        *      - ArrayList <Integer> ⇒ ArrayList of Integers
        *      - ArrayList < ArrayList<Integer> > ⇒ ArrayList of ArrayLists of Integers
        * - Each ArrayList in 2D-AL can have different sizes. i.e., why we cannot call these matrices
        */

        //Initialization
        ArrayList< ArrayList<Integer> > al = new ArrayList< ArrayList<Integer>>() ;
        
        /*
        * Now, we need to add 1-D ArrayList of Integers as ArrayList to "al"
        * So, 1st we need to create an 1-D ArrayList of Integers and later added to 2-D ArrayList
        */
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1); arr1.add(2);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(3); arr2.add(4); arr2.add(5); arr2.add(6); 

        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(6);

        //Adding this 1-D AL's to 2-D AL
        al.add(arr1);
        al.add(arr2);
        al.add(arr3);

        /*
         * Make a 2D-AL using User Input
        */
        Scanner sc = new Scanner(System.in);

        //1st User input will be # of ArrayLists
        int n = sc.nextInt();
        ArrayList< ArrayList<Integer> > AL = new ArrayList<>();
        
        //Taking n ArrayLists as input
        for (int i=0; i<n; i++) {
            //Taking user input for # of elements to be added in each 1D-AL
            int m = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            //Adding elements to 1D-ArrayList
            for (int j=0; j<m; j++) {
                arr.add(sc.nextInt());
            }

            //Adding ArrayList to 2D-ArrayList
            AL.add(arr);
        }

        //Print 2D-ArrayList
        for (int i=0; i<AL.size(); i++) {
            //AL.get(i) = arr || AL.get(i).size() = arr.size() || AL.get(i).get(j) = arr.get(j)
            for (int j=0; j<AL.get(i).size(); j++) {
                System.out.print(AL.get(i).get(j) + " ");
            }
            System.out.println();
        }

        /*
         * Function to return 2D-AL of Identity Matrix with Funtion-Input n
        */
        ArrayList< ArrayList<Integer> > I = IdentityMatrix(5);
        for (int i=0; i<I.size(); i++) {
            for (int j=0; j<I.get(i).size(); j++) {
                System.out.print(I.get(i).get(j) + " ");
            }
            System.out.println();
        }

        /*
         * Write a function to return an array with the element Y inserted at X Index
         *  A = [1, 5, 8, -1, 3] | X = 2 | Y = 0
         *  A = [1, 5, 0, 8, -1, 3]
        */
        n = sc.nextInt();
        int[] A = new int[n];
        for (int i=0; i<n; i++)
            A[i] = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println("After Insertion of Element " + Y + " at Index " + X);
        int[] ans = insertionAtX(A, X, Y);
        for (int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    
    }

    //Function to return Tranpose of a 2D-Matix
    public static int[][] matrixTranspose (int[][] A) {
        /*
         *  A = [1, 2, 3]   A.length = n || A[0].length = m
         *      [4, 5, 6]   n = 2 | m = 3
         *  A^T =   [1, 4]
         *          [2, 5]  A^T.length = 3 = m || A^T[0].length = 2 = n
         *          [3, 6]  m = 3 | n = 2
         * 
         *  => A[i,j] = A^T[j,i]
        */
        int n = A.length;
        int m = A[0].length;
        int[][] ans = new int[m][n];

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                ans[i][j] = A[j][i];
            }
        }
        return ans;
    }

    public static ArrayList< ArrayList<Integer> > TransposeOfMatrix (ArrayList<ArrayList<Integer>> AL) {
        int n = AL.size();
        int m = AL.get(0).size();
        ArrayList< ArrayList<Integer> > ans = new ArrayList< ArrayList<Integer>>();

        for (int i=0; i<m; i++) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            //iterate over the elements of 1st,2nd... column & put those elements in 1D-ArrayList
            for (int j=0; j<n; j++) {
                arr.add(AL.get(j).get(i));
            }
            //Assing the whole 1D-AL into 2D-AL as rows
            ans.add(arr);
        }
        return ans;
    }

    //Function to return 2D-AL of Identity Matrix with Funtion-Input n
    public static ArrayList< ArrayList<Integer> > IdentityMatrix (int n) {
        ArrayList< ArrayList<Integer> > I = new ArrayList< ArrayList<Integer> >();

        for (int i=0; i<n; i++) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int j=0; j<n; j++) {
                if(i == j) {
                    arr.add(1);
                }
                else {
                    arr.add(0);
                }
            }
            I.add(arr);
        }

        return I;
    }

    //Function to return an array by inserting a new element Y in X Index
    public static int[] insertionAtX (int[] A, int X, int Y) {
        int[] ans = new int[A.length + 1];

        for (int i=0; i<X; i++) {
            ans[i] = A[i];
        }
        ans[X] = Y;
        for (int i=X; i<A.length; i++) {
            ans[i+1] = A[i];
        }

        return ans;
    }

        
}
