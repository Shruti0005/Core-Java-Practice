package If_Else;

import java.util.Scanner;

public class LastDigitIs5 {
    public static void main(String[] args) {
        //Check the last digit is 5 or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int num = sc.nextInt();

        if (num % 10 == 5) {
            System.out.println(num + " last digit is 5");
        }
        else{
            System.out.println(num + " last digit not 5");
        }
        sc.close();
    }
}
