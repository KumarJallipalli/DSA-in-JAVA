import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1D {
    public static void main(String[] args) {
        
        /*                          DAY - 09
         * continue → exits/skips the current iteration
         * break → exits the current loop
         * return → exits the current function
        */

        /*                          
         * Q1: Given an Array A[] of size N, Search for an element K
         * Return "true" if present in array else "false"
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(searchElement(arr, k));

        /*
         * Q2: Given an array A[], return the frequency of element k from array
        */
        System.out.println(countFrequency(arr, k));

        /*
         * Q3: Given an array A[], return "true" if diff between any adjacents elements is k 
         * [adjacent elements means only left -> right flow]
         * A:   3, 8, 4, 2, 9   ||    k = -7
         *      true: -> 2 - 9 = -7
        */
        System.out.println(adjacentDiff(arr, k));

        /*
         * ArrayList:
         *  -The biggest problem with arrays is they are static. i.e., 
         *      - size is pre-defined & cannot be increased.
         *  -ArrayList solves that problem by being dynamic.
         * 
         * Operaions:
         *      - arr.add() -> adds the elemnet at the end
         *      - arr.get(index) -> returns the element at the index
         *      - arr.set(index, value) -> updates the element at the index
         *      - arr.sum() -> gives the size of ArrayList;
        */

        //How to take input array from user using ArrayList
        n = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i=0; i<n; i++) {
            al.add(sc.nextInt());
        }
        for (int i=0; i<n; i++) {
            System.out.print(al.get(i) +" ");
        }
        System.out.println();

        //Write a function to return the sum of ArrayList elements
        System.out.println("Sum of the ArrayList Elements is : " + sumArrayList(al));

        //Write a function to return list of all positive elements
        ArrayList<Integer> ans = positiveElementsList(al);
        System.out.print("Positive Elements from ArrayList are : ");
        for (int i=0; i<ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

        //Write a function to check whether elements are in ascending order
        System.out.println(isAscending(al));

        /*
         * Function to return list of elements which appear only once
         * A[] = 2 0 -1 0 9 -1 9 8 0
         * ans: [2, 8] -> Appear only once
        */
        ArrayList<Integer> ans2 = appearOnce(al);
        for (int i=0; i<ans2.size(); i++) {
            System.out.print(ans2.get(i) + " ");
        }

        //Function to convert binary to decimal number
        System.out.println(binaryToDecimal(1011));

        //End of MAIN function
    }

    /*
     * All the functions of Array are defined from here
    */

    public static boolean searchElement (int arr[], int k) {
        for (int i=0; i<arr.length; i++) {
            if(arr[i] == k)
                return true;
        }
        return false;
    }

    public static int countFrequency (int arr[], int k) {
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i] == k)
                count++;
        }
        return count;
    }

    public static boolean adjacentDiff (int arr[], int k) {
        for (int i=0; i<arr.length-1; i++) {
            if( arr[i]-arr[i+1] == k)
                return true;
        }
        return false;
    }

    /*
     * All the ArrayList functions are defined here
    */
    public static int sumArrayList (ArrayList<Integer> al) {
        int sum = 0;
        for (int i=0; i<al.size(); i++) {
            sum += al.get(i);
        }
        return sum;
    }

    public static ArrayList<Integer> positiveElementsList(ArrayList<Integer> al) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0; i< al.size(); i++) {
            if (al.get(i) > 0) {
                ans.add(al.get(i));
            }
        }
        return ans;
    }

    public static boolean isAscending (ArrayList<Integer> al) {
        for (int i=0; i<al.size()-1; i++) {
            if( al.get(i) > al.get(i+1))
                return false;
        }
        return true;
    }

    public static ArrayList<Integer> appearOnce (ArrayList<Integer> al) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i=0; i<al.size(); i++) {
            int count = 0;
            for (int j=0; j<al.size(); j++) {
                if ( al.get(i) == al.get(j) )
                    count++;
            }

            if (count == 11) 
                ans.add(al.get(i));
        }

        return ans;
    }

    //Extra Q's
    public static int binaryToDecimal (int n) {
        int ans = 0;
        int pow = 1;

        while (n!=0) {
            int rem = n%10;
            ans = ans + rem*pow;
            n = n/10;
            pow = pow*2;
        }

        return ans;
    }

    /*
     * Given an Integer N>=4, Find the 2 prime number with sum = N. 
     * If there exists 2 pairs, print whichever the smallest of 2. [[a,b] < [c,d]]
     *      7 -> [2,5]      ||  16 -> [5,11] & [3,13] => [3,13]
    */

}
