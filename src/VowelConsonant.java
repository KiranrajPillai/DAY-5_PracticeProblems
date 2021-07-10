import java.util.Scanner;

public class VowelConsonant {
    public void findVowelOrNot(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Entered character "+ch+" is  Vowel");
        }
        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Entered character "+ch+" is Consonent");
        else
            System.out.println("Not an alphabet");
    }
    public static void main(String[ ] arg){
        VowelConsonant c=new VowelConsonant();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char n = s.next( ).charAt(0);
        c.findVowelOrNot(n);
    }
}

