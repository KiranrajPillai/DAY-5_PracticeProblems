package day5;

import java.util.Scanner;

/**
 *
 * @author my
 */
public class Powerof2 {
    public static void main(String[] args) {
        System.out.print("Enter a number of the power: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x=2;
        System.out.println(x);
        for(int i=1;i<=n-1;i++){
            x=(x*2);
            System.out.println(x);
        }
    }
}
