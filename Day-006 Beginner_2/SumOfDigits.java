import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = N;

        int sum = 0;
        while (N != 0) {
            sum = sum + (N%10);
            N = N/10;
        }
        
        N = n;
        if (N > 0) {
            System.out.println(sum);
        }
        else {
            System.out.println(-sum);
        }
    }
}
