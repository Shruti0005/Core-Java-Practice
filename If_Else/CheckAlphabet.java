package If_Else;

import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        //Check whether a character is alphabet or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        if (('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z')) {
            System.out.println("Character is a Alphabet");
        }
        else{
            System.out.println("Character is not a Alphabet");
        }
        sc.close();
    }
}
