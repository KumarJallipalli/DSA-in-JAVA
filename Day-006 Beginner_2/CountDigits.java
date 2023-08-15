import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int digits = 0;
        if (N == 0) {
            System.out.println(1);
        }
        else {
            //This [ N != 0 ] works for both -ve & +ve numbers
            while (N != 0) {
            digits += 1;
            N = N/10;
            }
            System.out.println(digits);
        }
        
    }
}
