package Patterns;

import java.util.Scanner;

public class Star22 {
    public static void main(String[] args) {
         //Print right pascal's triangle
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        //Upper right pascal's tringle part
        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower right pascal's  triangle 
        for (int i = 1; i <= star-1; i++) {
            for (int j = star-1; j >=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
