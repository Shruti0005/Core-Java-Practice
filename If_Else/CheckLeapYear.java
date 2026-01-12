package If_Else;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        //Check whether leap year or not 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year in this form => XXXX ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year +" is not a leap year");
        }
        sc.close();
    }
}
