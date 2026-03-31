package Loops;

import java.util.Scanner;

public class PrintSpyNumGivenPostion {
    public static void main(String[] args) {
        //WAP TO PRINT SPY NUMBER BY READING IT'S POSITION OF NUMBER ?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postion: ");
        int n = sc.nextInt();
        
        int i = 1;
        int count = 0;
        while (true) {
            int sum = 0;
            int pro = 1;
            int temp = i;
            while (temp > 0) {
                int rev = i % 10;
                sum += rev;
                pro *= rev;
                temp /= 10;
            }
            if (sum == pro) {
                count++;
            }
            if (count == n) {
                System.out.println(i);
                break;
            }
            i++;
        }
        sc.close();
    }
}
