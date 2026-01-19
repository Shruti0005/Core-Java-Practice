package Recursion;

import java.util.Scanner;

public class Recursion10 {
    //Sum of digits
    public int sumDigit(int n){
        if (n == 0) {
            return 0;
        }

        return (n%10) + sumDigit(n/10);
    }

    //Count digits of sum
    public int countSum(int sum){
        if (sum == 0) {
            return 0;
        }
        return 1 + countSum(sum/10);
    }
    public static void main(String[] args) {
        //Print sum of digit and count of sum
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        //create object because methods are not-static
        Recursion10 r = new Recursion10();
        int sum = r.sumDigit(num);

        int count;
        // If sum is 0, force count = 1
        if(sum == 0){
            count = 1;
        }
        else{
            count = r.countSum(sum);
        }

        System.out.println("Sum = "+ sum);
        System.out.println("Count of digits in sum = " + count);
        sc.close();
    }
}
