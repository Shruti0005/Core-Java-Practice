package Loops;

import java.util.Scanner;

public class Loop39 {
    public static void main(String[] args) {
        //Find numbers index prime index and print e.g. i/p = 12345 o/p = Prime: 34
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        int count = 0;
        while (num > 0) {
            int r = num % 10;
            count++;
            res = res * 10 + r;
            num = num / 10;
        }
        String prime = "";
        for (int i = 0; i < count; i++) {
            int r = res % 10;
            if (prime(i)) {
                prime = prime + r;
            }
            res = res / 10;
        }
        System.out.println(prime);
        sc.close();
    }
    public static boolean prime(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
