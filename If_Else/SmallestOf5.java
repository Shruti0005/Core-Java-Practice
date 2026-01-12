package If_Else;

import java.util.Scanner;

public class SmallestOf5 {
    public static void main(String[] args) {
        //print smallest of 5 number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();
        System.out.println("Enter the third value");
        int c = sc.nextInt();
        System.out.println("Enter the fourth value");
        int d = sc.nextInt();
        System.out.println("Enter the fifth value");
        int e = sc.nextInt();

        if (a < b && a < c && a < d && a < e) {
            System.out.println(a);
        }
        else if (b < a && b < c && b < d && b < e) {
           System.out.println(b); 
        }
        else if (c < a && c < b && c < d && c < e) {
            System.out.println(c);
        }
        else if (d < a && d < b && d < c && d < e) {
            System.out.println(d);
        }
        else if (e < a && e < b && e < c && e < d) {
            System.out.println(e);
        }
        
        sc.close();
    }
}
