package Loops;

import java.util.Scanner;

public class Loop18 {
    public static void main(String[] args) {
        //WAP TO PRINT TABLE BY READING USER INPUT ?
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            int result = input * i;
            System.out.println(result);
        }
        sc.close();
    }
}
