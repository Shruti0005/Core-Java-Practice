package If_Else;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //Check given number is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is a even number");
        }
        else{
            System.out.println(num + " is a odd number");
        }
        sc.close();
    }
}
