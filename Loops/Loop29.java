package Loops;

import java.util.Scanner;

public class Loop29 {
    public static void main(String[] args) {
        //WAP TO PRINT THE NUMBER FROM THE LAST UNIT PLACE ?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int lastUnitDigit = num % 10;
        System.out.println(lastUnitDigit);
        sc.close();
    }
}
