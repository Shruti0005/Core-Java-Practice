package If_Else;

import java.util.Scanner;

public class AsciiISEvenOrOdd {
    public static void main(String[] args) {
        //Check whether a given character is a special character or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        if (ch % 2 == 0) {
            System.out.println(ch +" is a even ASCII");
        }
        else{
            System.out.println(ch +" is a odd ASCII");
        }
        sc.close();
    }
}
