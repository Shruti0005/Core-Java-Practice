package If_Else;

import java.util.Scanner;

public class PrintLastDigit {
    public static void main(String[] args) {
        //Print last digit of the number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int num = sc.nextInt();

        int result = num % 10;
        System.out.println(num+ " last digit is " +result);
        sc.close();
    }
}
