package BasicsPrograms;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        //CHECK SMALLEST OF THREE NUMBERS
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();
        System.out.println("Enter the third value");
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("The first value is smallest number "+a);
        }
        else if (b < a && b < c) {
            System.out.println("The second value is smallest number "+b);
        }
        else if (c < a && c < b) {
            System.out.println("The third value is smallest number "+c);
        }
        sc.close();
    }
}
