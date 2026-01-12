package If_Else;

import java.util.Scanner;

public class CheckSpecialChar {
    public static void main(String[] args) {
        //Check wheter a given character is a specia; character or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        if ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z') || (ch>='1' && ch<='9')) {
            System.out.println("Charater is not a Special Character");
        }
        else{
            System.out.println("Charater is a Special Character");
        }
        sc.close();
    }
}
