package Loops;

import java.util.Scanner;

public class PrintPerfectNumGivenPostion {
    public static void main(String[] args) {
        //WAP TO PRINT PERFECT NUMBER BY READING IT'S POSITION OF NUMBER ?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postion: ");
        int n = sc.nextInt();

        int i = 2;
        int count = 0;
        while (true){
            int sum = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
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
