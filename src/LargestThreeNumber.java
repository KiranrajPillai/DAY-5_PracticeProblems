import java.util.Scanner;

public class LargestThreeNumber {
    public static void main(String[] args) {
        System.out.println("Enter three numbers:: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int largest;
        if((a>b) && (a>c)){
            System.out.println(a+" is the largest.");
        }
        else if((b>a) && (b>c)){
            System.out.println(b+" is the largest.");
        }
        else{
            System.out.println(c+" is the largest.");
        }
    }
}
