package ConditionalOperator;

import java.util.Scanner;

public class SmallestOf7 {
    public static void main(String[] args) {
        //Print smallest of 7 number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();
        System.out.println("Enter the third value");
        int c = sc.nextInt();
        System.out.println("Enter the four value");
        int d = sc.nextInt();
        System.out.println("Enter the five value");
        int e = sc.nextInt();
        System.out.println("Enter the six value");
        int f = sc.nextInt();
        System.out.println("Enter the seven value");
        int g = sc.nextInt();
        int result = a < g ? ((a < f) ? ((a < e) ? ((a < d) ? ((a < c) ? (a < b ? a : b) : (c < b ? c : b)) : ((d < c) ? (d < b ? d : b) : (c < b ? c : b))) : 
                                                   ((e < d) ? ((e < c) ? (e < b ? e : b) : (c < b ? c : b)) : ((d < c) ? (d < b ? d : b) : (c < b ? c : b)))):
                                        ((f < e) ? ((f < d) ? ((f < c) ? (f < b ? f : b) : (c < b ? c : b)) : ((d < c) ? (d < b ? d : b) : (c < b ? c : b))) : 
                                                   ((e < d) ? ((e < c) ? (e < b ? e : b) : (c < b ? c : b)) : ((d < c) ? (d < b ? d : b) : (c < b ? c : b))))):
                             ((g < f) ? ((g < e) ? ((g < d) ? ((g < c) ? (g < b ? g : b) : (c < b ? c : b)) : ((d < c) ? (d < b ? d : b) : (c < b ? c : b))) : 
                                                   ((e < d) ? ((e < c) ? (e < b ? e : b) : (c < b ? c : b)) : ((d < c) ? (d < b ? d : b) : (c < b ? c : b)))):
                                        ((f < e) ? ((f < d) ? ((f < c) ? (f < b ? f : b) : (c < b ? c : b)) : ((d < c) ? (d < b ? d : b) : (c < b ? c : b))) : 
                                                   ((e < d) ? ((e < c) ? (e < b ? e : b) : (c < b ? c : b)) : ((d < c) ? (d < b ? d : b) : (c < b ? c : b))))); 
        System.out.println(result + " is the smallest number.");
        sc.close();
    }
}

