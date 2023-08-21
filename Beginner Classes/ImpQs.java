import java.util.Scanner;

public class ImpQs {
    public static void main(String[] args) {
        /*                                  DAY - 05
         * REVISION:
         * What will be the output of the following code, if input is:
         *      2
         *      Hello World
        */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.nextLine();

        /*
         * It will give only " 2 " as output & then for str it will be having an empty string.
         * Since it reads the entire line right after 2, which is an empty string. [as we pressed enter]
        */
        System.out.println(n);
        System.out.println(str);

        /*
         * Q1: Find the LCM of 2 Numbers A & B
         *      ex: A = 4 & B = 3
         *  multiples of A = 4, 8, 12, 16...
         *  multiples of B = 3, 6, 9, 12, 15...
         *  -both of them has 12 as common multiple => LCM = 12
        */
        int A = scan.nextInt();
        int B = scan.nextInt();

        /*
         * Ans:
         * in the given ex, LCM of 4 & 3 = 12
         * 12%A == 0 & 12%B == 0
         * That means, there lies a number in both multiples which can be divided by both A & B
         * So, we cal multiples of any one number & if any number exits in those numbers which is divisible by B
         * Then that number is the LCM
         */
        for (int i = A; true; i = i+A) {
            if(i%B == 0) {
                System.out.println("LCM of " + A +" & " + B + " is : " + i);
                break;
            }
        }

        //Q2: Print 1st & last digits of a number N
        n = scan.nextInt();
        int lastDigit = n%10;

        /*
         * if n     =   9568
         *    n/10  =   956
         *    n/10  =   95
         *    n/10  =   9   -> Last digit will always be < 10
         * 
         * So, we will run the loop until n>=10 & exits when n<10
        */
        while (n >= 10) {
            n = n/10;
        }
        System.out.println("First digit of the number is :"+n);
        System.out.println("Last digit of the number is : "+ lastDigit );

        /*
         * Q3: Find the HCF of 2 numbers A & B
         *  A = 10
         *  Factors -> 1, 2, 5, 10  => always lies between [1, 10]
         *  B = 15
         *  Factors -> 1, 3, 5, 15  => always lies between [1, 15]
         *  therefore HCF = 5
        */

        int HCF = 1; //[Since, HCF for 2 prime Numbers is always "1"]
        /*
         * Ans:
         * In case of LCM -> A common "multiple" is being divided by both A & B
         * But in HCF -> it's the opposite
         *      A common "factor" will be able to divide both A & B
         *      So, we need to go through each number which divides both A & B
         *      Then, find the max of those numbers[Factors]
         * NOTE: HCF will alwas lie between [1, min(A,B)]
         *       i.e., why the loop condition is this
        */
        for (int i=1; i <= Math.min(A, B); i++ ) {
            if(A%i == 0 && B%i == 0) {
                HCF = i;
            }
        }
        System.out.println("HCF of "+A+" & "+B+" is : "+HCF);

        /*
         * Q4: Check whether a number N is Armstrong number or not
         *      Armstrong -> Sum of cubes of digits of N is equal to N
        */
        n = scan.nextInt();
        int nCopy = n;
        int sum = 0;

        while (n != 0) {
            int d = n%10;
            sum = sum + (d*d*d);
            n = n/10;
        }
        if (sum == nCopy) {
            System.out.println(nCopy + " is an Armstrong Numnber");
        }
        else {
            System.out.println(nCopy + " is NOT an Armstrong Number");
        }


    }
}
