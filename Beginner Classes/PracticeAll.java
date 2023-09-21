import java.util.Scanner;

public class PracticeAll {
    public static void main(String[] args) {
        /*
         * Practice of All Q's from Beginner DSA Course
        */

        Scanner sc = new Scanner(System.in);

        //--------------------- INTRO CLASS ----------------------------

                // System.out.println(10 + 20 + "Hello");
                // System.out.println("Hello" + 10 + 20);

        //--------------------- IfElse Class ---------------------------

                // long l = 10000000000l;
                // System.out.println((int)l);
        //In above, Aa the value of l is more than the int can hold, java will give some random value as O/P


        //Q1: Check if person is eligible to Vote
                // System.out.println("Please Enter your Age : ");
                // int age = sc.nextInt();

                // if (age >= 18) {
                //     System.out.println("You are Eligible to Vote");
                // }
                // else 
                //     System.out.println("You are NOT Eligible to Vote");


        //Q2:Given Two numbers, Find the max of them
                // System.out.println("Please Enter your 1st Number : ");
                // int a = sc.nextInt();
                // System.out.println("Please Enter your 2nd Number : ");
                // int b = sc.nextInt();

                // if (a > b) 
                //     System.out.println(a + " is the Maximum of both");
                // else if (b > a)
                //     System.out.println(b + " is the Maximum of both");
                // else 
                //     System.out.println("Both are Equal");

        
        /* Q3:
         * Read the temp of a person & print if he has fever or not
         *      optimal temp -> [98.2, 98.9] -> Person doesn't have fever
         *      ex1: 105.9 -> person has fever
         *      ex2: 94.2 -> person has a low temp
        */
                // System.out.println("Please Enter the Body Temperature :");
                // float temp = sc.nextFloat();

                // if (temp < 98.2)
                //     System.out.println("Person has a Low Temp");
                // else if (temp <= 98.9)
                //     System.out.println("Person has NO Fever");
                // else 
                //     System.out.println("Person has Fever");
        
        
        /* Q5:
         * Read the spO2 levels of a person & print if the person's oxygen levels is
         *      Normal - [96 - 100]
         *      Slightly below normal - [90 - 95]
         *      Alarmingly below Normal - [ < 90 ]
        */
                // System.out.println("Please Enter the Person's Oxygen Level");
                // int spO2 = sc.nextInt();

                // if (spO2 < 90) 
                //     System.out.println("Alarmingly below Normal");
                // else if (spO2 < 96) {
                //     System.out.println("Slightly below Normal");
                // }
                // else if (spO2 <= 100) {
                //     System.out.println("Normal");
                // }
                // else {
                //     System.out.println("Invalid Number..!, Please enter a number less than 101");
                // }


        //Q6: Given a Number, check whether it is Even or Odd
                // System.out.println("Please Enter an Integer Number to check Even or Odd");
                // int n = sc.nextInt();

                // if (n%2 == 0) {
                //     System.out.println(n + " is Even Number");
                // }
                // else {
                //     System.out.println(n + " is Odd Number");
                // }


        /*Q7: [AMAZON]
         * Given a Number, print 
         *      "Fizz" if it is divisible by 3
         *      "Buzz" if it is divisible by 5
         *      "FizzBuzz" if it is divisible by both 3 & 5
        */
                // System.out.println("Please Enter an Integer Number");
                // int n = sc.nextInt();

                // if ( n%15 == 0 ) {
                //     System.out.println("FizzBuzz");
                // }
                // else if (n%5 == 0) {
                //     System.out.println("Buzz");
                // }
                // else if (n%3 == 0) {
                //     System.out.println("Fizz");
                // }
                // else {
                //     System.out.println("Not a multiple of 5 or 6");
                // }


        //--------------------------- WHILE CLASS --------------------------------------
        /*                              DAY - 03
         *--QUESTION--
         * Given an integer A denoting the amount of units of electricity consumed, you have to calculate the electricity bill (in Rs.) with the help of below charge rates
            For first 50 units Rs. 0.50/unit 
            For next 100 units Rs. 0.75/unit
            For next 100 units Rs. 1.20/unit
            For unit above 250 Rs. 1.50/unit
            An additional surcharge of 20% is added to the bill.

        NOTE: As the electricity bill can have any real value (floating point), you have to tell/print the floor value of the bill.

        Floor value of a floating point is the closest integer less than or equal to that value. For eg, Floor value of 2.91 is 2.

        Problem Constraints
        1 <= A <= 500
        */
                // System.out.println("Please Enter an Ineger Number : ");
                // int A = sc.nextInt();
                // double cal;

                // if ( A <= 50 ) {
                //     cal = 50 * 0.50;
                // } 
                // else if (A <= 150) {
                //     cal = 50*0.5 + (A-50)*0.75;
                // }
                // else if (A <= 250) {
                //     cal = 50*0.5 + 100*0.75 + (A-150)*1.2;
                // }
                // else {
                //     cal = 50*0.5 + 100*0.75 + 100*1.2 + (A-250)*1.5;

                // }

                // int bill = (int)(cal*1.2);
                // System.out.println("Total Electricity Bill is : " + bill);


        //Q1: Print 1st n ODD natural numbers
                // int n = sc.nextInt();

                // int i = 1;
                // int count = 1;
                // while (count <= n) {
                //     if (i%2 == 1) {
                //         System.out.print(i + " ");
                //         count++;
                //     }
                //     i++;
                // }
                // System.out.println();

                // // But the above code is not optimal, as it considers all iterations
                // i = 1;
                // count = 1;
                // while (count <= n) {
                //     System.out.print(i + " ");
                //     i = i+2;
                //     count++;
                // }
                // System.out.println();


        //Q2: print all multiples of 4 less than 50
                // int i = 4;
                // while (i <= 50) {
                //     System.out.print(i + " ");
                //     i = i+4;
                // }
                // System.out.println();


        //Q3: Print all perfect square from 1 -> N [V.Imp]
                // System.out.println("Please Enter a number to print all perfect squares upto it : ");
                // int N = sc.nextInt();
                // int i = 1;
                // while (i*i <=N) {
                //     System.out.print(i*i + " ");
                //     i++;
                // }
                // System.out.println();

        //-------------------------- FOR LOOP CLASS ----------------------------------------------
        //Q1: Given a number, print all the digits
                // System.out.println("Please Enter a Number to prints it's digits : ");
                // int N = sc.nextInt();

                // if ( N == 0 ){
                //     System.out.println(0);
                // }
                // else {
                //     if ( N < 0 ){
                //         N = N * -1;
                //     }
                //     for (int i=0; N!=0; i++) {
                //         System.out.print(N%10 + " ");
                //         N = N/10;
                //     }
                // }
                // System.out.println();


        //Q2: print sum of the digits of a number
                // System.out.println("Please enter a number to print sum of the digits");
                // int n = sc.nextInt();
                // int sum = 0;

                // if (n < 0)
                // n = n * -1;
                // while (n != 0) {
                // sum += n%10;
                // n /= 10;
                // }
                // System.out.println("sum of the digits is : " + sum);


        /*
         * Q3: Given a number, Reverse it
         * ex:  6123 -> 3216
         *      270 -> 72
         *      100 -> 1
         * Constraints: No -ve numbers
        */
				// System.out.println("Please Enter a number to reverse it : ");
				// int n = sc.nextInt();

				// int ans = 0;
				// while (n != 0) {
				// 	ans = ans*10 + n%10;
				// 	n /= 10;
				// }
				// System.out.println("Reversed Number is : " + ans);


        //Q5: Print all the factors of N that lie in the range [1, N]
				// System.out.println("Please enter a number to find it's factors");
				// int N = sc.nextInt();

				// for (int i=1; i<=N; i++) {
				// 	if (N%i == 0) {
				// 		System.out.print(i + " ");
				// 	}
				// }
				// System.out.println();


        //Q6: Write code to check if N is prime..?
				// System.out.println("Please Enter a Number to check prime : ");
				// int n = sc.nextInt();

				// boolean flag = true;
				// for (int i=2; i<n; i++) {
				// 	if (n%i == 0) {
				// 		flag = false;
				// 		break;
				// 	}
				// }

				// if (flag) {
				// 	System.out.println(n + " is a Prime Number");
				// }
				// else {
				// 	System.out.println(n + " is NOT a Prime Number");
				// }


		// Q7: Will the below code work..?
        // int i = 10;
        // while (i--) {
        //     System.out.print(i + " ");
        // }

		//---------------------------------- PATTERNS_1 Class ----------------------------------
		/*                              DAY - 05                           
         * Q1: Given T testcases, each testcase contains an integer in the input
         *      For each test case print 1st & last digits
         * 
         *  T testcases: Run the code which works for 1 testcase T times
        */
				// System.out.println("Please Enter a number for # of TC's : ");
				// int T = sc.nextInt();

				// for (int i=0; i<T; i++) {
				// 	System.out.println("Please Enter a number to find it's 1st & last digits :");
				// 	int n = sc.nextInt();

				// 	int lastDigit = n%10;
				// 	int firstDigit = 0;
				// 	while (n != 0) {
				// 		firstDigit = n%10;
				// 		n /= 10;
				// 	}

				// 	System.out.println("First Digit is :" + firstDigit);
				// 	System.out.println("Last Digit is : "+ lastDigit);
				// }


        //Q2: Given N, print a square of * of size N [N*N]
				// System.out.println("Please Enter a Number to print it's square star pattern");
				// int n = sc.nextInt();

				// for (int i=0; i<n; i++) {
				// 	for (int j=0; j<n; j++) {
				// 		System.out.print("* ");
				// 	}
				// 	System.out.println();
				// }


        //Q3: Given N,M print a rectangle of size N*M
				// System.out.println("Please enter a value for N-rows :");
				// int N = sc.nextInt();
				// System.out.println("Please enter a value for M-columns :");
				// int M = sc.nextInt();

				// for (int i=0; i<N; i++) {
				// 	for (int j=0; j<M; j++) {
				// 		System.out.print("* ");
				// 	}
				// 	System.out.println();
				// }


		/*
         * Q4: Given N, print the following pattern
         * N = 3    *               N = 5   *
         *          * *                     * *
         *          * * *                   * * *
         *                                  * * * *
         *                                  * * * * *
        */
				// int n = sc.nextInt();

				// for (int i=1; i<=n; i++) {
				// 	for (int j=1; j<=i; j++) {
				// 		System.out.print("* ");
				// 	}
				// 	System.out.println();
				// }


        /*
		 * Q5: reverse of above pattern
		 * N = 3	* * *			N = 5	* * * * *
		 * 			* *						* * * *
		 * 			*						* * *
		 * 									* *
		 * 									*
		*/

		/*
		 * ANS:
		 * 	N = 3						N = 5
		 * 	rows	cols	Total		rows	cols	Total
		 * 	1		3		4			1		5		6
		 * 	2		2		4			2		4		6
		 * 	3		1		4			3		3		6
		 * 								4		2		6
		 * 								5		1		6
		 * 					= N+1						= N+1
		 * 
		 * 	ans = Total - rows = cols [Stars]
		 * 		= (N+1) - i
		 * 		= j
		*/
				// int N = sc.nextInt();

				// for (int i =1; i<=N; i++) {
				// 	for (int j=1; j<=(N+1-i); j++) {
				// 		System.out.print("* ");
				// 	}
				// 	System.out.println();
				// }


		/*
         * Q6: Given N, print the following pattern
         * N = 4    *               N = 6   *
         *          * 2                     * 2
         *          * 2 *                   * 2 *
         *          * 2 * 4                 * 2 * 4
         *                                  * 2 * 4 *
         *                                  * 2 * 4 * 6
        */
				// int N = sc.nextInt();

				// for (int i=1; i<=N; i++) {
				// 	for (int j=1; j<=i; j++) {
				// 		if (j%2 == 1) {
				// 			System.out.print("* ");
				// 		}
				// 		else {
				// 			System.out.print(j + " ");
				// 		}
				// 	}
				// 	System.out.println();
				// }


		/*
         * Q7: Given N, print the following pattern [- == 1 space]
         *  N = 3               N = 5
         *      * - - *           * - - - - *
         *      * - - *           * - - - - *
         *      * - - *           * - - - - *
         *                        * - - - - *
         *                        * - - - - *
        */
				// int N = sc.nextInt();

				// for (int i=1; i<=N; i++) {
				// 	System.out.print("* ");
				// 	for (int j=1; j<N; j++) {
				// 		System.out.print("- ");
				// 	}
				// 	System.out.println("*");
				// }


		/*
         * Q7: Given N, print the following pattern ['-' == 1 space]
         *  N = 3               N = 5
         *      * - - *           * - - - - *
         *      * - *             * - - - *
         *      * *               * - - *
         *                        * - *
         *                        * *
        */
				// int N = sc.nextInt();

				// for (int i=1; i<=N; i++) {
				// 	System.out.print("* ");
				// 	for (int j=1; j<=N-i; j++) {
				// 		System.out.print("- ");
				// 	}
				// 	System.out.println("*");
				// }


		/*
         * Q8: Given N, print the following pattern ['-' == 1 space]
         *  N = 3               N = 5
         *      - - *               - - - - *
         *      - * *               - - - * *
         *      * * *               - - * * *
         *                          - * * * *
         *                          * * * * *
        */
				// int N = sc.nextInt();

				// for (int i=1; i<=N; i++) {
				// 	//To print Spaces
				// 	for (int j=1; j<=N-i; j++) {
				// 		System.out.print("- ");
				// 	}
				// 	//To print stars
				// 	for (int j=1; j<=i; j++) {
				// 		System.out.print("* ");
				// 	}
				// 	System.out.println();
				// }


		//-------------------------------- FUNCTIONS CLASS ----------------------------
    	//Write a function to print primes till N
				// int N = sc.nextInt();
				// printPrimes(N);


		//-------------------------------- ARRAYS CLASS -------------------------------
        //Q1: Take an array as input from user & print it's max.
				// int n = sc.nextInt();
				// int[] arr = new int[n];

				// for (int i=0; i<n; i++) 
				// 	arr[i] = sc.nextInt();

				// int minValue = arr[0], maxValue = arr[0];
				// for (int i=0; i<arr.length; i++) {
				// 	if (arr[i] > maxValue) {
				// 		maxValue = arr[i];
				// 	}
				// 	if (arr[i] < minValue) {
				// 		minValue = arr[i];
				// 	}
				// }

				// System.out.println("Min Element is : " + minValue);
				// System.out.println("Max Element is : " + maxValue);


		/*
         * Q2: Write a function to return max & min element of an array
         *      This helps us to learn
         *      1. How to take an array as parameter in a function
         *      2. How to return an array from a function.
        */
				// int N = sc.nextInt();
				// int[] arr1 = new int[N];

				// for (int i=0; i<N; i++) 
				// 	arr[i] = sc.nextInt();

				// int[] ans = minMax(arr1);
				// System.out.println("Min Element is : " + ans[0]);
				// System.out.println("Max Element is : " + ans[1]);


        //Q3: Write a function to convert decimal number to binary number [V.V.Imp]
		int n = sc.nextInt();
		System.out.println(decimalToBinary(n));

    }

