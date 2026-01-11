package ConditionalOperator;

import java.util.Scanner;

public class LargestOf5 {
    public static void main(String[] args) {
        //Print largest of 5 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();
        System.out.println("Enter the third value");
        int c = sc.nextInt();
        System.out.println("Enter the four value");
        int d = sc.nextInt();
        System.out.println("Enter the five value");
        int e = sc.nextInt();
        int result = a > e ? ((a > d) ? (a > c ? (a > b ? a : b) : (b > c ? b : c)) : (d > c ? (d > b ? d : b) : (d > c ? d : c))) : 
                             ((e > d) ? (e > c ? (e > b ? e : b) : (b > c ? b : c)) : (d > c ? (d > b ? d : b) : (d > c ? d : c))); 
        System.out.println(result);
        sc.close();
    }
}
