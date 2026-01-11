package BasicsPrograms;

import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args) {
        //swap two variable using third variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int c ;
        c = a;
        a = b;
        b = c;
        System.out.println("a = "+a+"\nb = "+ b);
        sc.close();
    }
}
