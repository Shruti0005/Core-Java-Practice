package ConditionalOperatior;

import java.util.Scanner;

public class SmallestOf4 {
    public static void main(String[] args) {
        //Print smallest of 4 number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();
        System.out.println("Enter the third value");
        int c = sc.nextInt();
        System.out.println("Enter the four value");
        int d = sc.nextInt();
        int result = a < d ? (a < c ? (a < b ? a : b) : (c < b ? c : b)) : (d < c ? (d < b ? d : b) : (c < b ? c : b));
        System.out.println(result);
        sc.close();
    }
}
