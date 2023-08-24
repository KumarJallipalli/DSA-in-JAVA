import java.util.Scanner;

public class ArratList {
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
         * Q3: Given an array A[], return "true" if diff between any adjacents elements is k [adjacent elements means only left -> right flow]
         * A:   3, 8, 4, 2, 9   ||    k = -7
         *      true: -> 2 - 9 = -7
        */
        System.out.println(adjacentDiff(arr, k));
    }

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
}
