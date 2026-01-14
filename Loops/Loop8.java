package Loops;

import java.util.Scanner;

public class Loop8 {
    public static void main(String[] args) {
        //WAP TO PRINT THE ALPHABET BY READING NUMBER ?EX: I/P: 5 O/P: E I/P: 25 O/P: Y
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 26:");
        int n = sc.nextInt();
        char ch = 'A';
        if (n > 0 && n < 27) {
            for (int i = 1; i < n; i++) {
                ch++;
            }
            System.out.println(ch);
        }
        else{
            System.out.println("Invalid number!");
        }
        sc.close();
    }
}
