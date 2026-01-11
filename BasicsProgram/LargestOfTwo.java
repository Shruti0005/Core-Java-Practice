package BasicsPrograms;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        //LARGEST OF TWO NUMBERS WITH THE HELP OF CONDITIONAL OPERATOR
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        String result = a > b ? "The largest number is a = " + a : "The largest number is b = "+b;
        System.out.println(result);
        sc.close();
    }
}
