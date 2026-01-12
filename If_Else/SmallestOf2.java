package If_Else;

import java.util.Scanner;

public class SmallestOf2 {
    public static void main(String[] args) {
        //Check smallest of two number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("The first value is smallest value");
        }
        else{
            System.out.println("The second value is smallest value");
        }
        sc.close();
    }
}
