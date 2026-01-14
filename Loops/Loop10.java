package Loops;

import java.util.Scanner;

public class Loop10 {
    public static void main(String[] args) {
        //WAP TO EVEN NUMBERS BETWEEN M AND N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = m; i<=n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            } 
        }
        sc.close();
    }
}
