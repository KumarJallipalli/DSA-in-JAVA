import java.util.Scanner;

public class Arrays1D {
    public static void main(String[] args) {
        
        /*                              DAY - 08
         * SCOPE of Variables:
         *      It describes the range of lines of code where the variable is avaible to use.
        */

        int a;
        a = 10;

        int b;
        b = 20;

        /*
         * Can you say at which line the birth of variable a & b happened..?
         * Ans: At line 11 & 14 repectively
         *      The variables a & b will be allocated with some memory when they have been declared itself.
        */

        if (a == 10) {
            System.out.println(a);
            int c = 15;
            System.out.println(c);
        }

        /*
         * Now can you say the death/last availability of var c..?
         * Ans:
         *      WKT, birth of c took place at line 25
         *      Death of c is the line where it encounters the closing curly brace.
         *      So, var c will be ceases to exist (or) deleted from memory outside of line 26
         *      Therefore, death of var c is at line 26 & birth is at line 25.
        */

        /*
         * The range of lines of code between the birth & death of a variable is called the Scope of a Variable.
         *      Scope of a variable is not the entire range of { }
         *      But it is the range of birth & death of that variable, which lies within { }.
         *      i.e., why we say, Scope is defined within curly braces, but the curly braces are not the actual scope of a variable.
        */

        /*
         * WKT, functions also have curly braces & it may also contains some variables.
         *      But for the same above reason, we can say that:
         *      "A variable is never local to it's function But local to it's braces"
        */

        /*
         * **Scope of a function**:
         * Here we can see the sum function with parameters int a & int b.
         *  - Scope of parameters of the sum function which are a & b is actually the curly braces & lifetime of the function
         *  - Scope of the function will be dependent on both function’s & it’s classes access modifier.
        */

        /*
         * **Compile-Time vs Run-Time Error:**
         *  - Compile-Time error → Syntax errors occurred during compilation.
         *  - Run-Time errors → errors occurred during code execution [which is after compilation]
         *      - ex: int x=1, y=0; sop(x/y) ⇒ results in mathematical exception which will be encountered during code execution.
         *      - Time Exceeding error is not run time or compile time error.
        */

        /*
         * Arrays : 
         *      - It is a Data Structure [DS is a way of organising the data, so that it can be accessed & updated efficiently]
         *      - It is the organised collection of similar items.
         *      - here, items -> data types || organised -> similar data types will be organised to form a collection of data
         *      - Arrays uses indices to organise the data
         *          - Indices/Indexes -> It specifies the position of an array element
         *      -To iterate over the array, we need length of the array
         *          -array_name.length -> gives the length of the array
        */

        //Q1: Take an array as input from user & print it's max.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        //This is the important step as If we assign "0", it will work only for +ve numbers
        int maxElement = arr[0];
        //As we have assigned arr[0] to maxElement, we can itearte from i=1, instead of i=0
        for (int i=1; i<n; i++) {
            if(arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        System.out.println("Max Element : " + maxElement);

        /*
         * Q2: Write a function to return max & min element of an array
         *      This helps us to learn
         *      1. How to take an array as parameter in a function
         *      2. How to return an array from a function.
        */
        int ans[] = minMaxElements(arr);
        System.out.println("Minimun element of the array = "+ans[0]);
        System.out.println("Maximun element of the array = "+ans[1]);

        //Q3: Write a function to convert decimal number to binary number
        System.out.println(binary(7));
    }

    //function to find min & max elements of an array
    public static int[] minMaxElements (int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i=1; i<arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];
        }

        int ans[] = {min, max};
        return ans;
    }

    //function to convert decimal number to binary number
    public static int binary (int n) {
        int ans = 0;
        int position = 1;
        while (n!=0) {
            int rem = n%2;
            ans = ans + rem*position;
            position = position*10;
            n = n/2;
        }
        return ans;
    }
}
