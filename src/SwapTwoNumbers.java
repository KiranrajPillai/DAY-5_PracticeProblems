import java.util.Scanner;

public class SwapTwoNumbers {
    public void swapd(int n){
        int fd,sd,rem,q;
        rem= n%10;
        q = n/10;
        System.out.print(""+rem+q+" ");
    }
    public static void main(String[] args) {
        SwapTwoNumbers x = new SwapTwoNumbers();
        System.out.print("Enter 2 numbers: ");
        Scanner s = new Scanner (System.in);
        int fno = s.nextInt();
        int sno = s.nextInt();
        x.swapd(fno);
        x.swapd(sno);
        int t;
        System.out.println("\nBefore swapping numbers: "+fno +"  "+ sno);
        t = fno;
        fno = sno;
        sno = t;
        System.out.println("After swapping: "+fno +"   " + sno);

    }
}
