package Patterns;

import java.util.Scanner;

public class Star33 {
    public static void printStar(int star){
        if (star < 5 || star%2==0) {
            return;
        }
        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= star; j++) {
                if (i == j || i+j == star+1 || i == 1 || i == star|| j == 1|| j == star) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  more than 5 and odd value : ");
        int star = sc.nextInt();
        printStar(star);
        sc.close();
    }
}
