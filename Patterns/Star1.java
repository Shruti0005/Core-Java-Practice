package Patterns;

import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {
        //Print Square pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        
        for (int i = 1; i <= star; i++) { 
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
