package If_Else;

import java.util.Scanner;

public class AscendingOrder3 {
    public static void main(String[] args) {
        //Print ascending order of three number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();
        System.out.println("Enter the third value");
        int c = sc.nextInt();
        
        if (a<b && b<c) {
            System.out.println(a+" "+b+" "+c);
        }
        else if (a<c && c<b) {
            System.out.println(a+" "+c+" "+b);
        }
        else if (b<c && c<a) {
            System.out.println(b+" "+c+" "+a);
        }
        else if (b<a && a<c) {
            System.out.println(b+" "+a+" "+c);
        }
        else if (c<b && b<a) {
            System.out.println(c+" "+b+" "+a);
        }
        else if (c<a && a<b) {
            System.out.println(c+" "+a+" "+b);
        }
        
        sc.close();
    }
}
