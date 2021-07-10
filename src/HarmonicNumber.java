import java.util.Scanner;

public class HarmonicNumber {
    static double nthHarmonic(int N){

        float harmonic = 1;

        for(int i = 2; i <= N; i++){
            harmonic += (float)1 / i;
        }
        return harmonic;
    }
    public static void main (String[] args) {
        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.print(nthHarmonic(N));
    }
}
