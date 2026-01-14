package Loops;

import java.util.Scanner;

public class Loop31 {
    public static void main(String[] args) {
        //WAP TO CHECK WHETHER SUMATION OF THE NUMBER IS EVEN OR ODD ?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int res = num % 10;
            sum = sum + res;
            num = num/10;
        }
        if (sum % 2 == 0) {
            System.out.println(sum + " is a even number");
        }
        else{
            System.out.println(sum + " is a odd number");
        }
        sc.close();
    }
}
