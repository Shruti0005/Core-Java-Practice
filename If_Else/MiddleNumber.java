package If_Else;

import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        //Print middle number from 3 number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();
        System.out.println("Enter the third value");
        int c = sc.nextInt();
        if ((a>b && a<c)||(a>c && a<b)) {
            System.out.println(a);
        }
        else if ((b>a && b<c)||(b>c && b<a)) {
            System.out.println(b);
        }
        else if ((c>a && c<b)||(c>b && c<a)) {
            System.out.println(c);
        }
        sc.close();
    }
}
