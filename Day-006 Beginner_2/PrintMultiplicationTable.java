import java.util.Scanner;

public class PrintMultiplicationTable {
    /*
     * WAP to take inut number from user & print multiplication table of that number.
     * It should look exactly like " 5 x 1 = 5" [if n = 5]
    */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(n + " X " + i + " = " + n*i);
        }
     }
}
