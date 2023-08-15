import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        /*
         * Loops -> are the statements used to perform some repetitive tasks by controlling the flow of program.
         * Loops does this repetitive flow control using 3 parameters
            * Initialization -> It is the starting condition of loop
            * Condition -> It is the flow control for repetition of loop
            * Incrementation/Decrementation -> It is for getting out of loop
         * There are 3 types of loops
            * 1. while loop -> Used when we don;t know the No. of iterations.
            * 2. for loop -> Used when we know the No. of iterations.
            * 3. do-while loop [Similar to while loop, but executes the code block atleast one time]
        */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        //sum of N natural numbers using while loop
        int n=1, sum=0; //initialization
        while (n<=N) { //condition
            sum += n;
            n++; //incrementation
        }
        System.out.println(sum);

        //sum of N natural numbers using for loop
        sum = 0;
        for (int i=1; i<=N; i++) {
            sum += i;
        }
        System.out.println(sum);

        //sum of N natural numbers using do-while loop
        n=1; sum =0;
        do {
            sum += n;
            n++;
        } while (n <= N);
        System.out.println(sum);

    }
}
