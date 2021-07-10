import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        System.out.print("Enter Dividend and Divisor: ");
        Scanner s = new Scanner (System.in);
        int dividend = s.nextInt();
        int divisor = s.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}

