import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        
        /*--QUESTION--
         * Given an integer A denoting the amount of units of electricity consumed, you have to calculate the electricity bill (in Rs.) with the help of below charge rates
            For first 50 units Rs. 0.50/unit 
            For next 100 units Rs. 0.75/unit
            For next 100 units Rs. 1.20/unit
            For unit above 250 Rs. 1.50/unit
            An additional surcharge of 20% is added to the bill.

        NOTE: As the electricity bill can have any real value (floating point), you have to tell the floor value of the bill.

        Floor value of a floating point is the closest integer less than or equal to that value. For eg, Floor value of 2.91 is 2.

        Problem Constraints
        1 <= A <= 500
        */

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        float ans = 0;

        if (A <= 50) {
            ans = A*(0.5f);
        }
        else if (A <= 150) {
            ans = 50*(0.5f) + (A-50)*(0.75f);
        }
        else if (A <= 250) {
            ans = 50*(0.5f) + 100*0.75f + (A-150)*(1.2f);
        }
        else {
            ans = 50*(0.5f) + 100*0.75f + 100*1.2f + (A-250)*(1.5f);
        }

        //adding the surcharges & converting to floor value [using explicit type casting]
        int bill = (int)(1.2 * ans);
        System.out.println(bill);
        
    }
}