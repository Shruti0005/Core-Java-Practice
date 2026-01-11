package BasicsPrograms;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        //CHECK LARGEST OF THREE NUMBERS
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();
        System.out.println("Enter the third value");
        int c = sc.nextInt();
       
        if (a > b && a > c) {
            System.out.println("First value is a largest number "+a);
        }
        else if (b > a && b > c) {
            System.out.println("Second value is a largest number "+b);
        }
        else if (c > b && c > a) {
            System.out.println("Third value is a largest number "+c);
        }
        sc.close();
    }
}
