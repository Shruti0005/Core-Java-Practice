package Loops;

import java.util.Scanner;

public class PrimeNum1 {
    public static void main(String[] args) {
        // Check if it is Prime number or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();

        boolean check = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(num + " It's a Prime Number.");
        } else {
            System.out.println(num + " It's not a Prime Number.");
        }
        sc.close();
    }
}
