package Switch;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charcter");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println("It is a vowel character");
                break;
            case 'e':
                System.out.println("It is a vowel character");
                break;
            case 'i':
                System.out.println("It is a vowel character");
                break;
            case 'o':
                System.out.println("It is a vowel character");
                break;
            case 'u':
                System.out.println("It is a vowel character");
                break;
            case 'A':
                System.out.println("It is a vowel character");
                break;
            case 'E':
                System.out.println("It is a vowel character");
                break;
            case 'I':
                System.out.println("It is a vowel character");
                break;
            case 'O':
                System.out.println("It is a vowel character");
                break;
            case 'U':
                System.out.println("It is a vowel character");
                break;
            default:
                System.out.println("It is a Consonant value");
                break;
        }
        sc.close();
    }
}
