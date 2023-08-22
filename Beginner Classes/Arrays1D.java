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
         * Ans: At line 9 & 12 repectively
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
         *      WKT, birth of c took place at line 23
         *      Death of c is the line where it encounters the closing curly brace.
         *      So, var c will be ceases to exist (or) deleted from memory outside of line 25
         *      Therefore, death of var c is at line 25 & birth is at line 23.
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
    }
}