	//---------------------------------- All the Function definitions are written here -------------

	//Function to print Prime Numbers till N
	public static void printPrimes (int N) {
		for (int i=2; i<=N; i++) {
			if(isPrime(i))
				System.out.print(i + " ");
		}
	}

	//Funtion to check a Prime Number 
	public static boolean isPrime (int N) {
		for (int i=2; i<N; i++) {
			if (N%i == 0) {
				return false;
			}
		}
		return true;
	}

	//Funtion to take an array as input & return it's min & max elements
	public static int[] minMax (int[] arr) {
		int minValue = arr[0], maxValue = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}

		// int[] ans = new int[2];
		// ans[0] = minValue;
		// ans[1] = maxValue;
		int[] ans = {minValue, maxValue};

		return ans;
	}

	//Function to convert Decimal Number to Binary Number [V.V.Imp]
	/*
	 * N = 10
	 * 		N	    Next N (Q)	rem
	 * 		10	->	5	0       [ 1's Position]
	 * 		5	->	2	1       [ 10's Position]
	 * 		2	->	1	0       [ 100's Position]
         *              1       ->      0       1       [ 1000's Position]
         * 
         * - Now, rem values should be printed in reverse order.
         * - For this, we use the position of digits & rem values
         * - we update the postion with 10 & then multiply with rem, so that it will have the correct convertion
	*/
	public static int decimalToBinary (int N) {
		int ans = 0;
		int position = 1;

		while (N != 0) {
			int rem = N%2;
			ans = ans + position*rem;
			position = position*10;
			N = N/2;
		}

		return ans;
	}
        /*
         * Explanation [Dry run]
         *      N       rem     pos     ans     new N   new pos
         *      10      0       1       0       5       10
         *      5       1       10      10      2       100
         *      2       0       100     10      1       1000
         *      1       1       1000    1010    0       10000
         *      0 => BREAK
        */


}