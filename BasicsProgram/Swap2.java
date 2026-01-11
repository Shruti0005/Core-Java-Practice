package BasicsPrograms;

import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        //Swap two variable without using third variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "+a+"\nb = "+b);
        sc.close();
    }
}
