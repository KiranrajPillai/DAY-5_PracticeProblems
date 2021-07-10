import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner s = new Scanner (System.in);
        int num = s.nextInt();

        if(num%2==0){
            System.out.println(num+" is an even number.");
        }
        else{
            System.out.println(num+" is an odd number.");
        }
    }
}